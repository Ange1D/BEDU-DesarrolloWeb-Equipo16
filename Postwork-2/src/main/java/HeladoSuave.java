public class HeladoSuave implements Helado {

    private String descripcion = "Helado suave";
    private double precio= 30;

    @Override
    public String getDescripcion() {
        return descripcion + " $" + precio + "\n";
    }

    @Override
    public double getPrecio() {
        return precio;
    }

}
