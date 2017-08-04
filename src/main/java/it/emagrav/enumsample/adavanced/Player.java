package it.emagrav.enumsample.adavanced;

public class Player {

	public static void main(String[] args) {
     
        for( Audio a : Audio.values() ) {
//                                                       v--<--<- {mettendo in questo punto solo 'a', implicitamente sto richiamando il metodo toString() di un elemento di un enum}
//														 v		  {Per questo motivo il terzo elemento stampa Dolby anziché DD come gli altri, in quanto solo per lui ho ridefinito il metodo toString()}
            System.out.printf("%s\t| %d\t| %s\t | %s\n", a, a.getBitrate(), a.getChannel(), a.reproduce("myFile"));
        }
    }
}