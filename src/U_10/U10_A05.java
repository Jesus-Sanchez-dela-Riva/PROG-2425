//Jesús Sánchez de la Riva
package U_10;
import java.io.*;
public class U10_A05 {
    public static void main(String[] args){
        BufferedWriter in=null;
        try{
            in=new BufferedWriter(new FileWriter("C:\\Users\\jesus\\OneDrive\\Documentos\\NetBeansProjects\\PROG-24_25\\src\\U_10\\Quijote.txt"));
            String linea1="\"En un lugar de La Mancha,";
            for (int i=0; i<linea1.length(); i++){
                in.write(linea1.charAt(i));
            }
            in.newLine();
            String linea2= "de cuyo nombre no quiero acordarme\"";
            in.write(linea2);
            System.out.println("Se ha introducido el texto en el archivo");
        }catch(IOException ex){
            System.out.println("Error al escribir las cosas en el archivo: "+ex.getMessage());
        }finally{
            try{
                if(in!=null){
                    in.close();
                }
            }catch(IOException ex){
                System.out.println("No se ha podido cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}
