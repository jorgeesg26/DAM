import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.println("Por favor, introduzca el valor de a: ");
        double a= s.nextDouble();
        System.out.println("Por favor, introduzca el valor de b: ");
        double b= s.nextDouble();
        if (a==0)  {
            System.out.println("Lo siento, no se puede hacer la ecuación");
        } else  {
            if (b==0) {
                System.out.println("Lo siento, la ecuación no se puede hacer");
            }else {
                System.out.println("El valor de la ecuación es: "+(-b)/a);
        }
        }
        s.close();
    }
    }

