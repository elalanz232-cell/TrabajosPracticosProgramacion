
package trabajopractico2;

import java.util.Scanner;

public class MenuCuentaBancaria {
    
    
    public static  void menu(){
        int opt;
        Scanner teclado=new Scanner(System.in);
        CuentaBancaria cuenta1=new CuentaBancaria("Alan Coronel",0);
        CuentaBancaria cuenta2=new CuentaBancaria("Tulio Ruesjas",0);
 
        do{
        System.out.println("Bienvenido " + cuenta1.getAlias()+ "¿que operacion desea ralizar?");
        System.out.println("1.1 Depositar");
        System.out.println("2.2 Extraccion");
        System.out.println("3.3 Transferencia");
        System.out.println("4.4 Consultar Saldo");
        System.out.println("5.5 Ver Perfil");
        System.out.println("0.0 Salir");
        
        opt=teclado.nextInt();
            switch (opt) {
                
                case 1: {System.out.println("Digite el numero a depositar: ");
                          double monto=teclado.nextDouble();
                          cuenta1.depositar(monto);
                          System.out.println("Deposito realizado, su saldo es: " +cuenta1.ConsultarSaldo());}
                    
                    break;
                    case 2: {System.out.println("Ingrese la cantidad a extraer: ");
                          double monto=teclado.nextDouble();
                          cuenta1.extraer(monto);
                          System.out.println("Extraccion realizada, su saldo es: " +cuenta1.ConsultarSaldo());}
                    break;
                    
                    case 3: {System.out.println("Ingrese el monto a transferir: ");
                        double monto=teclado.nextDouble();
                        Transferencia.transferir(cuenta1, cuenta2, monto);
                    }
                    
                    break;
                    case 4:System.out.println("Su saldo es: "+cuenta1.ConsultarSaldo());
                    break;
                    
                    case 5:{System.out.println("Sus Datos son: ");
                        System.out.println("Alias: " + cuenta1.getAlias());
                        System.out.println("CBU: "+cuenta1.getCbu());
                        System.out.println("Saldo Disponible = "+cuenta1.ConsultarSaldo());
                    }
                    break;
                    
                    
                   
            }
        }while(opt!=0);
    }
    
}
