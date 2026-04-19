
package trabajopractico2;

import java.util.Scanner;

public class menuCalculadora {
    
    
    public static void menu(){
    Scanner teclado= new Scanner(System.in);
    Calculadora cal=new Calculadora();
    int opt;

        do{
            System.out.println("1.1 Sumar");
            System.out.println("2.2 Restar");
            System.out.println("3.3 Multiplicar");
            System.out.println("4.4 Dividir");
            System.out.println("0.0 Salir");
            System.out.println("Seleccione una opcion ");
            opt=teclado.nextInt();
            
                    switch (opt) {
                                    case 1: {double a = cal.pedirNumeros("Ingrese el primer numero: ");
                                             double b=cal.pedirNumeros("Ingrese el segundo numero");
                                             double resultado=cal.suma(a, b);
                                             System.out.println("El resultado es "+ resultado);
                                    break;}
                                    case 2:{double a = cal.pedirNumeros("Ingrese el primer numero: ");
                                            double b=cal.pedirNumeros("Ingrese el segundo numero");
                                            double resultado=cal.resta(a, b);
                                            System.out.println("El resultado es "+ resultado);
                                    break;}
                                    case 3: {double a = cal.pedirNumeros("Ingrese el primer numero: ");
                                             double b=cal.pedirNumeros("Ingrese el segundo numero");
                                             double resultado=cal.multiplicacion(a, b);
                                             System.out.println("El resultado es "+ resultado);
                                    break;}
                                    case 4:{double a = cal.pedirNumeros("Ingrese el primer numero: ");
                                            double b=cal.pedirNumeros("Ingrese el segundo numero");
                                            double resultado=cal.division(a, b);
                                            System.out.println("El resultado es "+ resultado);
                                    break;}
                                    //default:System.out.println("Opcion invalida");
                                    
        }

} while(opt!=0);



}

}
