//Jesús Sánchez de la Riva
package U_10;
import java.io.*;
public class U10_A03 {
    public static void main(String[] args){
        BufferedReader in = null;
        try{
            in=new BufferedReader(new FileReader("C:\\Users\\jesus\\OneDrive\\Documentos\\NetBeansProjects\\PROG-24_25\\src\\U_10\\Main.java"));
            String letras;
            while((letras=in.readLine())!= null){
                System.out.print(letras+"\n");
            }
        }catch(IOException ex){
            System.out.println("Ha ocurrido un error al leer: "+ex.getMessage());
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
