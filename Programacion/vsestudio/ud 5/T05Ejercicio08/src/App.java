import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        System.out.println("Introduzca un número para que le podamos hacer la tabla de multiplicar");
        int numero=s.nextInt();
        System.out.println("A continuación te voy a hacer la tabla de multiplicar de "+numero);
        for (int i = 0; i <=10; i++) {
            System.out.println(numero*i);
        }
        s.close();
    }
}
