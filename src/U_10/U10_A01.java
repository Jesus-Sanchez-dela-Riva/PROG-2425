//Jesús Sánchez de la Riva
package U_10;
import java.util.Scanner;
public class U10_A01 {
    public static Integer leerEntero(){
        Integer n=null;
        while(true){
            try{
                System.out.println("Introduce un numero entero: ");
                n=new Scanner(System.in).nextInt();
                break;
            }catch(Exception e){
                System.out.println("Error, no has metido un numero entero, vas a tener que volver a meter un numero");
            }
        }
        return n;
    }
    public static void main(String[] args){
        Integer leido=leerEntero();
        System.out.println("Este es el resultado: "+leido);
    }
}
