public class App {
    public static void main(String[] args) throws Exception {
       int suma=0;
        for (int i = 1; i <=3 ; i++) {
        int dado=(int)(Math.random()*6+1);
    System.out.println(dado);
      suma +=dado;   
    }
        System.out.println("La suma es "+suma);
    }
}
 