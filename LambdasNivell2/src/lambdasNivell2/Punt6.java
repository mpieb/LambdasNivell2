package lambdasNivell2;

import java.util.Arrays;

public class Punt6 {
    
    //Definició de array
    String[] strArray = new String[] {"Ca1", "escacs", "24rat", "C56", "1234", "Tatas"};
    
    //Mètode mostra nomès els elements que siguin 100% numerics
    public void punt6(){
         
        Arrays.stream(strArray)
                 .filter(s-> s.chars().allMatch(Character::isDigit))
                 .forEach(System.out::println);
     
    }
    
}
