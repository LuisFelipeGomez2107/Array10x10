
package pkg10x10;

public class Main {
    public static void main(String[] args) {
        metodos mt = new metodos();
        mt.fill(); 

        mt.calc(); 

        mt.print(); 

        System.out.println("Media: "+mt.media); 

        System.out.println("Moda: "+mt.moda); 

        System.out.println("Mediana: "+mt.mediana); 
    }
    
}
