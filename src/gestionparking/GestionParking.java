/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionparking;

/**
 *
 * @author ruben
 */
public class GestionParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String prueba=" ";
        Vehiculo comprobar;
        Vehiculo v1 = new Moto("V2835GB","23847658Q");
        Plaza p1 = new Plaza(4,2);
        p1.setVeh_plaza(v1);
       comprobar = p1.getVeh_plaza();
        if(comprobar instanceof Coche){
        Coche c1 = (Coche) comprobar;
        prueba = c1.getTest();
        }else if(comprobar instanceof Moto){
        Moto m1 = (Moto) comprobar;
        prueba = m1.getTest();
        }
        System.out.println(prueba);
        
    }
    
}
