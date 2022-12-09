package Strategy.logistica;

import Strategy.Tienda.Tienda;

public class Fluvial implements MetodoTransporte {

	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Fluvial

		System.out.println("Traportando por via Fluvial");
	}
	
	

}
