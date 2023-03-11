public class ToppingDecorator implements Helado {
   Helado helado;

   public ToppingDecorator( Helado helado ) {
      this.helado = helado;
   }

   @Override
   public String getDescription() {
      return helado.getDescription() + ", Con Topping";
   }

   @Override
   public double getPrice() {
      return helado.getPrice() + 20;
   }

}
