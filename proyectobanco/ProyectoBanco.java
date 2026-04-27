/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobanco;

import java.util.Scanner;


public class ProyectoBanco {

    
    public static void main(String[] args) {
        CuentaAhorro cb1 = new CuentaAhorro("Alan Coronel", 1000);
        CuentaCorriente cb2 = new CuentaCorriente("Alan Coronel", 1000);
        CuentaInversion cb3 = new CuentaInversion("Alan Coronel", 100000);
        
        Scanner teclado = new Scanner(System.in);
        int opt;
        
        do{
            System.out.println("Bienvenido al Sistema Bamcario ");
            System.out.println("¿A que cuenta desea acceder?");
            System.out.println("1.1 Cuenta Ahorro");
            System.out.println("2.2 Cuenta Corriente");
            System.out.println("3.3 Cuenta de Inversion");
            System.out.println("0.0 Salir");
            opt= teclado.nextInt();
            
                switch (opt) {
                case 1: cb1.menu();
                    break;
                case 2: cb2.menu();
                    break;
                case 3: cb3.menu();
                    break;
                case 0: break;
            }
        
        }while(opt!=0);
    }
    
}
