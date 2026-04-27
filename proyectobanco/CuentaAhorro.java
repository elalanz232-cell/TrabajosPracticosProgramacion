
package proyectobanco;

import java.util.Scanner;


public class CuentaAhorro extends Banco {
    
    public CuentaAhorro(String titular, double saldo){
        
        super(titular, saldo);
    }
    
    
    @Override
    void calcularIntereses(){
        
        saldo*=  1.025;
        
        
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
        System.out.println("4.4 Ver interes a aplicar");
        System.out.println("5.5 Aplicar intereses");
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
                case 4: System.out.println("Sus intereses actuales son del 2.5%");
                        break;
                
                case 5: System.out.println("Intereses aplicados");
                calcularIntereses();
                case 0: break;   
            }
        
    }while(opt!=0);
        
        }
}
