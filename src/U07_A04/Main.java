//Jesús Sánchez de la Riva
package U07_A04;

public class Main {
    public static void main(String[] args){
        CuentaCorriente c1, c2;
        c1 = new CuentaCorriente("04875214E", "Sergio");
        c2 = new CuentaCorriente("05789461D","Carlos");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        CuentaCorriente.setBanco("Banco Internacional Español");
        System.out.println("Este es el banco: "+CuentaCorriente.getBanco());
        CuentaCorriente.setBanco("Banco Nacional De España");
        System.out.println("Este es el banco: "+CuentaCorriente.getBanco());
        c1.setBanco("Banco Internacional Español");
        System.out.println("Banco de la primera cuenta: "+c1.getBanco());
        c2.setBanco("Banco Nacional De España");
        System.out.println("Banco de la segunda cuenta: "+c2.getBanco());
    }    
}
