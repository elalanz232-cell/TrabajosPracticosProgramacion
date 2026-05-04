
package juegorol;

abstract class EntidadEspacial {
    
   protected  int x,y;
    
   abstract void dibujar();
   
   public EntidadEspacial(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void actualizarCoordenadas(int x, int y){
        this.x=x;
        this.y=y;  
    }
}
