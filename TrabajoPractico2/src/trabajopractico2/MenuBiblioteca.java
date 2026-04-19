
package trabajopractico2;

import java.util.Scanner;

 class MenuBiblioteca {
    public static void menu(){
        int opt;
        Scanner teclado= new Scanner (System.in);
        Libro L1=new Libro("Don Quijote de la Mancha","Miguel de Cervantes" );
        Libro L2=new Libro("El Extranjero","Albert Camus");
        Libro L3=new Libro("Crimen y Castigo", "Friodor Dostoyeski");
        do{
        System.out.println("Bienvenido a la Biblioteca");
        System.out.println("1.1 Ver Libros");
        System.out.println("2.2 Tomar Prestado");
        System.out.println("3.3 Devolver");
        System.out.println("0.0 salir");
        System.out.println("Ingrese una opcion");
        opt=teclado.nextInt();
        switch (opt) {
            case 1:{L1.mostrarInfo();
                    L2.mostrarInfo();
                    L3.mostrarInfo();
            }
            break;
            case 2: {System.out.println("¿Que libro desea retirar?");
                    System.out.println("1.1 "+ L1.getNombre());
                    System.out.println("1.2 "+ L2.getNombre());
                    System.out.println("1.3 "+ L3.getNombre());
                int optLibro=teclado.nextInt();
                switch (optLibro) {
                    case 1: L1.prestar();
                            break;
                    case 2: L2.prestar();
                            break;
                    case 3: L3.prestar();
                            break;
                    
                }break;
            }
            case 3: {System.out.println("¿Que libro desea Devolver?");
                    System.out.println("1.1 "+ L1.getNombre());
                    System.out.println("1.2 "+ L2.getNombre());
                    System.out.println("1.3 "+ L3.getNombre());
                int optLibro=teclado.nextInt();
                switch (optLibro) {
                    case 1: L1.devolver();
                            break;
                    case 2: L2.devolver();
                            break;
                    case 3: L3.devolver();
                            break;
                    
                }break;
            }
            
           
                
        }
        
    }while(opt!=0);
        }
}
