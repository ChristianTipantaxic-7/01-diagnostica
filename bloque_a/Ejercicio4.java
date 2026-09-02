public class Ejercicio4 {
    public static void main(String[] args) {
        // CHECK: Imprimir números del 1 al 20 usando bucle 'for'
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        // CHECK: Imprimir números del 20 al 1 usando bucle 'while'
        int i = 20;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}