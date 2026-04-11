
package trabajopractico1;

import java.util.Scanner;

public class TrabajoPractico1 {

    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in); 
        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Saber si promociono");
        System.out.println("2.Promedio de notas");
        System.out.println("3.Saber cuantos digitos hay");
        System.out.println("4.Saber en que Trimestre estamos");
        System.out.println("5.Encontrar el cuadrante de un punto");
        System.out.println("6.Clasificar Triangulos");
    
     
      int opt = teclado.nextInt();
      
     switch(opt){
         case 1 -> EjercicioUno.validar();
         case 2 -> {double resultado=EjercicioDos.promedio();
                 EjercicioDos.evaluar(resultado);}
         case 3 -> EjercicioTres.digitos();
         case 4 ->EjercicioCuatro.añoFiscal();
         case 5 ->EjercicioCinco.Plano();
         case 6 ->EjercicioSeis.numeroTriangulos();
     }

    }
    
}
