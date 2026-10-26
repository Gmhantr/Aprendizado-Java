package com.mycompany.lampada;


public class ProjetoLampada {
    public static void main(String[] args) {
        Lampada estado= new Lampada(); //instanciando um objeto
        
        System.out.println("Carro Origialmente:\n");
        estado.imprimirLampada();
        System.out.println("");
        

        estado.acender();
        
        System.out.println("Carro com as caracteristas alteradas:\n");
        estado.imprimirLampada();
        
        System.out.println("FINAL DE EXECUCAO");
    }   
    
}
