
package trabajopractico2;

import java.util.Scanner;


public class Calculadora {
   public double pedirNumeros(String pedir){
       Scanner teclado= new Scanner(System.in);
       System.out.println(pedir);
       return teclado.nextDouble();
   
   }
   
   public double suma(double a, double b){
     double suma=a+b;
   return suma;
   
   }
    public double resta(double a, double b){
     double resta=a-b;
   return resta;
   
   }
     public double multiplicacion(double a, double b){
     double multiplicacion=a*b;
   return multiplicacion;
   
   }
      public double division(double a, double b){
     double division=a/b;
   return division;
   
   }
}
