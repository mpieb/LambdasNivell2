package lambdasNivell2;

public class CalculadoraFactory {
    
    //Mètode suma dos nomres 
    public void suma(){
        
        Calculadora suma = (x,y) -> { 
                        return x + y; 
                };
                System.out.println("Suma: " + suma.operacio(2, 2));
        
    }
    
    //Mètode resta dos nombres 
    public void resta(){
        
        Calculadora resta = (x,y) -> {
			return x - y;
		};
		System.out.println("Resta: " + resta.operacio(7.9f, 5.2f));
    
    }
    
    
    //Mètode producte de dos nombres
    public void producte(){
        
        Calculadora producte = (x,y) -> {
			return x * y;
		};
		System.out.println("Producte: " + producte.operacio(4.6f, 9));
    
    }
    
    
    //Mètode divisió de dos nombres
    public void divisio(){
        
        Calculadora divisio = (x,y) -> {
			return x / y;
		};
		System.out.println("Divisió: " + divisio.operacio(10, 2));
    
    }
    
}
