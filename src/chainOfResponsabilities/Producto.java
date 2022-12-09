package chainOfResponsabilities;


import java.util.ArrayList ;
import java.time.LocalDate;
import java.util.List;

public class Producto {
    private double precio;
    private int cantidad_stock;
    private LocalDate limite_garantia;
    private List<Fallo> fallos_admitidos;
    
    public Producto(double precio, int cantidad_stock, LocalDate limite_garantia, List<Fallo> fallos_admitidos) {
    	this.cantidad_stock =cantidad_stock;
    	this.precio = precio;
    	this.limite_garantia = limite_garantia;
    	this.fallos_admitidos = fallos_admitidos;
    }
    
    public LocalDate getLimiteGarantia() {
    	return this.limite_garantia;
    }
    
    public List<Fallo> getFallo(){
    	return this.fallos_admitidos;
    }
    
    public double getPrecio() {
    	return this.precio;
    }
}