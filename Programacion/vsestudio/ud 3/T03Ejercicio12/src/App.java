import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de los dos examenes ");
double nota1= s.nextDouble();
double nota2= s.nextDouble();
double notafinal=nota1*0.4+nota2*0.6;
System.out.printf("La nota final es3  %f",notafinal);
s.close();
}
}
