import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime una hora (0-24)");
        double hora = s.nextDouble();
        if (hora>=6 && hora<=12){
        System.out.println("Buenos dias");
        } else{ if (hora>=13 && hora<=20){
        System.out.println("Buenas tardes");
        } else {
        if   ((hora>=21 && hora<=24) || (hora>=0 && hora<=5)){
            System.out.println("Buenas noches ye ");
        } else {
            System.out.println("no existe esa hora " );
        }
        }
        s.close();
    }
}
}