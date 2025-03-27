//Jes�s S�nchez de la Riva
package U07_A04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CuentaCorriente cC= new CuentaCorriente();
        Scanner sc=new Scanner(System.in);
        System.out.println("Vamos a crear una cuenta corriente, tienes que introducir tu DNI y el nombre del titular.");
        System.out.println("Ingresa el DNI: ");
        cC.DNI=sc.nextLine();
        System.out.println("Ingresa el nombre del titular: ");
        cC.nombre=sc.nextLine();
        System.out.println("Ingresa el saldo inicial: ");
        double saldoInicial=sc.nextDouble();
        cC.saldo=saldoInicial;
        System.out.println("Ahora vamos a ver que quieres hacer, sacar dinero, ingresar dinero o mostrar la informaci�n: ");
        for(int i=0; i<4;i++){
            System.out.println("Introduce la opci�n: \n 1-Sacar dinero\n 2-Ingresar dinero\n 3-Mostrar informaci�n\n 4-Salir");
            int opcion=sc.nextInt();
            double cantidad;
            switch(opcion){
                case 1->{
                    System.out.println("Has elegido sacar dinero, que cantidad quieres sacar: ");
                    cantidad=sc.nextDouble();
                    cC.sacarDinero(cantidad);
                }
                case 2->{
                    System.out.println("Has elegido ingresar dinero, que cantidad quieres ingresar: ");
                    cantidad=sc.nextDouble();
                    cC.ingresarDinero(cantidad);
                }
                case 3->{
                    System.out.println("Has elegido mostrar la informaci�n, esta es la informaci�n de la cuenta: ");
                    cC.mostrarInformaci�n();
                }
            }
            i=opcion;
        }
    }    
}
