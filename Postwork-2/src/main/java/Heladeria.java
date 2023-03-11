public class Heladeria {

  public static void main(String [] args) {
    Helado suave = new HeladoSuave();             // $30
    suave        = new CoberturaDecorator(suave); // $20
    suave        = new GranolaDecorator(suave);   // $10
    suave        = new ToppingDecorator(suave);   // $20
    suave        = new MermeladaDecorator(suave); // $10
    suave        = new GalletaDecorator(suave);   // $15

    // Total = 30 + 20 + 10 + 20 + 10 + 15 = 105
    System.out.println( "[Ticket de compra]\n" );
    System.out.println( suave.getDescripcion() );
    System.out.println( "Total $" + suave.getPrecio() );
  }

}