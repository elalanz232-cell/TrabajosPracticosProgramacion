
package juegorol;


public class Guerrero extends Personaje {
  
   
   public Guerrero (int x, int y, int puntosVida){
       
       super(x,y,puntosVida);
       
       
       
       
       
   }

    @Override
    void interactuar() {
        System.out.println("El guerrero esta blandiendo su espada");
            }

    @Override
    void dibujar() {
        System.out.println("El guerrero esta en la posicion x: "+ x+ " y: "+y);
    }
}
