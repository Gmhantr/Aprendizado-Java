import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        String nome;
        int idade;
        float salario;
        char sexo;
        boolean ativo;

        Scanner captura = new Scanner(System.in);

        System.out.println("Entre com o nome: ");
        nome = captura.next();

        System.out.println("entre com o sua idade: ");
        idade = captura.nextInt();

        System.out.println("entre com seu salario: ");
        salario = captura.nextFloat();

        System.out.println("voce trabalha?: ");
        ativo = captura.nextBoolean();



        System.out.println("Ola " + nome + ", voce tem " + idade + " anos");
        System.out.println("Tem um salario de " + salario + " trabalha? " + ativo);
        captura.close();
    }
}