import java.util.Scanner;

public class App {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce el primer número entero:");
    int num1 = s.nextInt();

    System.out.println("Introduce el segundo número entero:");
    int num2 = s.nextInt();

    System.out.println("Introduce el tercer número entero:");
    int num3 = s.nextInt();

    int cambio;

    if (num1 > num2) {
        cambio = num1;
        num1 = num2;
        num2 = cambio;
    }
    if (num2 > num3) {
        cambio = num2;
        num2 = num3;
        num3 = cambio;

    if (num1 > num2) {
        cambio = num1;
        num1 = num2;
        num2 = cambio;
    }
    }

    System.out.println(
    "Los números ordenados son: " + num1 + ", " + num2 + ", " + num3
    );

    s.close();
}
}
