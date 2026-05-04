/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegorol;


public class Ogro extends MoustroHostil {
    
    public Ogro (int x, int y, int puntosVida){
        
        super(x,y,puntosVida);
    }

    @Override
    void interactuar() {
        System.out.println("El ogro se esta preparando para atacar");
    }

    @Override
    void dibujar() {
        System.out.println("El ogro se encuentra en x: "+x+" y: "+y);
        
            }
    
}
