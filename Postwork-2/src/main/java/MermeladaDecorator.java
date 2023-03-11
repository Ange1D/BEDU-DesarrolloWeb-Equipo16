public class MermeladaDecorator implements Helado {
    private final Helado helado;
    private final int precioTopping = 20;
    private final String descripcionTopping = "Con Mermelada";

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public String getDescription(){
        return String.format("%s\n%s -- $%d", helado.getDescription(), descripcionTopping, precioTopping);
    }

    @Override
    public int getPrice() {
        return helado.getPrice()+precioTopping;
    }
}
