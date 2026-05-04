
package trabajopractico3;

public class TarjetaCredito implements ProcesarPago {
    private double saldo=1000;

    @Override
    public void procesarPago(double monto) {
        
        System.out.println("Espere mientras se corroboran los datos de la tarjeta");
        System.out.println("Se pago $"+monto+ " se pago correctamente con la tarjeta");
        /*if (monto<saldo) {
            System.out.println(" Compra exitosa");
            System.out.println("Se pago $ " + monto + "se pago con tarjeta");
        } else { System.out.println("Datos incorrectos u saldo insuficiente");
        }*/
   
    }
    
    
}
