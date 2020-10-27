package mercado;

class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Boolean trabajando;

    public Persona(String nombre, String apellido, int edad, Boolean trabajando) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.trabajando = trabajando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getTrabajando() {
        return trabajando;
    }

    public void setTrabajando(Boolean trabajando) {
        this.trabajando = trabajando;
    }

    boolean getNumeroDeCaja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
