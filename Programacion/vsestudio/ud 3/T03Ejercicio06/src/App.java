import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca la base y la altura del triangulo: ");
double base= s.nextDouble();
double altura= s.nextDouble();
double area = base*altura/2;
System.out.println("La area del triángulo es: "+area);
s.close();

    }
}
