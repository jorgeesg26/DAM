import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.println("Introdúzcame la base");
        int base=s.nextInt();
        System.out.println("Introdúzcame el exponente");
        int exponente=s.nextInt();
        System.out.println("La potencia es: "+(int)Math.pow(base,exponente));
        s.close();
    }
}
