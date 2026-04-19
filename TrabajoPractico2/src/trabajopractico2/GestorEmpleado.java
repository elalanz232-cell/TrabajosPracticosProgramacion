package trabajopractico2;

import java.util.Scanner;

public class GestorEmpleado {
public static void gestionarEmpleados(){
    Empleado empleado1= new Empleado("Alan Coronel", 10000);
    Empleado empleado2= new Empleado("Tulio Ruesjas", 50000);
    
    int opt;
    Scanner teclado= new Scanner(System.in);
    
    do{
        System.out.println("Bienvenido a la gestion de empleados. Seleccione una opcion");
        System.out.println("1.1 Ver empleados");
        System.out.println("2.2 Aumentar sueldo por porcentaje.");
        System.out.println("3.3 Aumentar sueldo por monto");
        System.out.println("4.4 Ver la cantidad de empleados.");
        System.out.println("5.5 Informacion");
        System.out.println("0.0 Salir");
        System.out.println("");
        opt=teclado.nextInt();
        switch (opt) {
            case 1: System.out.println("Empleados: "+ empleado1.getNombre()+ " , "+empleado2.getNombre());
                
                break;
                //para porcentaje
            case 2: {System.out.println("Seleccione al empleado ha aplicar el aumento: ");
                System.out.println("1.1 "+empleado1.getNombre());
                System.out.println("2.2 "+empleado2.getNombre());
                int num=teclado.nextInt();
                
                    switch (num) {
                    case 1: 
                            System.out.println("Ingrese el porcentaje para el aumento, el salario actual es: " + empleado1.getSalario());
                            double porcentaje=teclado.nextDouble();
                            empleado1.aumentoPorcentaje(porcentaje);
                            System.out.println("Aumento realizado correctamente, el empleado cobrara " + empleado1.getSalario());
                            
                        break;
                    case 2: System.out.println("Ingrese el porcentaje para el aumento, el salario actual es: " + empleado2.getSalario());
                            double p=teclado.nextDouble();
                            empleado2.aumentoPorcentaje(p);
                            System.out.println("Aumento realizado correctamente, el empleado cobrara " + empleado2.getSalario());
                            
                        break;
                    }
            }
            break;
            
        
        //para monto
        
        case 3: {System.out.println("Seleccione al empleado ha aplicar el aumento: ");
                System.out.println("1.1 "+empleado1.getNombre());
                System.out.println("2.2 "+empleado2.getNombre());
                int num=teclado.nextInt();
                
                    switch (num) {
                    case 1: 
                            System.out.println("Ingrese el Monto para el aumento, el salario actual es: " + empleado1.getSalario());
                            double monto=teclado.nextDouble();
                            empleado1.aumentoMonto(monto);
                            System.out.println("Aumento realizado correctamente, el empleado cobrara " + empleado1.getSalario());
                            //System.out.println("Por el motivo: " + empleado1.motivo());
                        break;
                    case 2: System.out.println("Ingrese el monto para el aumento, el salario actual es: " + empleado2.getSalario());
                            double m=teclado.nextDouble();
                            empleado2.aumentoMonto(m);
                            System.out.println("Aumento realizado correctamente, el empleado cobrara " + empleado2.getSalario());
                            //System.out.println("Por el motivo: " + empleado2.motivo());
                        break;
                        
                }
                
                
            }
            break;
        
        case 4: System.out.println("El numero de empleados es: "+ Empleado.getContadorEmpleados());
        break;
        
        case 5: System.out.println("Informacion general: ");
            empleado1.informacion();
            System.out.println("\n");
            empleado2.informacion();
            break;
        }
            
        
    }while(opt!=0);
    
}    
}
