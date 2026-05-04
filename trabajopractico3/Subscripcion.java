
package trabajopractico3;

import java.util.Random;


abstract class Subscripcion {
    private String correo;
    private int nCliente;
    //private double costoBase;
    private static final double COSTO_BASE=500;
    
    public Subscripcion(String correo){
        this.correo=correo;
        //this.costoBase=costoBase;
        this.nCliente=generarNumeroCliente();
    }
    
    private int generarNumeroCliente(){
    Random rand = new Random();
    return rand.nextInt(9000) + 1000; 
    }
    
    abstract double tipoSupscripcion();
    public double getCostoBase(){
        return COSTO_BASE;  
    }
}
