
package trabajopractico2;

import java.util.Scanner;


public class TrabajoPractico2 {


    public static void main(String[] args) {
     // /* borre los "//"   aqui y ciere el do while
     int opt;
        Scanner teclado=new Scanner(System.in); 
        do{
        
         System.out.println("Bienvenido Al Panel General. ¿Que Desea Realizar?");
         System.out.println("1.1 Ir a Calculadora.");
         System.out.println("2.2 Establecer Hora.");
         System.out.println("3.3 Ir a la Biblioteca.");
         System.out.println("4.4 Crear una Cuenta Bancaria.");
         System.out.println("Gestionar a los Empleados.");
            System.out.println("0.0 Salir.");
          opt = teclado.nextInt();
          
            switch (opt) {
                case 1:menuCalculadora.menu();
                    
                    break;
                case 2: MenuReloj.menu();
                break;
                case 3: MenuBiblioteca.menu();
                break;
                case 4: MenuCuentaBancaria.menu();
                break;
                case 5: GestorEmpleado.gestionarEmpleados();
                break;
            }
     }while(opt!=0); 
        // */ y aqui para probarlos directamente 
    }
}

      //menuCalculadora.menu(); 
     //MenuReloj.menu();
    // MenuBiblioteca.menu();
   //MenuCuentaBancaria.menu();
  1//GestorEmpleado.gestionarEmpleados();