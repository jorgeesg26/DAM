import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca cuantos Kilobytes quieres que te transforme :");
double Kb= s.nextDouble();
double Mb= Kb*1024;
System.out.printf("Esos Kilobytes son  %f",Mb);
s.close();
}
}