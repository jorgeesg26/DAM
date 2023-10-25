import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca la base y la altura: ");
double base= s.nextDouble();
double altura= s.nextDouble();
double area = base*altura;
System.out.println("La area del rectangulo es: "+area);
s.close();

    }
}
