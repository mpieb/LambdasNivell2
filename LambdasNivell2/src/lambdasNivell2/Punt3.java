package lambdasNivell2;

import java.util.Arrays;

public class Punt3 {
    
    //Definició de array
    String[] strArray = new String[] {"Co1", "24rt", "C56", "1234", "Titus"};
    
    
    //Mètode que retorna alfabèticament per el primer caràcter
    public void punt3(){
        
        Arrays.stream(strArray)
			.sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
			.forEach(System.out::println);
    
    }
    
}
