package gestionparking;

public class Plaza {

    Vehiculo v;
    private int num_plaza;
    private int num_sotano;
    private char tipo_plaza;

    public Plaza(int num_sotano,int num_plaza, char tipo_plaza) {
        this.num_plaza = num_plaza;
        this.num_sotano = num_sotano;
        this.tipo_plaza = tipo_plaza;
    }
    
    public Vehiculo getVeh_plaza() {
        return v;
    }

    public void setVeh_plaza(Vehiculo v) {
        this.v = v;
    }

    public int getNum_plaza() {
        return num_plaza;
    }

    public void setNum_plaza(int num_plaza) {
        this.num_plaza = num_plaza;
    }

    public int getNum_sotano() {
        return num_sotano;
    }

    public void setNum_sotano(int num_sotano) {
        this.num_sotano = num_sotano;
    }

    public char getTipo_plaza() {
        return tipo_plaza;
    }

    public void setTipo_veh(char tipo_plaza) {
        this.tipo_plaza = tipo_plaza;
    }

    public int precio() {
        int precio = 0;
        if (this.v!=null) {
            if (v instanceof Moto) {
                precio = 25;
            } else if (v instanceof Coche) {
                Coche c = (Coche) v;
                String tipoPuente = ("" + c.getTipo());                
                if (tipoPuente.equalsIgnoreCase("C")) {
                    precio = 40;
                } else {
                    precio = 55;
                }
            }
            if (this.num_sotano == 2) {
                precio -= 5;
            }
       }
        return precio;
    }

    @Override
    public String toString() {
        String sotano="";
        if(num_sotano==1){
        sotano="Primero";
        }else if(num_sotano==2){
        sotano="Segundo";
        }
        String texto = ("Nº Plaza: " + num_plaza + " Sótano: " + sotano);
        if (v == null) {
            texto = texto.concat("\n");
        } else {
            texto = texto.concat("\n Vehiculo: " + v.getMatricula() + " " + v.getModelo() + " " + v.getColor());
        }
        return texto;
    }
}
