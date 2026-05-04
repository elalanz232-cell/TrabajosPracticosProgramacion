
package trabajopractico3;


public class PlanBasico extends Subscripcion {
    
    public PlanBasico(String correo){
        
        super(correo);
    }

    @Override
    double tipoSupscripcion() {
        return getCostoBase();
    }
    
}
