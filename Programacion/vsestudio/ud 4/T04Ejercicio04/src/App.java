import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Cuantas horas a la semana trabajas");
        double horas = s.nextDouble();
        if (horas<=40){
            System.out.println("Tu salario semanal es:"+ horas*12 );
            
        } else {
            
            double horasExtra = horas -40;
            System.out.println("Tu salario semanal es:"+ ((horasExtra*16)+480));
        }
    s.close();
    }
}
