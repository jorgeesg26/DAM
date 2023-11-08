import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        double numero = s.nextDouble();

        double ultimaCifra = Math.abs(numero % 10);

        System.out.printf("La última cifra del número es: %.0f", ultimaCifra);

        s.close();
    }
}
