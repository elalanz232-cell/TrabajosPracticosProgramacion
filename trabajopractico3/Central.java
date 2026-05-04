/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

import java.util.ArrayList;
import java.util.List;


public class Central {
    
    private List<Object> dispositivos = new ArrayList<>();
    
    public void agregar(Object d) {
        dispositivos.add(d);
    }
    
    public void conectarTodos() {
        for (Object d : dispositivos) {
            if (d instanceof ConectarWiFi) {
                ((ConectarWiFi) d).conectarWifi();
            }
        }
    }
    
    public void fotografiarTodos() {
        for (Object d : dispositivos) {
            if (d instanceof TomarFoto) {
                ((TomarFoto) d).tomarFoto();
            }
        }
    }
}

