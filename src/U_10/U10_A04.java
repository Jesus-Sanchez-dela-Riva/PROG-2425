//Jesús Sánchez de la Riva
package U_10;
import java.io.*;
public class U10_A04 {
    public static void main(String[] args){
        BufferedReader in = null;
        try{
            in=new BufferedReader(new FileReader("C:\\Users\\jesus\\OneDrive\\Documentos\\NetBeansProjects\\PROG-24_25\\src\\U_10\\NumerosReales.txt"));
            String linea=in.readLine();
            if(linea!=null){
                String [] subcadena = linea.split(" ");
                double suma=0;
                for(int i=0; i<subcadena.length; i++){
                    suma+=Double.valueOf(subcadena[i]);
                }
                double media=suma/subcadena.length;
                System.out.println("La suma es: "+suma+"\n La media es: "+media);
            }
        }catch(IOException ex){
            System.out.println("Ha ocurrido un error : "+ex.getMessage());
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
