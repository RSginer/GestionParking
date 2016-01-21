package gestionparking;

public abstract class Vehiculo {

    protected String matricula;
    protected String modelo;
    protected String color;
    protected String nif_dueño;
    protected long numero_movil;

    public Vehiculo(String matricula, String nif_dueño) {
        this.matricula = matricula;
        this.nif_dueño = nif_dueño;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNif_dueño() {
        return nif_dueño;
    }

    public void setNif_dueño(String nif_dueño) {
        this.nif_dueño = nif_dueño;
    }

    public long getNumero_movil() {
        return numero_movil;
    }

    public boolean setNumero_movil(long numero_movil) {
        String movil = ("" + numero_movil);
        boolean guardado=false;
        if (movil.length() == 9) {
            this.numero_movil = numero_movil;
            guardado = true;
        } 
        return guardado;
    }

    @Override
    public String toString() {
        return "'" + matricula + modelo + color + "'";
    }
    
    
    
} 

