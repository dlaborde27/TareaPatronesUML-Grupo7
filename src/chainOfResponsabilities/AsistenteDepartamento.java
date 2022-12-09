package chainOfResponsabilities;

import  java.time.LocalDate ;


public class AsistenteDepartamento extends Trabajador{
    
   

	@Override
	public boolean aprobarCambio(Producto a) {
		 if(LocalDate.now().isBefore(a.getLimiteGarantia()) && getNext()!=null) {
	        	System.out.println("limite valido\n");
	        	return getNext().aprobarCambio(a);
	        }
	    	System.out.println("limite no valido\n");
	        return false;
	}

}