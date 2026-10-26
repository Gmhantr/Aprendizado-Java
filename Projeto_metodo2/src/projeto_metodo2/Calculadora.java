
package projeto_metodo2;

/**
 *
 * @author gmhan
 */
public class Calculadora {

    public void duplicarValor(int x) {
        x = x * 2;
        System.out.println("Dentro do método duplicarValor: " + x);
    }
    

    public void depositarDez(ContaBancaria conta) {
        conta.saldo = conta.saldo + 10;
    }
}
