import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Tienes que abrir una caja fuerte, necesitas  clave, tienes 4 oportunidades.");
        int contraseña=1245;
        int contraseñaIntroducida;
        int oportunidades=4;
        
        do {
            System.out.println("Te quedan " + oportunidades + " oportunidades, introduce la clave de 4 cifras: ");
            contraseñaIntroducida= s.nextInt();
            if (contraseñaIntroducida==contraseña) {
                System.out.println("Enhorabuena, has abierto la caja fuerte");
                oportunidades=0;
            } else {
                if (contraseñaIntroducida<1000 || oportunidades>9999) {
                    System.out.println("Te recuerdo que deben ser de 4 cifras");
                    oportunidades--;
                } else {
                    System.out.println("Lo siento, esa no es la clave");
                    oportunidades--;
                }
            }
        } while (oportunidades>0) ;
        s.close();
    }
}