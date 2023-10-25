import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, dime cuantas pesetas quieres que cambie a euros: ");
double n1= s.nextDouble();
double transformación = n1/166.386;
System.out.println("Las pesetas que has dado son : "+transformación);
s.close();

    }
}