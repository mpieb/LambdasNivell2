package lambdasNivell2;

import java.util.Arrays;

public class Punt2 {
    
    //Definició de array
    String[] strArray = new String[] {"Co1", "24rt", "C56", "1234", "Titus"};
    
    //Mètode mostra la longitud inversa de més llarga a més curta
    public void punt2(){
        
        Arrays.stream(strArray)
			.sorted((s1,s2) -> s2.length() - s1.length())
			.forEach(System.out::println);;
    
    }
    
}
