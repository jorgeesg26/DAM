import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        System.out.println("Introdúceme un número");
        int num=s.nextInt();
        s.close();
        int i;
        if (num<0) {
            System.out.println("Por favor, introdúceme un número positivo");
        } else if (num>0) {
            
        
        for ( i = 1; i <=100; i++) {
            num+=i;
            
        }
        System.out.println("La suma es "+num);
        }
    }
}
