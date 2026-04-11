
package trabajopractico1;

import java.util.Scanner;


public class EjercicioCinco {
    int x;
    int y;
    
    public static void Plano(){
    Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el numero para el eje X: ");
        int x = teclado.nextInt();
        System.out.println("Ingrese el numero para el eje Y: ");
        int y = teclado.nextInt();
        
        comprobarCuadrante(x, y);
    }
    public static void comprobarCuadrante (int x, int y){
        if (x>0 && y>0) {
            System.out.println("Se encuentra en el primer cuadrante");
        } else if(x<0 &&y>0) {
            System.out.println("Se encuentra en el segundo cuadrante");
        } else if(x<0 &&y<0) {
            System.out.println("Se encuentra en el tercer cuadrante");
        }
        else { System.out.println("Se encuentra en el cuarto cuadrante");
        }
    }
}
