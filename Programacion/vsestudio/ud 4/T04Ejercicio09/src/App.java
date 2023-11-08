import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Vamos a hacer una ecuación de segundo grado, dime el valor de a: ");
        double a =s.nextDouble();
        System.out.println("Ahora, dime el valor de b: ");
        double b=s.nextDouble();
        System.out.println("Para terminar, dime el valor de c: ");
        double c=s.nextDouble();
        if (a==0 && b!=0) {
            System.out.println("El resultado de la ecuación es: "+(-c/b) );
        }else
        if (a==0 && b==0) 
        {System.out.println("El resultado de la ecuación es:" +Math.sqrt(-c));
        } else 
        if (c==0) {
            System.out.println("");
        }
        s.close();
    }
}
