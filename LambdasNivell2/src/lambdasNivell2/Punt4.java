package lambdasNivell2;

import java.util.Arrays;

public class Punt4 {
    
    //Definició de array
    String[] strArray = new String[] {"Ce1", "escacs", "24ret", "C56", "1234", "Tetus"};
    
    //Mètode les cadenes que contenen 'e' en primer lloc, la resta en segon lloc 
    public void punt4(){
        
       Arrays.stream(strArray).sorted((s1,s2) ->{
			if(s1.toLowerCase().startsWith("e") && !s2.toLowerCase().startsWith("e")) {
				return -1; 
			}else if(!s1.startsWith("e") && s2.startsWith("e")) {
				return 1;
			}else {
				return s1.compareTo(s2);
			}
		}).forEach(System.out::println);
    
    }
    
}
