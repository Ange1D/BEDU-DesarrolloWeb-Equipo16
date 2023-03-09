public class MermeladaDecorator extends ExtraDecorator {
    private final Helado helado;
    private final int precioTopping = 20;
    private final String descripcionTopping = "Con Mermelada";

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescripcion(){
        return String.format("%s\n%s -- $%d", helado.getDescripcion(), descripcionTopping, precioTopping);
    }

    @Override
    public double costo() {
        return helado.costo()+precioTopping;
    }
}
