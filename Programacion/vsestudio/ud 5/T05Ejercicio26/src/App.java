import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        String number = s.nextLine();

        System.out.println("Ingrese un dígito:");
        char digit = s.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                count++;
                System.out.println("La posición " + (i + 1) + " ocupa ese dígito.");
            }
        }

        if (count == 0) {
            System.out.println("El dígito ingresado no se encuentra en el número.");
        }

        s.close();
    }
}
