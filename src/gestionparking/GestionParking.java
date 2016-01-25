/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionparking;

import java.util.ArrayList;
import java.util.List;

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
        List<Plaza> listaDePlazas = new ArrayList<>();
        List<Plaza> listaMotos;
        List<Plaza> listaCochesC;
        List<Plaza> listaCochesL;
  
        Parking parking = new Parking("Calle parot", "Parking Mislata");
              Moto m1 = new Moto("moto", "qwfqf");
        parking.alquilar(m1);
        m1.color="Azul";
        m1.modelo="Rieju RS2 Matrix";
        listaMotos = parking.listarPlazas("ocupadas", 'M');
        listaDePlazas.addAll(listaMotos);
        for (int i = 0; i < listaDePlazas.size(); i++) {
            System.out.println(listaDePlazas.get(i));
        }
        
        System.out.println("" + parking.ganancias());
    }
}
