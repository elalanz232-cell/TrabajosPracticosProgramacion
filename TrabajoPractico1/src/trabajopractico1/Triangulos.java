
package trabajopractico1;

public class Triangulos {
int lado1,lado2,lado3;
String tipo;    

public Triangulos(int lado1, int lado2, int lado3){
this.lado1=lado1;
this.lado2=lado2;
this.lado3=lado3;

    if (lado1==lado2 && lado2==lado3) {
        tipo="Equilatero";
        
    } else if (lado1==lado2 || lado2==lado3 || lado1==3){
        tipo="Isoceles";
    }
    else {
        tipo="Escaleno";
    }
}
}