
package trabajopractico2;


public class Transferencia {
    
    public static void transferir(CuentaBancaria cuenta1, CuentaBancaria cuenta2, double monto){
        
        System.out.println("Estas por transferir al siguente destinatario: ");
        System.out.println("Alias: " + cuenta2.getAlias());
        System.out.println("CBU: " +cuenta2.getCbu());
        if (monto<=cuenta1.ConsultarSaldo()) {
            cuenta1.extraer(monto);
            cuenta2.depositar(monto);
            cuenta1.ConsultarSaldo();
            
            System.out.println("Saldo de "+cuenta1.getAlias()+ "es : "+ cuenta1.ConsultarSaldo());
            System.out.println("Saldo de "+cuenta2.getAlias()+ "es : "+ cuenta2.ConsultarSaldo());
        } else {System.out.println("No hay suficiente dinero");
        }
        
    }
}
