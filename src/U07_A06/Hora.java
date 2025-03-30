//Jesús Sánchez de la Riva
package U07_A06;

public class Hora {
    int hora;
    int minuto;
    int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        if (hora>=0 && hora<24){
            this.hora=hora;
        }
        else{
            this.hora=0;
        }
    }
    public int getMinuto(){
        return minuto;
    }
    public void setMinuto(int minuto){
        if (minuto>=0 && minuto<60){
            this.minuto=minuto;
        }
        else{
            this.minuto=0;
        }
    }
    public int getSegundo(){
        return segundo;
    }
    public void setSegundo(int segundo){
        if (segundo>=0 && segundo<60){
            this.segundo=segundo;
        }
        else{
            this.segundo=0;
        }
    }
    public void aumentarSegundos(){
        segundo++;
        if(segundo==60){
            segundo=00;
            minuto++;
            if(minuto==60){
                minuto=00;
                hora++;
                if(hora==24){
                    hora=00;
                }
            }
        }
    }
    public void mostrarHora(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
}
