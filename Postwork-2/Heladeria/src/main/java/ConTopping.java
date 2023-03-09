public class ConTopping extends ExtraDecorator {
   Helado helado;

   public ConTopping( Helado helado ) {
      this.helado = helado;
   }

   public String getDescripcion() {
      return helado.getDescripcion() + ", Con Topping";
   }

   public double costo() {
      return helado.costo() + 20;
   }

}