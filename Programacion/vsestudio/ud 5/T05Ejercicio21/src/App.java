import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalNumeros = 0;
        int sumaDeImpares = 0;
        int maxPar = Integer.MIN_VALUE;
        int num;

        do {
            System.out.println("Ingrese un número:");
            num = s.nextInt();

            if (num < 0) {
                break;
            }

            totalNumeros++;

            if (num % 2 != 0) {
                sumaDeImpares += num;
            } else {
                if (num > maxPar) {
                    maxPar = num;
                }
            }
        } while (true);

        if (totalNumeros > 0) {
            System.out.println("Total números: " + totalNumeros);
            System.out.println("Promedio de impares: " + ((double) sumaDeImpares / totalNumeros));
            System.out.println("Número par máximo: " + maxPar);
        } else {
            System.out.println("No se ingresaron números.");
        }
    s.close();
    }
}