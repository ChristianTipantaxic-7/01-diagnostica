public class Ejercicio5 {

    // CHECK: Define la función estática calcularPromedio(double a, double b)
    public static double calcularPromedio(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        // CHECK: Prueba la función calcularPromedio
        double promedio = calcularPromedio(8.0, 10.0);
        System.out.println("Promedio: " + promedio);

        // CHECK: Instancia la clase Estudiante y llama a su método mostrarFicha()
        Estudiante estudiante = new Estudiante("Andres", 17, "Informática");
        estudiante.mostrarFicha();
    }
}

// CHECK: Crea aquí la clase Estudiante con sus atributos, constructor y métodos
class Estudiante {
    String nombre;
    int edad;
    String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}