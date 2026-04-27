
package proyectobanco;

import java.util.Random;


abstract class Banco {
  private String numeroCuenta;
  private String titular;
  protected double saldo;
   
    public Banco(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
        this.numeroCuenta= generarNumeroCuenta();
        
        
    }
    abstract void calcularIntereses();
        
    
    private  String generarNumeroCuenta(){
     Random random = new Random();
    StringBuilder sb = new StringBuilder();
    
    sb.append("CB-");                   
    sb.append(random.nextInt(900000) + 100000); 
    sb.append("-ARG");   
        return sb.toString();
    }
    protected  void extraer(double monto){
        
        if (saldo<monto) {
            System.out.println("Saldo insuficiente. No puede extraer");
            
        } else {
            saldo-=monto;
            System.out.println("Transaccion exitosa. Su saldo es: " + saldo);
        }
    }
    
    protected void depositar(double monto){
        
        saldo+=monto;
        System.out.println("Operacion Exitosa. Su saldo es: "+ saldo);
    }
    
    protected void resumen(){
        System.out.println("Numero de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Actual: " + saldo);
    }
    protected String getTitular(){
        
        return titular;
        
    }
   /* protected double getSaldo(){
        
        return saldo;
    }*/
    
       /* protected  setSaldo(double saldo){
        this.saldo=saldo;
        
    }*/
}
