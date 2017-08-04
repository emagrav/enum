package it.emagra.enumsample;

public class ProvaElemento {

	public static void main(String[] args) {
		
		for( Elemento e : Elemento.values() ) {
            
            System.out.printf("%s\t|\t%d|\t%f\t|\t%s\n", e.getSimbolo(), e.getNumeroAtomico(), e.getMassaAtomica(), e);
        }

	}

}
