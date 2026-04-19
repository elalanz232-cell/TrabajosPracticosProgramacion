
package trabajopractico2;


public class Reloj {
   private int hora;
   private int minutos;                 
   private int segundos;
    
    public Reloj(){}
    
 public void establecerHora(int h, int m, int s){
     hora=h;
     minutos=m;
     segundos=s;
 
 } 
 public void mostrarHora(){
 
     System.out.println("La hora es: "+ hora + "/" + minutos + "/"+segundos);
 }
 
 public void incrementar(){
 segundos++;
    if (segundos==60){
        segundos=0;
        minutos++;
                    if(minutos==60){
                       minutos=0;
                       hora++;}
                                    if(hora==24){
                                       hora=0;}
 }
 
 }
}
