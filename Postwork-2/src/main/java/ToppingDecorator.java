public class ToppingDecorator implements Helado {

   Helado helado;
   private String descripcion = "con Topping";
   private double precio = 20;

   public ToppingDecorator( Helado helado ) {
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
