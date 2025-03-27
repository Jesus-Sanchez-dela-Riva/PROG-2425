//Jesús Sánchez de la Riva
package U07_A04;

public class CuentaCorriente {
    String DNI;
    String nombre;
    double saldo;
    CuentaCorriente(){
        this.DNI= "";
        this.nombre= "";
        this.saldo= 0.0;
    }
    CuentaCorriente(String DNI, String nombre, double saldoInicial){
        this.DNI=DNI;
        this.nombre=nombre;
        this.saldo=saldoInicial;
    }
    CuentaCorriente(String DNI, double saldoInicial){
        this(DNI,"",saldoInicial);
    }
    CuentaCorriente(String DNI, String nombre){
        this.DNI=DNI;
        this.nombre=nombre;
        this.saldo=0.0;
    } 
    
    
    boolean sacarDinero(double cantidad){
        if(cantidad<=0){
            System.out.println("La cantidad que desea retirar es indebida, debe ser mayor que 0");
            return false;
        }else if(saldo>=cantidad){
            saldo-=cantidad;
            System.out.println("Has podido retirar tu dinero. Tu nuevo saldo es: "+saldo+"€");
            return true;
        }else{
            System.out.println("El saldo es insuficiente");
            return false;
        }
    }
    void ingresarDinero(double cantidad){
        if(cantidad>0){
            saldo+=cantidad;
            System.out.println("El ingreso se ha realizado exitosamente. Tu nuevo saldo es: "+saldo+"€");
        }
        else{
            System.out.println("No se puede ingresar 0 euros o dinero negativo");
        }
    }
    void mostrarInformación(){
        System.out.println("Nombre del titular: "+nombre);
        System.out.println("DNI del titular: "+DNI);
        System.out.println("Saldo de la cuenta: "+saldo+"€");
    }
}
