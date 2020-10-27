package mercado;

public class Bodega extends Mercado{
    private int ubicacion;
    private String productosAlmacenados;
    private String revision;
    
    public Bodega(String nombreSuperMercado, 
            Boolean protocolo, 
            String gerente, 
            date añoDeFundacion, 
            int aproximadoDeVentas, 
            int numeroDeEmpleados){
        super(nombreSuperMercado, 
                protocolo, 
                gerente, 
                añoDeFundacion, 
                aproximadoDeVentas, 
                numeroDeEmpleados);
    }
}
