public class ConGranola extends ExtraDecorator {
   Helado helado;

   public ConGranola( Helado helado ) {
      this.helado = helado;
   }

   public String getDescripcion() {
      return helado.getDescripcion() + ", Con Granola";
   }

   public double costo() {
      return helado.costo() + 10;
   }

}