import java.util.Scanner;

public class App {

public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("Introdúzcame la base");
    int base = s.nextInt();
    System.out.println("Introdúzcame el exponente");
    int exponente = s.nextInt();
    int i = base;
    
    while (i <= exponente) {
        int contadorPotencia=base*i;
        System.out.println(base+"^"+i+"="+contadorPotencia);
        i*=base;
    }
    s.close();
}
}
