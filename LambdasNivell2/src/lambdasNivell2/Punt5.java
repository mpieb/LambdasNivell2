package lambdasNivell2;

import java.util.Arrays;

public class Punt5 {
    
    //Definició de array
    String[] strArray = new String[] {"Ca1", "escacs", "24rat", "C56", "1234", "Tatas"};
    
    //Mètode modifica tots els elements de la matriu canviar de 'a' a '4'
    public void punt5(){
        
        Arrays.stream(strArray).forEach(s-> {
			System.out.println(s.replaceAll("a", "4"));
		});
    
    }
    
}
