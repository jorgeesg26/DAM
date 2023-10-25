
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("dime el dia de la semana (1-5)");
        int semana = Integer.parseInt(System.console().readLine());
        switch (semana) {
case 1:
System.out.println("En el lunes hay sistemas informaticos a primera");
break;
case 2:
System.out.println("En el martes hay sistemas informaticos a primera");
break;
case 3:
System.out.println("En el miercoles hay base de datos a primera");
break;
case 4:
System.out.println("En el jueves hay base de datos a primera");
break;
case 5:
System.out.println("En el viernes hay lenguaje de marcas a primera");
break;

        }
    }
}
