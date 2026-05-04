
package trabajopractico3;

import java.util.ArrayList;
import java.util.List;



    public class Flota {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
    public void agregar(Vehiculo v) {
        vehiculos.add(v);
    }
    
    public void emitirReporte() {
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }

}
