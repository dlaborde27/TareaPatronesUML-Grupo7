package Strategy.logistica;

import Strategy.Tienda.Tienda;

public class Automotriz implements MetodoTransporte {
	
	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Automotriz
		
		System.out.println("Traportando por via Automotriz");
	}

}