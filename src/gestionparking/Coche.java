package gestionparking;
public class Coche extends Vehiculo {
    private char tipo;

    public Coche(char tipo, String matricula, String nif_dueño) {
        super(matricula, nif_dueño);
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public char setTipo(char tipo) {
        char resultado = 'L';
        String tipoPuente = ("" + tipo);
        if (tipoPuente.equalsIgnoreCase("C")) {
            this.tipo = tipo;
            resultado = 'C';
        }
        return resultado;
    }
}
