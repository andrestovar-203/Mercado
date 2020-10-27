package mercado;

class Carrito {
    private int cantidad;
    private Boolean libre;

    public Carrito(int cantidad, Boolean libre) {
        this.cantidad = cantidad;
        this.libre = libre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getLibre() {
        return libre;
    }

    public void setLibre(Boolean libre) {
        this.libre = libre;
    }
    
    
}
