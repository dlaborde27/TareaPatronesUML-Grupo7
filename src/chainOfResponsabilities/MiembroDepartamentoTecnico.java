package chainOfResponsabilities;

import java.util.ArrayList;
import java.util.List;

public class MiembroDepartamentoTecnico extends Trabajador{
	private boolean flag = true;
	List<Fallo> fallosArticulos = new ArrayList<>();
	
	public MiembroDepartamentoTecnico(){
		fallosArticulos.add(Fallo.BATERIADANIADA);
	}
    
   

	@Override
	public boolean aprobarCambio(Producto a) {
		List<Fallo> fallos = a.getFallo(); 
    	for(Fallo f:fallos) {
    		flag = flag && fallosArticulos.contains(f);
    	}
        if(flag) {
        	System.out.println("fallo cubierto por garantia\n");
        	return getNext().aprobarCambio(a);
        }
        flag = true;
        System.out.println("fallo no cubierto por garantia\n");
        return false;
	}







}