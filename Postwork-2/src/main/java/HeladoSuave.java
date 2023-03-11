public class HeladoSuave implements Helado {

    private String descripcion = "Helado suave";
    private double precio= 30;

    public String getDescripcion() {
        return descripcion + " $" + precio + "\n";
    }

    public double getPrecio() {
        return precio;
    }

}
