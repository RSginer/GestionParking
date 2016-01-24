package gestionparking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ruben
 */
public class Parking {

    Vehiculo cocheJefe = new Coche("L", "J9821VLC", "23847658Q");
    public String nombreDeParking;
    public String direccion;
    private final Map<String, Plaza> listaPlazas = new HashMap<>();

    public Parking(String nombreDeParking, String direccion) {
        this.nombreDeParking = nombreDeParking;
        this.direccion = direccion;
        Plaza p1 = new Plaza(1, 1, "C");
        Plaza p2 = new Plaza(1, 2, "L");
        p2.setVeh_plaza(cocheJefe);
        Plaza p3 = new Plaza(1, 3, "C");
        Plaza p4 = new Plaza(1, 4, "L");
        Plaza p5 = new Plaza(2, 1, "M");
        Plaza p6 = new Plaza(2, 2, "L");
        Plaza p7 = new Plaza(2, 3, "M");
        Plaza p8 = new Plaza(2, 4, "M");
        listaPlazas.put("" + p1.getNum_sotano() + "" + p1.getNum_plaza(), p1);
        listaPlazas.put("" + p2.getNum_sotano() + "" + p2.getNum_plaza(), p2);
        listaPlazas.put("" + p3.getNum_sotano() + "" + p3.getNum_plaza(), p3);
        listaPlazas.put("" + p4.getNum_sotano() + "" + p4.getNum_plaza(), p4);
        listaPlazas.put("" + p5.getNum_sotano() + "" + p5.getNum_plaza(), p5);
        listaPlazas.put("" + p6.getNum_sotano() + "" + p6.getNum_plaza(), p6);
        listaPlazas.put("" + p7.getNum_sotano() + "" + p7.getNum_plaza(), p7);
        listaPlazas.put("" + p8.getNum_sotano() + "" + p8.getNum_plaza(), p8);
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

    public String alquilar(Vehiculo v) {
        String respuesta = null;
        for (Plaza valor : listaPlazas.values() && respuesta==null) {
            if (v instanceof Moto && valor.getTipo_plaza().equalsIgnoreCase("M") && valor.ocupada == false) {
                respuesta = ("" + valor.getNum_sotano() + "" + valor.getNum_plaza());
            } else if (v instanceof Coche) {
                Coche c = (Coche) v;
                if (c.getTipo().equalsIgnoreCase(valor.getTipo_plaza()) && valor.ocupada == false) {
                    respuesta = ("" + valor.getNum_sotano() + "" + valor.getNum_plaza());
                }
            }
        }
        return respuesta;
    }
    
    public List<Plaza> listarPlazas(String estado, char tipoVehiculo){
    List<Plaza> lista = new ArrayList<>();
    String tipo = (String) tipoVehiculo;
    boolean ocupadas=true;
    if(estado.equalsIgnoreCase("libres")){
    ocupadas=false;
    }
   
    for(Plaza valor : listaPlazas.values()){
        if(ocupadas==valor.ocupada && valor.getTipo_plaza().equalsIgnoreCase(tipoVehiculo)){
            lista.
        }
    
    }
    return lista;}

    public int darBaja(String sNN) {
        int respuesta = 1;
        Plaza p = listaPlazas.get(sNN);
        if (p.ocupada) {
            p.sacarVehiculo();
            respuesta = 0;
        } else if (p.ocupada == false) {
            respuesta = 2;
        }
        return respuesta;
    }

    public Plaza getPlaza(String sNN) {
        Plaza p = null;
        if (listaPlazas.get(sNN) != null) {
            p = listaPlazas.get(sNN);
        }
        return p;
    }

}
