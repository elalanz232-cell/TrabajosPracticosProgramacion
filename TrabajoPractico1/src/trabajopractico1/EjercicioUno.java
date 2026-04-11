
package trabajopractico1;
import java.util.Scanner;

public class EjercicioUno {
    

    public static void validar(){
     Scanner teclado=new Scanner(System.in);    
    
    System.out.println("Ingrese la nota de la materia correspondiente: " );   
    int nota=teclado.nextInt();
    
        if (nota<=4) {
            System.out.println("Usted no ha aprobado, debe rendir de nuevo");
        } else if(nota==10) {
            
            System.out.println("Usted obtuvo un 10. Fantascico!");
            
        }
        else {
            System.out.println(" Usted esta aprobado ");
        }
    }
    
}
