import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca el radio y la altura del cono: ");
double radio= s.nextDouble();
double altura= s.nextDouble();
double volumen = (Math.PI*radio*radio*altura )/3;
System.out.println("La area del triángulo es: "+volumen);
s.close();

    }
    } 