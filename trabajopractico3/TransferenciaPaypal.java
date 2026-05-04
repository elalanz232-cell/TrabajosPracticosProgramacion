
package trabajopractico3;


public class TransferenciaPaypal implements ProcesarPago {
    
     @Override
    public void procesarPago(double monto) {
        
        System.out.println("Espere mientras se corroboran los datos de su cuenta Pypal");
        System.out.println("Se pago $"+monto+ " se pago correctamente con PayPal");

   
    }
    
    
}
