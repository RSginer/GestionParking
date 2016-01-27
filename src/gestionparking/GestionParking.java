package gestionparking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionParking {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = false;
        int contador=0;
        LocalDate hoy = LocalDate.now();
        Parking parking = new Parking("Rasul-Rubén : Super Cars and another Vehicles, etc.");
        Scanner sc = new Scanner(System.in);
        Scanner ln = new Scanner(System.in);
        Vehiculo v;
        String niffDueño;
        String matricula;
        String tipo;
        char tipoVehiculo;
        String sNN;
        do {
            String plaza = "Ninguna"; 
            int darBaja;
            int menu;
            System.out.println("MENU PRINCIPAL \n");
            System.out.println("1. Alquilar plaza");
            System.out.println("2. Dar de baja");
            System.out.println("3. Ganancias");
            System.out.println("4. Cerrar oficina y listar plazas libres \n");
            System.out.print("Elije una opcion: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1: {
                    System.out.println("Introduce el niff del dueño:");
                    niffDueño = ln.nextLine();
                    System.out.println("Introduce la matricula del vehiculo");
                    matricula = ln.nextLine();
                    System.out.println("Introduce el tipo de vehiculo (Moto: M / Coche corto: C / Coche Largo: L )");
                    tipo = ln.nextLine();
                    if (tipo.equalsIgnoreCase("M")) {
                        v = new Moto(matricula, niffDueño);
                        plaza = parking.alquilar(v);
                    } else if (tipo.equalsIgnoreCase("C")) {
                        tipoVehiculo = 'C';
                        v = new Coche(tipoVehiculo, matricula, niffDueño);
                        plaza = parking.alquilar(v);
                    } else if (tipo.equalsIgnoreCase("L")) {
                        tipoVehiculo = 'L';
                        v = new Coche(tipoVehiculo, matricula, niffDueño);
                        plaza = parking.alquilar(v);
                    }
                    if (plaza == null) {
                        System.out.println("No hay plazas libres para su vehiculo, lo sentimos");
                    } else {
                        System.out.println("Su plaza asignada es: " + plaza);
                    }
                    break;
                }

                case 2: {
                    System.out.println("Introduzca su sNN:");
                    sNN = ln.nextLine();
                    darBaja = parking.darBaja(sNN);
                switch (darBaja) {
                    case 0:
                        System.out.println("Se ha borrado correctamente.");
                        break;
                    case 1:
                        System.out.println("La plaza introducida no existe.");
                        break;
                    case 2:
                        System.out.println("La plaza introducida esta vacia.");
                        break;
                    default:
                        break;
                }
                    break;
                }
                case 3: {
                    System.out.println("El Parking " + parking.nombreDeParking + " ganara este mes " + parking.ganancias() + "€");
                    break;
                }
                case 4: {
                    System.out.println("\n");
                    List<Plaza> listaMotos = parking.listarPlazas("libres",'M');
                    System.out.println("Listado de plazas libres de Moto a fecha " + hoy + "\n");
                    for (int i = 0; i < listaMotos.size(); i++) {
                        System.out.println(listaMotos.get(i));
                        contador++;
                    }
                    System.out.println("\n");
                     List<Plaza> listaCochesCortos = parking.listarPlazas("libres",'C'); 
                     List<Plaza> listaCochesLargos = parking.listarPlazas("libres",'L');
                     List<Plaza> listaCoches = new ArrayList<>();
                     listaCoches.addAll(listaCochesLargos);
                     listaCoches.addAll(listaCochesCortos);
                    System.out.println("Listado de plazas libres de Coche a fecha " + hoy + "\n");
                    for (int i = 0; i < listaCoches.size(); i++) {
                        System.out.println(listaCoches.get(i));
                        contador++;
                    }              
                    System.out.println("\n");
                                    
                    System.out.println("\n");
                    System.out.println("Total libres: " + contador);
                    salir=true;
                    break;
                }
                default:{
                    salir=true;
                }
            }
        } while (salir == false);
    }
}
