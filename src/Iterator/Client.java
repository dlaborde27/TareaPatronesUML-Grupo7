package Iterator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Strategy.Tienda.Coordenadas;
import Strategy.Tienda.Tienda;
import Strategy.logistica.Automotriz;
import Strategy.logistica.Distribucion;
import Strategy.logistica.Ferrea;
import Strategy.logistica.MetodoTransporte;

import chainOfResponsabilities.AsistenteDepartamento;
import chainOfResponsabilities.Fallo;
import chainOfResponsabilities.GerenteTienda;
import chainOfResponsabilities.JefeInventario;
import chainOfResponsabilities.MiembroDepartamentoTecnico;
import chainOfResponsabilities.Producto;

public class Client {
public static void main(String[] args ) {
		
		//Secuencia Patron Iterator
		FaultyProducts f1= new FaultyProducts("iPhone 11","Bateria degradada");
		FaultyProducts f2= new FaultyProducts("Epson L355","Sistema de impresion dañado");
		FaultyProducts f3= new FaultyProducts("LG LT56","Puerto HDMI comprometido");
		List<FaultyProducts> fp= new ArrayList<FaultyProducts>();
		fp.add(f1);
		fp.add(f2);
		fp.add(f3);
		
		Iterator<FaultyProducts> it=fp.iterator();
		while(it.hasNext()) {
			System.out.println("Producto con falla: "+it.next());
		}
		
		//Secuencia Patron Strategy
		
		Tienda tienda_A = new Tienda(new Coordenadas(1.05 , -79.2));
		Tienda tienda_B = new Tienda(new Coordenadas(-2.18333 , -79.8833 ));
		Tienda tienda_C = new Tienda(new Coordenadas(-2.16667 , -79.8333));
		
		Distribucion distribucion = new Distribucion();
		
		//Trasportar por via Ferrea de tienda_A a tienda_B (primer trayecto)
		MetodoTransporte metodo = new Ferrea();
		distribucion.setTransporte(metodo);
		distribucion.transportar(tienda_A, tienda_B);
		
		//Trasportar por via Ferrea de tienda_B a tienda_C (segundo trayecto)
		metodo = new Automotriz();
		distribucion.setTransporte(metodo);
		distribucion.transportar(tienda_B, tienda_C);
		
		
		//Secuencia Patron Chain of responsability
		List<Fallo> fallos = new ArrayList<>();
		fallos.add(Fallo.BATERIADANIADA);
		Producto a = new Producto (100,2, LocalDate.of(2022,9,06), fallos);
		AsistenteDepartamento ad = new AsistenteDepartamento();
		MiembroDepartamentoTecnico mdt = new MiembroDepartamentoTecnico();
		JefeInventario ji = new JefeInventario();
		GerenteTienda gt = new GerenteTienda();
		ad.setNext(mdt);
		mdt.setNext(ji);
		ji.setNext(gt);
		ad.aprobarCambio(a);
		
		
	}
}