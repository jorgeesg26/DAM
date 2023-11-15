import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzcame de cuantos números quieres que sea la serie de fibonacci");
        int numero =s.nextInt(); 
        s.close();
        System.out.println("Serie de Fibonacci hasta el término " + numero + ":");
        for (int i = 0; i < numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
