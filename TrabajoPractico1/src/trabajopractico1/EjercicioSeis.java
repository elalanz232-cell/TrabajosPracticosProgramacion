
package trabajopractico1;

import java.util.Scanner;


public class EjercicioSeis {

public static void numeroTriangulos(){
Scanner teclado= new Scanner(System.in);
    int triangulos;
    int isoceles=0;
    int escaleno=0;
    int equilatero=0;
            
    System.out.println("Ingrese el numero de triangulos que creara: ");
    triangulos=teclado.nextInt();
    for (int i = 0; i < triangulos; i++) {
        System.out.println("Ingrese el lado A: ");
        int a=teclado.nextInt();
        System.out.println("Ingrese el lado B: ");
        int b=teclado.nextInt();
        System.out.println("Ingrese el lado C: ");
        int c=teclado.nextInt();
        Triangulos triangulo =new Triangulos( a, b, c);
        
        if (triangulo.tipo.equalsIgnoreCase("Equilatero")) {equilatero++;}
        else if (triangulo.tipo.equalsIgnoreCase("Isoceles")) {isoceles++;}
        else escaleno++;}
System.out.println("Equilateros: " + equilatero);
System.out.println("Isosceles: " + isoceles);
System.out.println("Escalenos: " + escaleno);

evaluarMenor(equilatero, isoceles, escaleno);
}


public static void evaluarMenor(int equilatero, int isoceles, int escaleno){
      if (equilatero < isoceles && equilatero < escaleno) {
        System.out.println("El tipo con menor cantidad es Equilatero");
    } else if (isoceles < equilatero && isoceles < escaleno) {
        System.out.println("El tipo con menor cantidad es Isoceles");
    } else {
        System.out.println("El tipo con menor cantidad es Escaleno");
    }
    
}

}
