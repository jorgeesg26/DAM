import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);
        System.out.println("Dime la hora y minutos");
        double hora=s.nextDouble();
        double minutos=s.nextDouble();
        double segundos=hora*3600+minutos*60;
        if (hora==0 && minutos==0) {
            System.out.println("Ya es medianoche");
        } else 
        System.out.println("Para llegar a medianoche hacen falta "+(86400-segundos)+" segundos");
        
        s.close();
    }
}
