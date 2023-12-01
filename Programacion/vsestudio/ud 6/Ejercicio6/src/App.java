public class App {
public static void main(String[] args) {
int oportunidades = 5;
int numero;
boolean acertado = false;
int numeroMisterioso = (int)(Math.random() * 101);
System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
do {
System.out.print("Introduce un número: ");
numero = Integer.parseInt(System.console().readLine());
oportunidades--;
if ( (numero > numeroMisterioso) && (oportunidades > 0) ){
System.out.println("El número que estoy pensando es menor que " + numero);
System.out.println("Te quedan " + oportunidades + " oportunidades.");
}
if ( (numero < numeroMisterioso) && (oportunidades > 0) ){
System.out.println("El número que estoy pensando es mayor que " + numero);
System.out.println("Te quedan " + oportunidades + " oportunidades.");
}
if (numero == numeroMisterioso) {
acertado = true;
System.out.println("¡Enhorabuena! ¡has acertado!");
}
} while (!acertado && (oportunidades > 0));
if (!acertado) {
System.out.println("Lo siento, no has acertado, el número que estaba pensando era el " +numeroMisterioso);
}
    }
}
