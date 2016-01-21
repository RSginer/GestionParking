package gestionparking;
public class Plaza {
    
    private String veh_plaza;
    private int num_plaza;
    private int num_sotano;
    private char tipo_veh;

    public Plaza(int num_plaza, int num_sotano) {
        this.num_plaza = num_plaza;
        this.num_sotano = num_sotano;
    }

    public String getVeh_plaza() {
        return veh_plaza;
    }

    public void setVeh_plaza(String veh_plaza) {
        this.veh_plaza = veh_plaza;
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

    public char getTipo_veh() {
        return tipo_veh;
    }

    public void setTipo_veh(char tipo_veh) {
        this.tipo_veh = tipo_veh;
    }
    
}

