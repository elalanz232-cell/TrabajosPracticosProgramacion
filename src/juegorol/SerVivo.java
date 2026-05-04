
package juegorol;

abstract class SerVivo  extends EntidadEspacial{
    int puntosVida;
    
    public SerVivo(int x, int y, int puntosVida){
        super(x,y);
        this.puntosVida=puntosVida; 
    }
    public void recibirDanio(int danio) {
        puntosVida -= danio;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}
