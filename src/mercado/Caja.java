package mercado;

public class Caja extends Persona{
    private int numeroDeCaja;
    private Boolean abierta;
    
    public Caja(String nombre, String apellido, int edad, Boolean trabajando, int numeroDeCaja, Boolean abierta){
        super(nombre, apellido, edad, trabajando);
        this.abierta = abierta;
        this.numeroDeCaja = numeroDeCaja;
    }

    public int getNumeroDeCaja() {
        return numeroDeCaja;
    }

    public void setNumeroDeCaja(int numeroDeCaja) {
        this.numeroDeCaja = numeroDeCaja;
    }

    public Boolean getAbierta() {
        return abierta;
    }

    public void setAbierta(Boolean abierta) {
        this.abierta = abierta;
    }
    
}

