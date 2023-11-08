import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Solicitar el precio de la entrada general
        System.out.println("Introduce el precio de la entrada general: ");
        double precioEntradaGeneral = s.nextDouble();

        // Menú para elegir entre palco o gallinero
        System.out.println("Elige el tipo de entrada: ");
        System.out.println("1. Palco");
        System.out.println("2. Gallinero");
        int tipoEntrada = s.nextInt();

        double precioFinal = 0.0;

        // Segundo menú para aplicar descuento, precio normal o sobreprecio
        if (tipoEntrada == 1) { // Palco
            System.out.println("Elige el tipo de público para el palco: ");
            System.out.println("1. Público con invitación (descuento del 10%)");
            System.out.println("2. Público local (precio normal)");
            System.out.println("3. Público foráneo (sobreprecio del 10%)");
            int tipoPublicoPalco = s.nextInt();

            switch (tipoPublicoPalco) {
                case 1:
                    precioFinal = precioEntradaGeneral - (precioEntradaGeneral * 0.10);
                    break;
                case 2:
                    precioFinal = precioEntradaGeneral;
                    break;
                case 3:
                    precioFinal = precioEntradaGeneral + (precioEntradaGeneral * 0.10);
                    break;
                default:
                    System.out.println("Opción no válida para el palco.");
                    s.close();
                    return;
            }
        } else if (tipoEntrada == 2) { // Gallinero
            System.out.println("Elige el tipo de público para el gallinero: ");
            System.out.println("1. Público con invitación (descuento del 5%)");
            System.out.println("2. Público local (precio normal)");
            System.out.println("3. Público foráneo (sobreprecio del 5%)");
            int tipoPublicoGallinero = s.nextInt();

            switch (tipoPublicoGallinero) {
                case 1:
                    precioFinal = precioEntradaGeneral - (precioEntradaGeneral * 0.05);
                    break;
                case 2:
                    precioFinal = precioEntradaGeneral;
                    break;
                case 3:
                    precioFinal = precioEntradaGeneral + (precioEntradaGeneral * 0.05);
                    break;
                default:
                    System.out.println("Opción no válida para el gallinero.");
                    s.close();
                    return;
            }
        } else {
            System.out.println("Opción de tipo de entrada no válida.");
            s.close();
            return;
        }

        System.out.println("El precio final de la entrada es: " + precioFinal);

        s.close();
    }
}
