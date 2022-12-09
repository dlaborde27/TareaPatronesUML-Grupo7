package Iterator;

import java.util.ArrayList;
import java.util.List;

public  class  ProductAvailable  implements  ProductIterator {
    String  nomProducto ;
    int  cantDisponible ;
    private  int  actualPosición = 0 ;
    List < Product> ColecciónProductos = new  ArrayList <>();

    public  ProductAvailable ( String  nomProducto , int  cantDisponible ) {
        this.nomProducto = nomProducto ;
        this.cantDisponible = cantDisponible ;
    }

    public void algúnmétodo () {
    	//METODO A IMPLEMENTAR
    }
    public  void  establecerAlgo (){
       System.out.println( "Producto Disponible" );
    }

	
	 public boolean hasNext() {
		 algúnmétodo ();
        return  actualPosición < ColecciónProductos.size();
	}

	
	 public Product getNext() {
        if (! hasNext ()) {
            return  null ;
        }
        Product  productAvailable = obtener ( actualPosición );
        if ( productAvailable == null ) {
            establecerAlgo ();
            
        }
        actualPosición ++;
        return  productAvailable ;
	}


	public Product next(){
		// TODO Auto-generated method stub
		return null;
	}
	private Product obtener(int actualPosición2) {
		// TODO Auto-generated method stub
		return null;
	}
}