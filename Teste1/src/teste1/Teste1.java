package teste1;

import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {

        String nome;
        int idade;
        float salario;
        char sexo;
        boolean ativo;
        int mes;
        String namemonth;

        Scanner captura = new Scanner(System.in);

        System.out.println("Entre com o nome: ");
        nome = captura.next();

        System.out.println("entre com o sua idade: ");
        idade = captura.nextInt();

        System.out.println("Que mes estamos numero: ");
        mes = captura.nextInt();

        System.out.println("entre com seu salario: ");
        salario = captura.nextFloat();

        System.out.println("voce trabalha?: ");
        ativo = captura.nextBoolean();

        System.out.println("Qual seu sexo? M/F: ");
        sexo = captura.next().charAt(0);

        System.out.println("Ola " + nome + ", voce tem " + idade + " anos " + sexo);
        System.out.println("Voce tem um salario de " + salario + " trabalha? " + ativo);
        captura.close();

        if (salario <= 5000) {
            System.out.println("Voce esta isento de impostos");
        } else if (salario <= 7000) {
            System.out.println("voce tem que pagar 10% de imposto ");
        } else if (salario <= 9000) {
            System.out.println("voce tem que pagar 15% de imposto ");
        } else if (salario <= 12000) {
            System.out.println("voce tem que pagar 20% de imposto ");
        } else {
            System.out.println("voce tem que pagar 27% de imposto ");
        }

        namemonth = switch (mes) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            case 12 -> "dezembro";
            default -> "nao informado";
        };
        System.out.println("estamos no mes: " + namemonth);
    }
}
