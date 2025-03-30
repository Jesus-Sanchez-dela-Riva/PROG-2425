//Jesús Sánchez de la Riva
package U07_A06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        Hora h1=new Hora();
        System.out.println("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int segundos = sc.nextInt();
        System.out.println("Cuantas veces quiere que se muestre sumando un segundo cada vez: ");
        int n = sc.nextInt();
        Hora miHora = new Hora(hora, minutos, segundos);
        
        System.out.println("Estas son las horas que se han generado, a patir de la que has metido: ");
        for(int i=0; i<=n; i++){
            miHora.mostrarHora();
            miHora.aumentarSegundos();
        }   
    }
}
