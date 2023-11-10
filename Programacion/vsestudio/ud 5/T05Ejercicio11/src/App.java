import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num=s.nextInt();
        s.close();
        int cuadrado=num*num;
        int cubo=num*num*num;
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.print(""+(num+i)+" ");
            System.out.print(" "+(cuadrado+i)+" ");
            System.out.println(" "+(cubo+i));
        }
        
    }
}
