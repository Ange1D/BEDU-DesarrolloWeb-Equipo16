public class ConCobertura extends ExtraDecorator {
   Helado helado;

   public ConCobertura( Helado helado ) {
      this.helado = helado;
   }

   public String getDescripcion() {
      return helado.getDescripcion() + ", Con Cobertura";
   }

   public double costo() {
      return helado.costo() + 20;
   }

}