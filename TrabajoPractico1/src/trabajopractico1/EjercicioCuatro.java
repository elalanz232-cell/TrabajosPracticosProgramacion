package trabajopractico1;

import java.util.Scanner;

                           
public class EjercicioCuatro {
    public static void añoFiscal(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese Un Dia (numeros)");
        int dia=teclado.nextInt();
        System.out.println("Ingrese un mes (numeros)");
        int mes=teclado.nextInt();
        System.out.println("Ingrese un anio");
        int anio=teclado.nextInt();
       
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
        
        comprobarTrimestre(mes);}
    
    public static void comprobarTrimestre(int mes){
        
        switch (mes) {
            case 1,2,3 ->  System.out.println(" Estamos en el primer trimestre");
            case 4,5,6 ->  System.out.println("Ya estamos en el Segundo trimestre");
            case 7,8,9 ->  System.out.println("Nos encontramos en el tercer trimestre");
            default -> System.out.println("Entramos al cuarto trimestre");
        }
    }
}

