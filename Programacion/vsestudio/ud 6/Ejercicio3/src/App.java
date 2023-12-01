public class App {

  public static void main(String[] args) {
    String palo = "";
    String carta = "";
    int numeroPalo = (int) (Math.random() * 4) + 1;
    switch (numeroPalo) {
      case 1:
        palo = "oro";
        break;
      case 2:
        palo = "bastón";
        break;
      case 3:
        palo = "copa";
        break;
      case 4:
        palo = "espada";
      default:
    }
    int numeroCarta = (int) (Math.random() * 11) + 1;
    switch (numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "sota";
        break;
      case 9:
        carta = "caballo";
        break;
      case 10:
        carta = "rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    System.out.println(carta + " de " + palo);
  }
}
