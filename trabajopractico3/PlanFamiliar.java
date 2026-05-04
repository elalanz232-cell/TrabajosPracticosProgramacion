
package trabajopractico3;


public class PlanFamiliar extends Subscripcion {

    private int perfilesAdicionales;
    private double recargo=100;
    public PlanFamiliar(String correo, int perfilesAdicionales ){
        super(correo);
        this.perfilesAdicionales=perfilesAdicionales;
    
    
}

    @Override
    double tipoSupscripcion() {
        return getCostoBase() + (perfilesAdicionales * recargo);
    }
}
