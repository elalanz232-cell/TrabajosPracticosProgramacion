
package trabajopractico3;

abstract class Vehiculo {
    
    String marca;
    String modelo;
    double tarifa;
    
    public Vehiculo(String marca, String modelo, double tarifa){
        this.marca=marca;
        this.modelo=modelo;
        this.tarifa=tarifa;
        
    }
    
    abstract void mostrarInfo();
    
}
