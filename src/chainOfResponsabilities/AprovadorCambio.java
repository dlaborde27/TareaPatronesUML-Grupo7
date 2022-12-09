package chainOfResponsabilities;
public interface AprovadorCambio {
	
    public void setNext(AprovadorCambio ac);
    
    public boolean aprobarCambio(Producto a);
}