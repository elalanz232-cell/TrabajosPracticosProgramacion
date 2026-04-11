
package trabajopractico1;

import java.util.Scanner;


public class EjercicioDos {
    
    
    public static double promedio(){
    double nota1, nota2, nota3;
    double promedio;
    Scanner teclado= new Scanner(System.in);    
        System.out.println("Ingrese la primera nota: ");
        nota1=teclado.nextDouble();
        System.out.println("Ingrese la segunfa nota: ");
        nota2=teclado.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        nota3=teclado.nextDouble();
        
        promedio=(nota3+nota1+nota2)/3;
        return promedio;}
    
public static void evaluar (double promedio){
     //REvisando me di cuenta que pude usar el condicional ternario, lo dejo como guiño
    //String val=(promedio>=8) ?  "HAS PROMOCIONADO LA MATERIA": "HAS QUEDADO REGULAR";
    //System.out.println(val);
    if (promedio>=8) {
        System.out.println("Tu nota es superior a 8. Has promocionado la materia.");
        
    } else {
        System.out.println("Has aprobado. Estas regular.");
    }
        


}
}