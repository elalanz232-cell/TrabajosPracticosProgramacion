
package trabajopractico3;

public class TrabajoPractico3 {


    public static void main(String[] args) {
        //Ejercicio 1
        Flota flota = new Flota();
        flota.agregar(new Furgoneta("Ford", "Transit", 100.0));
        flota.agregar(new Motocicleta("Honda", "CB500", 80.0));
        flota.emitirReporte();
        
        
        //Ejercicio 2
        MotorFacturacion motorFacturacion = new MotorFacturacion();
        motorFacturacion.agregar(new PlanBasico("pedritovm23@gmail.com"));
        motorFacturacion.agregar(new PlanFamiliar("elrubiosomg23@gmail.com", 3));
        motorFacturacion.agregar(new PlanPremiun("maicol777@gmail.com"));
        motorFacturacion.emitirFacturacion();
        
        
        //Ejercicio 3 
        CarritoCompra motorCarrito= new CarritoCompra();
        motorCarrito.agregar(new TarjetaCredito());
        motorCarrito.agregar(new TransferenciaPaypal());
        motorCarrito.agregar(new PagoCripto());
        motorCarrito.procesarTodos(50000);
        
        //Ejercicio 4
        
        Central central = new Central();

        central.agregar(new CamaraSeguridad());
        central.agregar(new Termostato());
        central.agregar(new Telefono());

        central.conectarTodos();
        central.fotografiarTodos();
        
    }
    
}
