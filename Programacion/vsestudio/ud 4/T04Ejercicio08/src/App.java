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
        double notamedia=(nota1+nota2+nota3)/3;
        System.out.println("La nota media es:"+notamedia );
        if (notamedia<5) {
            System.out.println("La nota media esta suspensa");
            
        } else
            if (notamedia<6) {
            System.out.println("La nota media es suficiente");
        } else
            if (notamedia<7) {
            System.out.println("La nota media es un bien");
        } else
            if (notamedia<9) {
            System.out.println("La nota media es notable");
        } else
            if (notamedia<10) {
            System.out.println("La nota media es sobresaliente");
        }
        
        s.close();
    }
}