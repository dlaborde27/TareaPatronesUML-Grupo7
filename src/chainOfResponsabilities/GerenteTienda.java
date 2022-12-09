package chainOfResponsabilities;

public class GerenteTienda extends Trabajador{
    
    public boolean aprobarCambio(Producto a){
    	//depende del criterio del gerente si se da la devolucion
    	System.out.println("devolucion aceptada");
    	return true;
    }
}