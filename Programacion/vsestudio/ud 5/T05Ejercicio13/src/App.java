import java.util.Scanner;

public class App {

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int positivo = 0;
    int negativo = 0;
    System.out.println("Introdúzcame 10 números porfavor");
    for (int i = 0; i < 10; i++) {
        int numero = s.nextInt();
        if (numero < 0) {
        negativo++;
    } else {
        positivo++;
    }
    }
    System.out.println("Hay " + positivo + " números positivos");
    System.out.println("Hay " + negativo + " números negativos");
    s.close();
}
}
