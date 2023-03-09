public class MermeladaDecorator extends HeladoDecorator {
    private final Helado helado;
    private final int precioTopping = 20;
    private final String descripcionTopping = "Con Mermelada";

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String descripcion(){
        return String.format("%s\n%s -- $%d", helado.descripcion(), descripcionTopping, precioTopping);
    }

    @Override
    public int precio() {
        return helado.precio()+precioTopping;
    }
}
