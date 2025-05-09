//Jesús Sánchez de la Riva
package U_10;
import java.io.*;
public class U10_A03 {
    public static void main(String[] args){
        BufferedReader in = null;
        try{
            in=new BufferedReader(new FileReader("C:\\Users\\jesus\\OneDrive\\Documentos\\NetBeansProjects\\PROG-24_25\\src\\U_10\\Main.java"));
            int letras;
            while((letras=in.read())!= -1){
                System.out.print((char)letras);
            }
            in.close();
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
