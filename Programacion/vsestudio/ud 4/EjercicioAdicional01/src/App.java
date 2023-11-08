import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Dime la hora de 0-24");
        int hora=s.nextInt();
            if (hora<=12) {
                System.out.println("Buenos dias");
        }else 
            if (hora<=20) {
                System.out.println("Buenas tardes"); 
        }else
        if (hora<=24) {
                System.out.println("Buenas Noches");
        }else
            System.out.println("Esa hora no es válida, por favor vuelva a introducir una hora");
        s.close();
    }
}
