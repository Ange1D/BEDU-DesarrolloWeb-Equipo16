public class CoberturaDecorator implements Helado {

    private Helado helado;
    private String descripcion = "con Cobertura";
    private double precio = 20;

    public CoberturaDecorator(Helado helado) {
        this.helado = helado;
    }

    public String getDescripcion() {
        return helado.getDescripcion() + descripcion + " $" + precio + "\n" ;
    }

    public double getPrecio() {
        return helado.getPrecio() + precio;
    }

}