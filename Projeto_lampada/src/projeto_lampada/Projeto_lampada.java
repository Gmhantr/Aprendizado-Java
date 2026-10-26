
package projeto_lampada;

public class Projeto_lampada {

    public static void main(String[] args) {
        Lampada estado= new Lampada(); //instanciando um objeto
        
        System.out.println("Estados da Lampada:\n");
        System.out.println("");
        estado.acender();
        estado.imprimirLampada();
        
       System.out.println("");
        estado.apagar(); 
        estado.imprimirLampada();
        
        System.out.println("FINAL DE EXECUCAO");
    }   
    
}

