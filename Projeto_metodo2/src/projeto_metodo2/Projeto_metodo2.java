package projeto_metodo2;

public class Projeto_metodo2 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int numero = 5;
        calc.duplicarValor(numero);
        System.out.println("Fora do método duplicarValor: " + numero);

        System.out.println("----------------------");

        ContaBancaria conta1 = new ContaBancaria();
        conta1.saldo = 100;

        calc.depositarDez(conta1);

        System.out.println("Saldo após depósito: " + conta1.saldo);
    }
}
