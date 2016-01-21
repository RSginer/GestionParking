package gestionparking;
public class Moto extends Vehiculo{
    
    private int num_ruedas;
    private String test="Soy una moto loco";
    public Moto(String matricula, String nif_dueño) {
        super(matricula, nif_dueño);
    }

    public String getTest() {
        return test;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }
    
}
