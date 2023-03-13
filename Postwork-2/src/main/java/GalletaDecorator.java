public class GalletaDecorator implements Helado {

    private Helado helado;
    private String descripcion = "con Galleta";
    private double precio = 15;

    public GalletaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescripcion() {
        return helado.getDescripcion() + descripcion + " $" + precio + "\n";
    }

    @Override
    public double getPrecio() {
        return helado.getPrecio() + precio;
    }

}