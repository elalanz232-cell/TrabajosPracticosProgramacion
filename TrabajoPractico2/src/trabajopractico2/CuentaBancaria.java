
package trabajopractico2;

import java.util.Random;

public class CuentaBancaria {
    
    private String cbu;
    private String alias;
    private  double saldo;
    
    CuentaBancaria(String alias, double saldo){
        this.alias=alias;
        this.saldo=saldo;
        this.cbu=generarCbu();
    }
    
    public void depositar(double monto){
    saldo+=monto;
    }
    
    public void extraer(double monto){
    if(monto<=saldo){
    saldo-=monto;}
    else System.out.println("Saldo insuficiente");
    }
    
    private String generarCbu(){
    
    Random rand = new Random();
    StringBuilder cbu = new StringBuilder();
    for (int i = 0; i < 22; i++) {
        cbu.append(rand.nextInt(10));
    }
    return cbu.toString();
}

    
    public double ConsultarSaldo(){
        return saldo;
    }
    
        public String getCbu(){
        return cbu;
    }
            public String getAlias(){
        return alias;
    }
}
