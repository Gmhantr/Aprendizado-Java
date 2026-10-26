package repeticao;

import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {
        int CandA = 0, CandB = 0, Branco = 0;
        int votacao;

        Scanner captura = new Scanner(System.in);
        
        do {
            System.out.println("digite entre candidado A = 1, B = 2 ou em branco = 3, 0 para sair");
            votacao = captura.nextInt();
        if (votacao == 1) {
            CandA++;
        } else if (votacao == 2) {
            CandB++;
        } else if (votacao == 3) {
            Branco++;
        } else if (votacao == 0) {
            System.out.println("Finalizando votacao");
        } else {
            System.out.println("Digite um Numero valido, entre 1, 2, 3 ou 0");
        }

        } while (votacao > 0);
        System.out.println("Candidato A recebeu " + CandA + " VOTOS");
        System.out.println("Candidato B recebeu " + CandB + " VOTOS");
        System.out.println("Votos em branco: " + Branco);
        
    }

}
