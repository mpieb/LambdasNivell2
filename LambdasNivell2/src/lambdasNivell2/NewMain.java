package lambdasNivell2;

public class NewMain {

    public static void main(String[] args) {
        
        //Instanciació de les diferents clases i crida als seus mètodes
        Punt1 app = new Punt1();
        app.punt1();
        System.out.println();
        
        Punt2 app2 = new Punt2();
        app2.punt2();
        System.out.println();
        
        Punt3 app3 = new Punt3();
        app3.punt3();
        System.out.println();
        
        Punt4 app4 = new Punt4();
        app4.punt4();
        System.out.println();
        
        Punt5 app5 = new Punt5();
        app5.punt5();
        System.out.println();
        
        Punt6 app6 = new Punt6();
        app6.punt6();
        System.out.println();
        
        CalculadoraFactory op = new CalculadoraFactory();
        op.suma();
        op.resta();
        op.producte();
        op.divisio();
        
    }
    
}
