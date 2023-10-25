import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca dos números: ");
double n1= s.nextDouble();
double n2= s.nextDouble();
double multiplicación = n1*n2;
System.out.println("La multiplicación de los dos numeros es: "+multiplicación);
s.close();

    }
}
