
package trabajopractico3;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    
    
    
        
    private List<ProcesarPago> procesadores = new ArrayList<>();
    
    public void agregar(ProcesarPago p) {
        procesadores.add(p);
    }
    
    public void procesarTodos(double monto) {
        for (ProcesarPago p : procesadores) {
            p.procesarPago(monto);
        }
    }
}

