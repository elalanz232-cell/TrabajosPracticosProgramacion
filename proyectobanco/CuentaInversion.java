
package proyectobanco;

import java.util.Scanner;

public class CuentaInversion extends Banco {
    private String tipoInversion;
    private double montoInversion;
    private int acciones;
    private int bonos;
    private int cripto;
public CuentaInversion(String titular, double saldo){
   
    super(titular, saldo);
    this.tipoInversion="Sin Inversion";
    
}  



    @Override 
    void calcularIntereses(){
        Scanner teclado= new Scanner(System.in);
        int opt;
        do{
        System.out.println("Escoga el tipo de inversion a realizar. ");
        System.out.println("1.1 Acciones. 2% de comision");
        System.out.println("2.2 Bonos. 1% de comision");
        System.out.println("3.3 Criptomonedas. 3% de comision");
        System.out.println("0.0 Salir");
        opt=teclado.nextInt();
        
            System.out.println("Ingrese el monto");
        
        switch (opt) {
            case 1: {   System.out.println("Ingrese el monto a invertir");
                        double montoInversion = teclado.nextDouble();
                                if (montoInversion > saldo) {
                                    System.out.println("No tiene saldo suficiente para invertir ese monto");
                                break;
                                }
                        double comision = montoInversion * 0.02;
                        double interes = calcularInteresPorMonto(montoInversion);
                        saldo -= comision;
                        saldo += interes;
                        System.out.println("Comision cobrada: " + comision);
                        System.out.println("Interes ganado: " + interes);
                        tipoInversion = "Acciones";
                        acciones++;
                    }   break;
                    
            case 2: {  System.out.println("Ingrese el monto a invertir");
                        double montoInversion = teclado.nextDouble();
                                if (montoInversion > saldo) {
                                    System.out.println("No tiene saldo suficiente para invertir ese monto");
                                    break;
                                }
                        double comision = montoInversion * 0.02;
                        double interes = calcularInteresPorMonto(montoInversion); 
                        saldo -= comision;
                        saldo += interes;
                        System.out.println("Comision cobrada: " + comision);
                        System.out.println("Interes ganado: " + interes);
                        tipoInversion = "Bonos";
                        bonos++;
                    }   break;
                  
            
            case 3: {   System.out.println("Ingrese el monto a invertir");
                        double montoInversion = teclado.nextDouble();
                                if (montoInversion > saldo) {
                                    System.out.println("No tiene saldo suficiente para invertir ese monto");
                                    break;
                                }
                        double comision = montoInversion * 0.03;
                        double interes = calcularInteresPorMonto(montoInversion); 
                        saldo -= comision;
                        saldo += interes;
                        System.out.println("Comision cobrada: " + comision);
                        System.out.println("Interes ganado: " + interes);
                        tipoInversion = "Criptomonedas";
                        cripto++;
                    }   break;
            
            case 0: break;
            
        }}while(opt!=0);
        
    }
    
       public void menu(){
        Scanner teclado= new Scanner(System.in);
        int opt;
        do{
        System.out.println("Bienvenido a su cuenta, " + getTitular());  
        System.out.println("¿Que accion desea realizar?");
        System.out.println("1.1 Ver su resumen");
        System.out.println("2.2 Extraer");
        System.out.println("3.3 Depositar");
        System.out.println("4.4 Operar");
            System.out.println("5.5 Ver inversiones Realizadas");
        System.out.println("0.0 Salir");
        opt=teclado.nextInt();
            switch (opt) {
                case 1: resumen();
                    
                    break;
                case 2: {System.out.println("Ponga el monto a extaer: ");
                        double monto=teclado.nextDouble();
                        extraer(monto);}
                        break;
                        
                case 3: {System.out.println("Ponga el monto a depositar: ");
                        double monto=teclado.nextDouble();
                        depositar(monto);}
                        break;
                case 4: calcularIntereses();
                case 5: inversiones();
                case 0: break;   
            }
        
    }while(opt!=0);
       }
    
    private double calcularInteresPorMonto(double monto){
    if (monto < 10000) {
        return monto * 0.03;
    } else if (monto < 50000) {
        return monto * 0.06;
    } else {
        return monto * 0.10;
    }
}

void inversiones (){
    System.out.println("El numero de sus inversiones son: ");
    System.out.println("Acciones: "+ acciones);
    System.out.println("Bonos: "+ bonos);
    System.out.println("Cryptomonedas: "+ cripto);
}
}
