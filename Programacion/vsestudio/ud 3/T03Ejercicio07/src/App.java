import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca el precio y el iva ");
double precio= s.nextDouble();
double IVA= s.nextDouble();
double precioconiva = precio*IVA;
System.out.println("El precio con IVA es: "+precioconiva);
s.close();
 
    }
    }