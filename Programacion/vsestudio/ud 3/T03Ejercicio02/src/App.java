import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, dime cuantos euros quieres que cambie a pesetas: ");
double n1= s.nextDouble();
double transformación = n1*166.386;
System.out.println("La multiplicación de los dos numeros es: "+transformación);
s.close();

    }
}