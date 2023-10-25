import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca cuantos Megabytes quieres que te transforme ");
double Mb= s.nextDouble();
double Kb= Mb/1024;
System.out.printf("Esos Megabytes son  %f",Kb);
s.close();
}
}