import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 7");
        int numero =s.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;  
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;     
            default:
                System.out.println("Por favor, pon el numero entre el 1 y el 7");
                break;
        }s.close();
    }
    
}
