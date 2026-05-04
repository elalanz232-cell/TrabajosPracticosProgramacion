
package trabajopractico3;

import java.util.Scanner;


public class Furgoneta extends Vehiculo implements TieneCaracteristica {
 private double capacidad;
    public Furgoneta(String marca, String modelo, double tarifa){
        super(marca, modelo, tarifa);
        this.capacidad=agregarCapacidad();
    }

    
    private double agregarCapacidad(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿De cuanta capacidad (KG) es la furgoneta?");
        return teclado.nextDouble();
    }
        @Override
    public String getCaracteristica() {
        return "Capacidad: " + capacidad + "kg"; 
    }
    
     @Override
     void mostrarInfo(){
         System.out.println("Modelo: "+modelo);
         System.out.println("Marca: "+marca );
         System.out.println(getCaracteristica());
         System.out.println("Tarifa: " +tarifa);
         
     }
}
