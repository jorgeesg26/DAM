import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("¿De qué altura quieres la pirámide? ");
    int altura = scanner.nextInt();
    System.out.print("¿De qué caracter quieres la pirámide? ");
    String caracter = scanner.next();

    for (int fila = 1; fila <= altura; fila++) {
      for (int espacio = 1; espacio <= altura - fila; espacio++) {
        System.out.print("  ");
      }

      for (int asterisco = 1; asterisco <= 2 * fila - 1; asterisco++) {
        if (
          fila == 1 ||
          fila == altura ||
          asterisco == 1 ||
          asterisco == 2 * fila - 1
        ) {
          System.out.print(caracter + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    scanner.close();
  }
}
