//Jesús Sánchez de la Riva
package U07_A05;

public class Main {
    public static void main(String[] args){
        Gestor g1 = new Gestor("Antonio", "+34 655482971", 20000);
        Gestor g2 = new Gestor("Eustaquio", "+34 694218743");
        CuentaCorriente c1, c2;
        c1 = new CuentaCorriente("04875214E", "Sergio", g1);
        c2 = new CuentaCorriente("05789461D","Carlos", g2);
        System.out.println("C1");
        c1.setBanco("Banco Internacional Español");
        System.out.println("Banco de la primera cuenta: "+c1.getBanco());
        System.out.println(c1.mostrarInformacion());
        System.out.println(g1.mostrarInformacion());
        System.out.println("C2");
        c2.setBanco("Banco Nacional De España");
        System.out.println("Banco de la segunda cuenta: "+c2.getBanco());
        System.out.println(c2.mostrarInformacion());
        System.out.println(g2.mostrarInformacion());
    }
}
