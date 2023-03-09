public class Heladeria {

   public static void main( String[] args ) {

      Helado helado = new HeladoSuave();
      helado = new ConGranola( helado );
      helado = new ConMermelada( helado );
      helado = new ConGalleta( helado );

      System.out.println(
         helado.getDescripcion() +
            " $"  + helado.costo()
      );

   }

}
