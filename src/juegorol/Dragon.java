/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegorol;

/**
 *
 * @author Inicio
 */
public class Dragon extends MoustroHostil implements LanzarHechizo {
    
    public Dragon(int x, int y, int puntosVida){
        
        super(x, y, puntosVida);
    }

    @Override
    void interactuar() {
        System.out.println("El dragon se esta enfadando "); 
    }

    @Override
    void dibujar() {
        System.out.println("El Dragon  esta en x: "+x + " y: "+y);    }

    @Override
    public void lanzarHechizo() {
        System.out.println("El Dragon ha utilizado su aliento draconico");
    }
    
}
