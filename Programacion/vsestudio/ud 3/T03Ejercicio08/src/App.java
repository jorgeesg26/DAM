import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado: ");
double horas= s.nextDouble();
double precio= 12;
double area = horas*precio;
System.out.println("Tu salario de esta semana es: "+area);
s.close();

    }
    }

