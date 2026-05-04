
package trabajopractico3;

import java.util.ArrayList;
import java.util.List;

public class MotorFacturacion {
    private List<Subscripcion>facturacion= new ArrayList<>(); 
    
     public void agregar(Subscripcion s) {
        facturacion.add(s);
    }
    
public void emitirFacturacion() {
    double total = 0;
    for (Subscripcion s : facturacion) {
        total += s.tipoSupscripcion();
    }
    System.out.println("Ganancias totales: " + total);
}
}
