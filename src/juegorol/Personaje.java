
package juegorol;


abstract class Personaje extends SerVivo{
    
public Personaje(int x, int y, int puntosVida) {
    super(x, y, puntosVida);
    }
   abstract void interactuar();
   
}
