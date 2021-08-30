package lambdasNivell2;

import java.util.Arrays;

public class Punt1 {
    
    //Definició de matriu
    String[] strArray = new String[] {"Co1", "24rt", "C56", "1234", "Titus"};
    
    //Mètode mostra la logitud de les cadenes de més curta a més llarga
    public void punt1(){
        
        Arrays.stream(strArray)
			.sorted((s1,s2) -> s1.length() - s2.length())
			.forEach(System.out::println);
    
    }
    
}
