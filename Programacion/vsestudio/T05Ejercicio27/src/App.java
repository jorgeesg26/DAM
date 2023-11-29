import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int number = s.nextInt();

        int contador = 0;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                contador++;
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Total de múltiplos de 3: " + contador);
        System.out.println("Suma de múltiplos de 3: " + sum);
    s.close();
    }
}