package Strategy.logistica;

import Strategy.Tienda.Tienda;

public class Ciclista implements MetodoTransporte {
	
	@Override
	public void transportar (Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Ciclista
		
		System.out.println("Traportando por via Ciclista");
	}

}