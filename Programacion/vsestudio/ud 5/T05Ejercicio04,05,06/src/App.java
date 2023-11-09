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
        for (i = 320; i >= 160; i -= 20) {
          System.out.println(i);
        }
        break;
      case 2:
        i = 320;
        while (i >= 160) {
          System.out.println(i);
          i -= 20;
        }
        break;
      case 3:
        i = 320;
        do {
          System.out.println(i);
          i -= 20;
        } while (i >= 160);
        break;
      default:
        System.out.println("Por favor , vuelva a introducir un número");
        break;
    }

    s.close();
  }
}
