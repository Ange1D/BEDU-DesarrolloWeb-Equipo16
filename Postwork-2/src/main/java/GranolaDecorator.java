	public class GranolaDecorator implements Helado {

	    private Helado helado;
		 private String descripcion = "con Granola";
		 private double precio = 10;

	    public GranolaDecorator(Helado helado) {
	        this.helado = helado;
	    }

	    public String getDescripcion() {
	        return helado.getDescripcion() + descripcion + " $" + precio + "\n";
	    }

	    public double getPrecio() {
	        return helado.getPrecio() + precio;
	    }

	}
	
	

