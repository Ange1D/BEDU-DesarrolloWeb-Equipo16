public class ConGalleta extends ExtraDecorator {
   Helado helado;

   public ConGalleta( Helado helado ) {
      this.helado = helado;
   }

   public String getDescripcion() {
      return helado.getDescripcion() + ", Con Galleta";
   }

   public double costo() {
      return helado.costo() + 15;
   }

}