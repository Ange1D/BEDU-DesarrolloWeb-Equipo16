public class ConMermelada extends ExtraDecorator {
   Helado helado;

   public ConMermelada( Helado helado ) {
      this.helado = helado;
   }

   public String getDescripcion() {
      return helado.getDescripcion() + ", Con Mermelada";
   }

   public double costo() {
      return helado.costo() + 10;
   }

}