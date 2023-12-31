import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("¿De qué altura quieres la pirámide? ");
    int altura = s.nextInt();
    System.out.print("¿De qué caracter quieres la pirámide? ");
    String caracter = s.next();

    for (int fila = 1; fila <= altura; fila++) {
      for (int espacio = 1; espacio <= altura - fila; espacio++) {
        System.out.print("  ");
      }

      for (int asterisco = 1; asterisco <= 2 * fila - 1; asterisco++) {
        System.out.print(caracter + " ");
      }

      System.out.println();
    }

    s.close();
  }
}
