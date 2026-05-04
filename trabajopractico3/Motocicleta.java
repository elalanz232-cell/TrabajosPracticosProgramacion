
package trabajopractico3;

import java.util.Scanner;

public class Motocicleta extends Vehiculo implements TieneCaracteristica  {
private double cilindrada;
    public Motocicleta(String marca, String modelo, double tarifa){
        super(marca, modelo, tarifa);
        this.cilindrada=agregarCapacidad();
    }

    
    private double agregarCapacidad(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿De cuanta cilindrada es la motocicleta?");
        return teclado.nextDouble();
    }
        @Override
    public String getCaracteristica() {
        return "Cilindrada: " + cilindrada + "CC"; 
    }

     void mostrarInfo(){
         System.out.println("Modelo: "+modelo);
         System.out.println("Marca: "+marca );
         System.out.println(getCaracteristica());
         System.out.println("Tarifa: " +tarifa);
         
     }    




}
