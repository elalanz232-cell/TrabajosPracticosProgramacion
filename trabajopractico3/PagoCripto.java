
package trabajopractico3;


public class PagoCripto implements ProcesarPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Convirtiendo BTC a USDT");
        System.out.println("Proceso extioso");
        System.out.println("Se pago en USDT: "+monto + "Se pago con Cripto ");
    }
    
}
