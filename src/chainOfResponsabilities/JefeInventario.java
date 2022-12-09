package chainOfResponsabilities;

public class JefeInventario extends Trabajador{
    
    public boolean aprobarCambio(Producto a){
        if(a.getPrecio()<1000) {
        	System.out.println("precio valido\n");
        	return getNext().aprobarCambio(a);
        }
        System.out.println("precio no valido\n");
        return false;
    }

}