import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println(
      "con que metodo quieres hacerlo: (1)for (2)while(3)do while:"
    );
    int opcion = s.nextInt();
    int i;
    switch (opcion) {
      case 1:
        for (i = 5; i <= 100; i += 5) {
          System.out.println(i);
        }
        break;
      case 2:
        i = 0;
        while (i <= 100) {
          System.out.println(i);
          i += 5;
        }
        break;
      case 3:
        i = 0;
        do {
          System.out.println(i);
          i += 5;
        } while (i <= 100);
        break;
      default:
        System.out.println("Por favor , vuelva a introducir un número");
        break;
    }

    s.close();
  }
}
