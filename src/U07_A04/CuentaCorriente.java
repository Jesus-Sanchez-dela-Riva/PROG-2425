//Jesús Sánchez de la Riva
package U07_A04;

public class CuentaCorriente {
    static private String nombreBanco = "Banco Internacional Español";
    static void setBanco(String nuevoNombre){
        nombreBanco = nuevoNombre;
    }
    
    static String getBanco(){
        return nombreBanco;
    }
    String dni;
    public String nombre;
    private double saldo;

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
    void mostrarInformacion(){
        System.out.println("Nombre del titular: "+nombre);
        System.out.println("DNI del titular: "+dni);
        System.out.println("Saldo de la cuenta: "+saldo+"€");
    }

   CuentaCorriente(String dni, String nombre) { 
      this(dni, nombre, 0); 
   }

   CuentaCorriente(String dni, String nombre, double saldoInicial){
        this.dni=dni;
        this.nombre=nombre;
        this.saldo=saldoInicial;
    }
}
