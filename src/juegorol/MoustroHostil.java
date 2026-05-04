
package juegorol;

abstract class MoustroHostil extends SerVivo{
    
    public MoustroHostil(int x, int y, int puntosVida){
        super(x, y, puntosVida);
    }
     abstract void interactuar();
    
    
}
