
package projeto_conta_bancaria;

public class Projeto_Conta_Bancaria {
    public static void main(String[] args) {
        Conta banco= new Conta(); //instanciando um objeto
        
        System.out.println("Informaçoes sobre a conta:\n");
        System.out.println("");
        banco.exibirSaldo();
        banco.imprimirStatus();
        

        
        System.out.println("FINAL DE EXECUCAO");
    }   
}
