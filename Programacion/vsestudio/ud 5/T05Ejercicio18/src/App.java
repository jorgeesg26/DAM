import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Introdúceme un número");
        int num1=s.nextInt();
        
        int num2=s.nextInt();
        s.close();
        int i;
        if (num1<num2) {
        for (i =num1+7; i <=num2; i+=7) {
            System.out.println(i);
            
        }
        }else
        for (i =num2+7; i <=num1; i+=7) {
            System.out.println(i);
            
        }
        s.close();
        
        
    }
}
