
package trabajopractico1;

import java.util.Scanner;


public class EjercicioTres {
    
    public static void digitos(){
Scanner teclado=new Scanner (System.in); 
        System.out.println("Ingrese un numero, SOLO POSITIVOS: ");
        int num=teclado.nextInt();
        
        String resultado=(num<10 || num<100) ? "El numero tiene dos digitos": "el numero tiene un digito";
        System.out.println(resultado);
      
        
    }
}
