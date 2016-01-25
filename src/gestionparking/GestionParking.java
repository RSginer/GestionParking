package gestionparking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionParking {

    public static void main(String[] args) {
        // TODO code application logic here
       boolean salir=false;
       Parking parking = new Parking("Parking Rasul-ByDiro");
       Scanner sc = new Scanner(System.in);
       Scanner ln = new Scanner(System.in);
       Vehiculo v;
       String niffDueño;
       String matricula;
       String tipo;
       char tipoVehiculo;
       do{      
           String plaza="Ninguna";
           int menu=0;
           System.out.println("MENU PRINCIPAL \n");
           System.out.println("1. Alquilar plaza");
           System.out.println("2. Dar de baja");
           System.out.println("3. Cerrar oficina \n");
           System.out.print("Elije una opcion: ");
           menu = sc.nextInt();
           switch(menu){
           
               case 1:{
                   System.out.println("Introduce el niff del dueño:");
                   niffDueño=ln.nextLine();
                   System.out.println("Introduce la matricula del vehiculo");
                   matricula=ln.nextLine();
                   System.out.println("Introduce el tipo de vehiculo (Moto: M / Coche corto: C / Coche Largo: L )");
                   tipo = ln.nextLine();
                   if(tipo.equalsIgnoreCase("M")){
                   tipoVehiculo='M';
                   v = new Moto(matricula,niffDueño);
                     plaza = parking.alquilar(v);
                   }else if(tipo.equalsIgnoreCase("C")){
                   tipoVehiculo='C';
                   v = new Coche(tipoVehiculo,matricula,niffDueño);
                     plaza = parking.alquilar(v);
                   }else if(tipo.equalsIgnoreCase("L")){
                   tipoVehiculo='L';
                   v = new Coche(tipoVehiculo,matricula,niffDueño);
                     plaza = parking.alquilar(v);
                   }
                 
                   System.out.println("Su plaza asignada es: " + plaza);
                   
               break;}
               
               case 2:{
               
               
               break;}
               
               case 3:{
               
               break;}
           
           
           
           }
       
       }while(salir==false);
    }
    
    
    
}
