package Strategy.logistica;

import Strategy.Tienda.Tienda;

public class Aerea implements MetodoTransporte {
	
	@Override
	public void transportar(Tienda Origen, Tienda Destino) {
		
		//Logica de trasporte Aereo
		
		System.out.println("Traportando por via Aerea");
	}

}