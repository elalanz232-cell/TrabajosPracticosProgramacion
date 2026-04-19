
package trabajopractico2;

import java.util.Scanner;

public class MenuReloj {
    
    public static void menu() {
        Reloj r = new Reloj();
        Scanner teclado = new Scanner(System.in);
        int opt;
        
        do {
            System.out.println("1.1 Establecer hora");
            System.out.println("2.2 Mostrar hora");
            System.out.println("3.3 Avanzar segundo");
            System.out.println("0.0 Salir");
            opt = teclado.nextInt();
            
            switch(opt) {
                case 1:{
                    System.out.println("Hora: ");
                    int h = teclado.nextInt();
                    System.out.println("Minutos: ");
                    int m = teclado.nextInt();
                    System.out.println("Segundos: ");
                    int s = teclado.nextInt();
                    r.establecerHora(h, m, s);
                    break;}
                case 2:{
                    r.mostrarHora();
                    break;}
                case 3:{
                    r.incrementar();
                    r.mostrarHora();
                    break;}
            }
        } while(opt != 0);
    }
}
    

