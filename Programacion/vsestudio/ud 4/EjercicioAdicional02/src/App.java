import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        System.out.println("Dime un número del 1 al 7 y te digo el dia de la semana correspondiente");
        int dia=s.nextInt();
        switch (dia) {
            case 1:
               System.out.println("Hoy es Lunes"); 
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sabado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("Por favor, escribe un número del 1 al 7");
                break;
        }
        s.close();
    }
}
