//Jes�s S�nchez de la Riva
package U07_A07;

public class Main {
    public static void main(String[] args){
        Texto t = new Texto(50);
        t.mostrar();
        t.addAlante(" soy Jes�s");
        t.addDetras(" que tal,");
        t.addAlante("Me presento,");
        t.addDetras(" tengo 19 a�os y t�");
        t.mostrar();
        System.out.println("Este es el numero de vocales que hay: "+t.numeroVocales());
        
    }
}
