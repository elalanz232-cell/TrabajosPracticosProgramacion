
package trabajopractico3;


public class PlanPremiun extends Subscripcion {
    
    private double cargoExtra=1.50;
    public PlanPremiun(String correo){
        
        super(correo);
        
    }

    @Override
    double tipoSupscripcion() {
       return getCostoBase() * cargoExtra;
    }
}
