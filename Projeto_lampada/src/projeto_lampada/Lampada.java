
package projeto_lampada;

public class Lampada {

    //atributos
    public boolean acesso;
    
    //metodos
    public void acender(){
        this.acesso= true;
        System.out.println("Lampada Acessa");
    }
    
    public void apagar(){
        this.acesso = false;
        System.out.println("Lampada Acessa");
    }  
    
    public void imprimirLampada(){
        System.out.println("Ligado..............: " + this.acesso);
    }
}
