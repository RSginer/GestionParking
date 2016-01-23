package gestionparking;
public class Plaza {
    
    Vehiculo v;
    private int num_plaza;
    private int num_sotano;
    private String tipo_plaza;

    public Plaza(int num_plaza, int num_sotano) {
        this.num_plaza = num_plaza;
        this.num_sotano = num_sotano;
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

    public String getTipo_plaza() {
        return tipo_plaza;
    }

    public void setTipo_veh(String tipo_plaza) {
        this.tipo_plaza = tipo_plaza;
    }
    @Override
    public String toString(){
    String texto=("Nº Plaza: " + num_plaza + " Sótano" + num_sotano);
    if(v==null){
        texto=texto.concat("\n No hay ningun vehiculo ocupando esta plaza");
    }else{
        texto=texto.concat("\n Vehiculo: " + v.getMatricula() + " " + v.getModelo() + " " + v.getColor());
    }
    return texto;}
}

