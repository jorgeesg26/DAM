import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.println("Vamos a calcular el tiempo que tarda en caer un objeto desde una altura");
        System.out.println("Dime la altura: ");
            double h=s.nextDouble();
            double g= 9.81;
        if (h==0) {
            System.out.println("No se puede calcular el tiempo ya que el objeto está en el suelo");
        } else {
            System.out.println("El tiempo que tarda en caer el objeto es:"+Math.sqrt(2*h/g));
        }
           
        s.close();
    }
}
