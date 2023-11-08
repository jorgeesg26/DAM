import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double precioTotal1 = 0.0;
        double precioTotal2 =0.0;
        System.out.println("¿Qué has tomado de comer? (palmera, donut o pitufo):");
        String comida = s.nextLine();

        if (comida.equals("palmera")) {
            precioTotal1 = 1.40;
        } else if (comida.equals("donut")) {
            precioTotal1 = 1.0;
        } else if (comida.equals("pitufo")) {
            System.out.println("¿Pitufo con aceite o tortilla?");
            String tipoPitufo = s.nextLine();
            if (tipoPitufo.equals("aceite")) {
                precioTotal1 = 1.20;
            } else if (tipoPitufo.equals("tortilla")) {
                precioTotal1 = 1.60;
            } else {
                System.out.println("Opción no válida para el pitufo.");
        s.close();
                return;
            }
        } else {
            System.out.println("Opción no válida para la comida.");
        s.close();
            return;
        }

        System.out.println("¿Qué has tomado de beber? (zumo o cafedonut):");
        String bebida = s.nextLine();

        if (bebida.equals("zumo")) {
            precioTotal2 = 1.50;
        } else if (bebida.equals("cafe")) {
            precioTotal2 = 1.20;
        } else {
            System.out.println("Opción no válida para la bebida.");
        s.close();
            return;
        }

        System.out.println("El precio total a pagar es: " + (precioTotal1+precioTotal2) );

        s.close();
    }
}

