package gestionparking;
public class Coche extends Vehiculo {

    private String tipo;

    public Coche(String tipo, String matricula, String nif_dueño) {
        super(matricula, nif_dueño);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String setTipo(String tipo) {
        String resultado = "L";
        if (tipo.equalsIgnoreCase("C")) {
            this.tipo = tipo;
            resultado = "C";
        }
        return resultado;
    }
}
