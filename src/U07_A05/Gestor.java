// Jesús Sánchez de la Riva
package U07_A05;

public class Gestor {
    public String nombreGestor;
    private String telefono;
    double importeMax;

    public Gestor(String nombreGestor, String telefono, double importeMax) {
        this.nombreGestor = nombreGestor;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }
    public Gestor(String nombre, String telefono){
        this(nombre, telefono, 10000.00);
    }
    public String getTelefono(){
        return telefono;
    }
    String mostrarInformacion(){
        System.out.println("Información del gestor");
        return "Nombre del gestor: "+nombreGestor+ "\nImporte máximo del gestor: "+importeMax+"€";
    }
    
}
