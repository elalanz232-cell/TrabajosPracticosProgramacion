
package trabajopractico2;

import java.util.Scanner;


public class Empleado {
    private static int contadorEmpleados=0;
    private static int contadorLegajo=1;
    private String nombre;
    private double salario;
    private int legajo;
    private String motivoAumento;
    
public Empleado(String nombre, double salario){
    this.nombre=nombre;
    this.salario=salario;
    this.legajo=contadorLegajo++;
    
    contadorEmpleados++;
}

public void aumentoPorcentaje(double porcentaje){
    this.motivoAumento=motivo();
salario+=salario*porcentaje/100;   
    System.out.println("Se ha aumentado el salario del empleado "+ nombre);
    System.out.println("Sueldo: "+salario);
    System.out.println("Motivo: "+motivoAumento);

}

public void aumentoMonto(double monto){
    this.motivoAumento=motivo();
    salario+=monto;   
    System.out.println("Se ha aumentado el salario del empleado "+ nombre);
    System.out.println("Sueldo: "+salario);
    System.out.println("Motivo: "+ motivoAumento);

}
public String motivo(){
    int opt;
    Scanner teclado= new Scanner(System.in);
    System.out.println("Seleccione el motivo del aumento");
    System.out.println("1.1 Desempeño");
    System.out.println("2.2 Antiguedad");
    System.out.println("3.3 Ajuste por Inflacion");
    opt=teclado.nextInt();
    
    switch (opt) {
        case 1:
            return "Desempeño";
        case 2:
            return "Antiguedad";
        case 3:
            return "Ajuste por Inflacion";
                    
        default: return "Sin motivo";    
        
    }
}
public void informacion(){
    System.out.println("nombre: " +nombre);
    System.out.println("Legajo: "+ legajo);
    System.out.println("Salario: "+salario);
    
}
public String getNombre(){
    return nombre;
}
public double getSalario(){
    return salario;  
}
public static int getContadorEmpleados(){
    return contadorEmpleados;  
}
}

