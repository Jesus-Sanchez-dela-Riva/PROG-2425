//Jesús Sánchez de la Riva
package U07_A07;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Texto {
    private String cadena;
    private final int long_Max;
    LocalDate creaccion;
    LocalDateTime ultimaMod;
    static final String vocales="aeiouáéíóú";

    public Texto(int long_Max) {
        cadena="";
        this.long_Max = long_Max;
        creaccion=LocalDate.now();
        ultimaMod=null;
    }
    public void addDetras(char a){
        if(long_Max>cadena.length()){
            cadena=cadena+a;
            ultimaMod=LocalDateTime.now();
        }
    }
    public void addDetras(String a){
        if(long_Max>cadena.length()){
            cadena=cadena+a;
            ultimaMod=LocalDateTime.now();
        }
    }
    public void addAlante(char a){
        if(long_Max>cadena.length()){
            cadena=a+cadena;
            ultimaMod=LocalDateTime.now();
        }
    }
    public void addAlante(String a){
        if(long_Max>cadena.length()){
            cadena=a+cadena;
        }
    }
    public int numeroVocales(){
        int vocal=0;
        for(int i=0; i<cadena.length(); i++){
            if(esVocal(cadena.charAt(i))){
                vocal++;
            }
        }
        return vocal;
    }
    private boolean esVocal(char a){
        boolean vocal=false;
        a = Character.toLowerCase(a);
        if(vocales.indexOf(a)!=-1){
            vocal=true;
        }
        return vocal;
    }
    public void mostrar(){
        System.out.println("Texto: "+cadena);
        System.out.println("Creado el: "+creaccion);
        System.out.println("Ultiam modificacion hecha: "+ultimaMod);
    }
    
    
}
