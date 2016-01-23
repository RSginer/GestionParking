package gestionparking;

import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
public class Parking {
   Vehiculo cocheJefe = new Coche("L","J9821VLC","23847658Q");
   public String nombreDeParking;
   public String direccion;
   private Map <String,Plaza> listaPlazas = new HashMap<>();

    public Parking(String nombreDeParking, String direccion) {
        this.nombreDeParking = nombreDeParking;
        this.direccion = direccion;
        Plaza p1 = new Plaza(1,1,"C");
        Plaza p2 = new Plaza(1,2,"L");
        p2.setVeh_plaza(cocheJefe);
        Plaza p3 = new Plaza(1,3,"C");
        Plaza p4 = new Plaza(1,4,"L");
        Plaza p5 = new Plaza(2,1,"C");
        Plaza p6 = new Plaza(2,2,"L");
        Plaza p7 = new Plaza(2,3,"C");
        Plaza p8 = new Plaza(2,4,"L");
        listaPlazas.put("" + p1.getNum_sotano() + "" + p1.getNum_plaza(),p1);
        listaPlazas.put("" + p2.getNum_sotano() + "" + p2.getNum_plaza(),p2);
        listaPlazas.put("" + p3.getNum_sotano() + "" + p3.getNum_plaza(),p3);
        listaPlazas.put("" + p4.getNum_sotano() + "" + p4.getNum_plaza(),p4);
        listaPlazas.put("" + p5.getNum_sotano() + "" + p5.getNum_plaza(),p5);
        listaPlazas.put("" + p6.getNum_sotano() + "" + p6.getNum_plaza(),p6);
        listaPlazas.put("" + p7.getNum_sotano() + "" + p7.getNum_plaza(),p7);
        listaPlazas.put("" + p8.getNum_sotano() + "" + p8.getNum_plaza(),p8);
    }

    public String getNombreDeParking() {
        return nombreDeParking;
    }

    public void setNombreDeParking(String nombreDeParking) {
        this.nombreDeParking = nombreDeParking;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
   
}
