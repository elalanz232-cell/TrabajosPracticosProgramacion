/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;


public class Telefono implements TomarFoto, ConectarWiFi {
      
    @Override
    public void tomarFoto() {
        System.out.println("Telefono: ");
        System.out.println("Tomando fotografia");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Conectando a la red WiFi");
    }
    
}
