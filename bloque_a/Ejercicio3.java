import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // CHECK: Leer la edad con Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // CHECK: Evaluar con if / else si es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        scanner.close();
    }
}