public class MermeladaDecorator implements Helado {

    private Helado helado;
    private String descripcion= "con Mermelada";
    private double precio = 10;

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }

    public String getDescripcion(){
        return helado.getDescripcion() + descripcion + " $" + precio + "\n";
    }

    public double getPrecio() {
        return helado.getPrecio() + precio;
    }

}
