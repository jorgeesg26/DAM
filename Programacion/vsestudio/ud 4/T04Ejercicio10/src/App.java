import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("DIme el dia que naciste");
        double dia= s.nextDouble();
        System.out.println("dime el mes que naciste");
        double mes=s.nextDouble();
        if (mes==1 && dia<=19) {
            System.out.println("Eres capricornio");
        }
    }
}
