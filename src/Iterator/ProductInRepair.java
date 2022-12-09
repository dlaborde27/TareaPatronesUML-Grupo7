package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductInRepair implements ProductIterator{
    String nomProducto;
    String falla;
    private int currentPosition = 0;
    List<Product> productsCollection = new ArrayList<>();

    public ProductInRepair(String nomProducto, String falla) {
        this.nomProducto = nomProducto;
        this.falla = falla;
    }

    public void someMethod(){
    	//METODO A IMPLEMENTAR
    }
    public void setSomething(){
        System.out.println("Producto en reparacion");
    }

	@Override
	public boolean hasNext() {
        someMethod();
        return currentPosition < productsCollection.size();
	}

	@Override
	public Product getNext() {
        if (!hasNext()) {
            return null;
        }
        Product productAvailable = productsCollection.get(currentPosition);
        if (productAvailable == null) {
            setSomething();
            productsCollection.set(currentPosition,null);
        }
        currentPosition++;
        return productAvailable;
	}

	@Override
	public Product next(){
		// TODO Auto-generated method stub
		return null;
	}
}