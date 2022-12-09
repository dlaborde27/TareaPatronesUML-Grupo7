package Strategy.logistica;

import Strategy.Tienda.Tienda;

public class Distribucion {
	
	private MetodoTransporte metodo;

	public void setTransporte(MetodoTransporte metodo) {
		this.metodo = metodo;
	}
	
	public void transportar( Tienda Origen,  Tienda Destino) {
		
		metodo.transportar(Origen, Destino);
	}

	

}