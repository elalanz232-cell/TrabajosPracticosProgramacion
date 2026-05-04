
package juegorol;

import java.util.ArrayList;
import java.util.List;

public class JuegoRol {


    public static void main(String[] args) {
       
        List<EntidadEspacial> entidades = new ArrayList<>();
        entidades.add(new Guerrero(0, 0, 100));
        entidades.add(new MagoElfo(1, 1, 80, 1000));
        entidades.add(new Ogro(2, 2, 120));
        entidades.add(new Dragon(3, 3, 150));


        for (EntidadEspacial e : entidades) {
        e.actualizarCoordenadas(5, 5);
        }


        for (EntidadEspacial e : entidades) {
                if (e instanceof SerVivo) {
                    ((SerVivo) e).recibirDanio(30);
                    System.out.println(e + " vivo: " + ((SerVivo) e).estaVivo());
                }
        }


        for (EntidadEspacial e : entidades) {
                if (e instanceof LanzarHechizo) {
                    ((LanzarHechizo) e).lanzarHechizo();
                }
        }
    }
    
}
