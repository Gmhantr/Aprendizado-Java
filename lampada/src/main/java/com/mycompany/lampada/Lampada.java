package com.mycompany.lampada;

public class Lampada {

    //atributos
    public boolean acesso = true;
    
    //metodos
    public void acender(){
        this.acesso=true;
        System.out.println("Lampada Acessa");
    }
    
    public void apagar(){
        this.acesso = false;
        System.out.println("Lampada Apagada");
    }  
    
    public void imprimirLampada(){
        System.out.println("\nLigado..............: " + this.acesso);
    }
}
