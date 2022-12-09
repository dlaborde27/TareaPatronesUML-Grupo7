package chainOfResponsabilities;

public  abstract  class  Trabajador  implements  AprovadorCambio {
    private AprovadorCambio  siguiente ;
    
    public  AprovadorCambio getNext (  ) {
    	return siguiente ;
    };
    
    
    public  void  setNext ( AprovadorCambio  ac ){
        siguiente = ac ;
       }
    
    public  boolean  aprobarCambio ( Producto  a ){
        if ( siguiente != null ) return siguiente.aprobarCambio ( a );
        return true ;
        }
    protected Trabajador obtenerSiguiente() {
		return null;
	}

}