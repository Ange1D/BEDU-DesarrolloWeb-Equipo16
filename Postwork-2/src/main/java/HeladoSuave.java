public class HeladoSuave implements Helado {
    private final String nombreHelado = "Helado suave";
    private int precioHelado = 30;
    @Override
    public String descripcion() {
        return String.format("\n%s -- $%d", nombreHelado, precioHelado);
    }

    @Override
    public int precio() {
        return precioHelado;
    }
}
