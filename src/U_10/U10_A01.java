//Jesús Sánchez de la Riva
package U_10;
import java.util.Scanner;
public class U10_A01 {
    public static Integer leerEntero(){
        Scanner sc = new Scanner(System.in);
        Integer numero=null;
        while(true){
            System.out.println("Introduce un numero entero: ");
            String n=sc.nextLine();
            try{
                numero = Integer.parseInt(n);
                break;
            }catch(NumberFormatException e){
                System.out.println("Error, no has metido un numero entero, vas a tener que volver a meter un numero");
            }
        }
        return numero;
    }
    public static void main(String[] args){
        Integer leido=leerEntero();
        System.out.println("Este es el resultado: "+leido);
    }
}
