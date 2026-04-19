
package trabajopractico2;

import java.util.Random;

public class Libro {
private boolean estado;
private String autor;
private String nombre;
private String isbn;

    public Libro(String nombre, String autor){
    this.nombre=nombre;
    this.autor=autor;
    this.isbn=isbn();
    this.estado=new Random().nextBoolean();
    }
    
    private String isbn(){
    
    Random rand = new Random();
    StringBuilder isbn = new StringBuilder("978-");
    for (int i = 0; i < 10; i++) {
        isbn.append(rand.nextInt(10));
    }
    return isbn.toString();
    }

public String getEstado(){
    if (estado) 
        {return "Esta disponible, se encuentra en la seccion correspondiente";}
        
     else  {return  "No esta dispobible el libro o no se encuentra en la biblioteca";}
    }
public String getNombre(){
    
    return nombre;
}

public void prestar(){
    if (estado) {
        estado= false;
        System.out.println("El libro ha sido correctamete prestado.");
    } else { System.out.println("El libro no se encuentra disponible.");
    }
}
public void devolver(){
    estado=true;
    System.out.println("El libro ha sido devuelto ");
    
}

public void mostrarInfo(){
    System.out.println("Nombre del Libro: " + nombre);
    System.out.println("Autor: " + autor);
    System.out.println("ISBN: " + isbn);
    System.out.println("Estado: " + getEstado());
}
}


