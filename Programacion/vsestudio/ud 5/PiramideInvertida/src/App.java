public class App {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la pirámide");
        int altura; 
        do {
            altura = Integer.parseInt(System.console().readLine());
        } while (altura<0);
        for ( int i = 1; i<=altura; i++) {
            for (int figura = 1; figura<=2*(altura-i)+1; figura++) {
                System.out.print("*");
            }
            System.out.println(" ");
            for (int espacios = 1; espacios<=(2*i)-i; espacios++) {
                System.out.print(" ");
            }
        }
    }
}