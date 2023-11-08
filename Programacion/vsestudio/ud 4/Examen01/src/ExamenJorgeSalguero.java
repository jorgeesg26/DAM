import java.util.Scanner;

public class ExamenJorgeSalguero {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el tipo de producto");
    System.out.println("1.Alimentación");
    System.out.println("2.Electrónica");
    System.out.println("3.Farmacia");
    System.out.println("4.Moda");
    int elección = s.nextInt();
    //Aquí he hecho un switch para el menú
    switch (elección) {
      case 1:
        System.out.println("Introduzca el tipo de alimento");
        System.out.println("1.Huevos");
        System.out.println("2.Leche");
        System.out.println("3.Pan");
        System.out.println("4.Fruta");
        System.out.println("5.verdura");
        System.out.println("6.otros");
        int elecciónAlimento = s.nextInt();
        //Aquí he hecho un if para las seis primeras opciones porque pide lo mismo en esas seis y he hecho un else para la otra opción que cambia el iva
        if (
          (elecciónAlimento == 1) ||
          (elecciónAlimento == 2) ||
          (elecciónAlimento == 3) ||
          (elecciónAlimento == 4) ||
          (elecciónAlimento == 5)
        ) {
          System.out.println("Introduzca el nombre del producto: ");
          String nombreAlimentación = s.next();
          System.out.println("Introduzca la cantidad de producto: ");
          double cantidadAlimentación = s.nextDouble();
          System.out.println("Introduzca el precio del producto: ");
          double precioAlimentación = s.nextDouble();
          //como no sabía alinear las palabras al final, he hecho poniendo la palabra huevos
          System.out.println("Factura");
          System.out.println("---------------------------------------------");
          System.out.println(
            "Artículo                               " + nombreAlimentación
          );
          System.out.println(
            "Precio                                    " + precioAlimentación
          );
          System.out.println(
            "Cantidad                                  " + cantidadAlimentación
          );
          System.out.println(
            "Total                              " +
            precioAlimentación *
            cantidadAlimentación +
            " euros"
          );
          System.out.println(
            "IVA al 4%                         " +
            precioAlimentación *
            0.04 +
            " euros"
          );
          System.out.println("---------------------------------------------");
          System.out.println(
            "Total con IVA                      " +
            precioAlimentación *
            1.04 +
            " euros"
          );
        } else System.out.println("Introduzca el nombre del producto: ");
        String nombre = s.next();
        System.out.println("Introduzca la cantidad de producto: ");
        double cantidad = s.nextDouble();
        System.out.println("Introduzca el precio del producto: ");
        double precio = s.nextDouble();
        System.out.println("Factura");
        System.out.println("---------------------------------------------");
        System.out.println("Artículo                                " + nombre);
        System.out.println(
          "Precio                              " + precio + " euros"
        );
        System.out.println(
          "Cantidad                            " + cantidad + " euros"
        );
        System.out.println(
          "Total                               " + precio * cantidad + " euros"
        );
        System.out.print(
          "IVA al 10%                           " + precio * 0.1 + " euros"
        );
        System.out.println("---------------------------------------------");
        System.out.println(
          "Total con IVA                       " + precio * 1.1 + " euros"
        );

        break;
      case 2:
        System.out.println("Introduzca el nombre del producto: ");
        String nombreElectronica = s.next();
        System.out.println("Introduzca la cantidad de producto: ");
        double cantidadElectronica = s.nextDouble();
        System.out.println("Introduzca el precio por unidad del producto:");
        double precioElectronica = s.nextDouble();
        double precioConDescuentoElectronica = precioElectronica * 0.8;

        System.out.println("Factura");
        System.out.println("---------------------------------------------");
        System.out.println(
          "Artículo                                 " + nombreElectronica
        );
        System.out.println(
          "Precio                          " +
          precioElectronica +
          "euros/unidad"
        );
        System.out.println(
          "Cantidad                                 " + cantidadElectronica
        );
        System.out.println(
          "Total                              " +
          precioElectronica *
          cantidadElectronica +
          "euros"
        );
        System.out.println(
          "Descuento al 20%                         " +
          (-precioElectronica) *
          0.20
        );
        System.out.println(
          "Total con Descuento                      " +
          precioConDescuentoElectronica
        );
        System.out.println(
          "IVA al 21%                                " +
          precioConDescuentoElectronica *
          0.21
        );
        System.out.println("---------------------------------------------");
        System.out.println(
          "Total con IVA                           " +
          precioConDescuentoElectronica *
          1.21
        );
        break;
      case 3:
        System.out.println("Introduzca el nombre del producto: ");
        String nombreFarmacia = s.next();
        System.out.println("Introduzca la cantidad de producto: ");
        double cantidadFarmacia = s.nextDouble();
        System.out.println("Introduzca el precio por unidad del producto: ");
        double precioFarmacia = s.nextDouble();
        //igual que en la primera he puesto la palabra Farmacia
        System.out.println("Factura");
        System.out.println("---------------------------------------------");
        System.out.println(
          "Artículo                            " + nombreFarmacia
        );
        System.out.println(
          "Precio                       " + precioFarmacia + " euros/unidad"
        );
        System.out.println(
          "Cantidad                                  " + cantidadFarmacia
        );
        System.out.println(
          "Total                             " +
          precioFarmacia *
          cantidadFarmacia +
          " euros"
        );
        System.out.println(
          "IVA al 4%                          " +
          precioFarmacia *
          0.04 +
          " euros"
        );
        System.out.println("---------------------------------------------");
        System.out.println(
          "Total con IVA                      " +
          precioFarmacia *
          1.04 +
          " euros"
        );
        break;
      case 4:
        System.out.println("Introduzca el nombre del producto: ");
        String nombreModa = s.next();
        System.out.println("Introduzca la cantidad de producto: ");
        double cantidadModa = s.nextDouble();
        System.out.println("Introduzca el precio por unidad del producto: ");
        double precioModa = s.nextDouble();
        double descuentoModa = precioModa * (cantidadModa - cantidadModa / 3);
        double precioConDescuentoModa = precioModa - descuentoModa;
        //aquí he puesto la palabra
        System.out.println("Factura");
        System.out.println("---------------------------------------------");
        System.out.println(
          "Artículo                                 " + nombreModa
        );
        System.out.println(
          "Precio                         " + precioModa + "euros/unidad"
        );
        System.out.println(
          "Cantidad                                  " + cantidadModa
        );
        System.out.println(
          "Total                             " +
          precioModa *
          cantidadModa +
          " euros"
        );
        System.out.println(
          "Descuento al 3X2                            " + descuentoModa
        );
        System.out.println(
          "Total con Descuento                      " + precioConDescuentoModa
        );
        System.out.println(
          "IVA al 21%                              " +
          precioConDescuentoModa *
          0.21
        );
        System.out.println("---------------------------------------------");
        System.out.println(
          "Total con IVA                    " +
          precioConDescuentoModa *
          1.21 +
          " euros"
        );

        break;
    }

    s.close();
  }
}
