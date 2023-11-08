import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.println("Vamos a hacer la media de tres notas");
        System.out.println("La primera nota:");
        double nota1=s.nextDouble();
        System.out.println("La segunda nota:");
        double nota2=s.nextDouble();
        System.out.println("La tercera nota:");
        double nota3=s.nextDouble();
        System.out.println("La nota media es:"+(nota1+nota2+nota3)/3 );
        s.close();
    }
}
