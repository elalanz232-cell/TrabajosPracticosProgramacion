
package juegorol;


public class MagoElfo extends Personaje implements LanzarHechizo {
    private int mana;
    private int hechizoBasico=500;
    public MagoElfo(int x, int y, int puntosVida, int mana){
        super(x,y,puntosVida);
        this.mana=mana;
        
    }

    @Override
    void interactuar() {
        System.out.println("Cargando hechizo ");    
    }

    @Override
    void dibujar() {
        System.out.println("El mago se encuentra en x: " + x + " y:"+ y);    
    }

    
    @Override
    public void lanzarHechizo() {
        System.out.println("EL mana es: "+mana);
        if (mana>hechizoBasico) {
            System.out.println("Lanzando Hechizo");
            mana-=hechizoBasico;
            
            
        } else {System.out.println("No hay mana suficiente");
        }
        
    }
    
}
