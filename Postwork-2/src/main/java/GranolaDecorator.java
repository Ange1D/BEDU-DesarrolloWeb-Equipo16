	public class GranolaDecorator implements Helado {

	    private Helado helado;
		 private String descripcion = "con Granola";
		 private double precio = 10;

	    public GranolaDecorator(Helado helado) {
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
	
	

