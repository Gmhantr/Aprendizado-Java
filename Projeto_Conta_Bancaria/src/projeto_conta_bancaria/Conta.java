
package projeto_conta_bancaria;
public class Conta {
    //atributos
    public float saldo;
    public String titular;
    
    //metodos
    public void exibirSaldo(){
        this.saldo = 10000;
        this.titular = "Ronaldo da Cruz Gomes";
        System.out.println("Titular e valor disponivel");
    }
    

    public void imprimirStatus(){
        System.out.println("\nTitular..............:" + this.titular +
                           "\nSaldo em conta...............:" + this.saldo);
    }
}
