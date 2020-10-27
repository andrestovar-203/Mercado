package mercado;

public class Mercado {
    private String nombreSuperMercado;
    private Boolean protocolo;
    private String gerente;
    private date añoDeFundacion;
    private int aproximadoDeVentas;
    private int numeroDeEmpleados;
    
    //Composicion y agregacion
    
    private Persona personal = null;
    private Carrito carritoDeSuperMercado;

    public Persona getPersonal() {
        return personal;
    }

    public void setPersonal(Persona personal) {
        this.personal = personal;
    }

    public Carrito getCarritoDeSuperMercado() {
        return carritoDeSuperMercado;
    }

    public void setCarritoDeSuperMercado(Carrito carritoDeSuperMercado) {
        this.carritoDeSuperMercado = carritoDeSuperMercado;
    }
    
    public Mercado(String nombreSuperMercado, Boolean protocolo, String gerente, date añoDeFundacion, int aproximadoDeVentas, int numeroDeEmpleados) {
        this.nombreSuperMercado = nombreSuperMercado;
        this.protocolo = protocolo;
        this.gerente = gerente;
        this.añoDeFundacion = añoDeFundacion;
        this.aproximadoDeVentas = aproximadoDeVentas;
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.carritoDeSuperMercado = new Carrito(500, true);
    }
    
    public void cantidades(){
        this.numeroDeEmpleados +=20;
        this.aproximadoDeVentas +=400;
        this.protocolo = true;
    }
    
    public void personal(String nuevoNombreSuperMercado, String nuevoGerente){
        this.nombreSuperMercado = nuevoNombreSuperMercado;
        this.gerente = nuevoGerente;
    }

    public String getNombreSuperMercado() {
        return nombreSuperMercado;
    }

    public void setNombreSuperMercado(String nombreSuperMercado) {
        this.nombreSuperMercado = nombreSuperMercado;
    }

    public Boolean getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Boolean protocolo) {
        this.protocolo = protocolo;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public date getAñoDeFundacion() {
        return añoDeFundacion;
    }

    public void setAñoDeFundacion(date añoDeFundacion) {
        this.añoDeFundacion = añoDeFundacion;
    }

    public int getAproximadoDeVentas() {
        return aproximadoDeVentas;
    }

    public void setAproximadoDeVentas(int aproximadoDeVentas) {
        this.aproximadoDeVentas = aproximadoDeVentas;
    }

    public int getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    public void setNumeroDeEmpleados(int numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }
    
    

    public static void main(String[] args) {
        Mercado supervision = new Mercado("MercaTodo", 
                true, 
                "Andres Tovar", 
                new date(), 
                500, 
                30);
        
        
        Caja cajaUno = new Caja("Sara", 
                "Lopez", 
                27, 
                false, 
                101, 
                false);
        
        supervision.setPersonal(cajaUno);
        
        System.out.println("El nombre de la cajera es");
        System.out.println(supervision.getPersonal().getNombre());
        System.out.println("Apellido:");
        System.out.println(supervision.getPersonal().getApellido());
        System.out.println("Edad:");
        System.out.println(supervision.getPersonal().getEdad());
        System.out.println("Dia de trabajo:");
        System.out.println(supervision.getPersonal().getTrabajando());
        
    }
    
}
