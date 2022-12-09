package Strategy.logistica;

import Strategy.Tienda.Tienda;

public class Ferrea implements MetodoTransporte {
	
	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Ferrea

		System.out.println("Traportando por via Ferrea");
	}
}