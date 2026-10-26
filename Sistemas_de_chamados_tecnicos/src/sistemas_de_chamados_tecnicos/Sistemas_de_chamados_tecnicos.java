/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemas_de_chamados_tecnicos;

/**
 *
 * @author gmhan
 */
public class Sistemas_de_chamados_tecnicos {

    public static void main(String[] args) {

        ChamadoSoftware chamado1 = new ChamadoSoftware(
                101, "Empresa Alfa", 3.0, 100.0, 150.0
        );

        ChamadoHardware chamado2 = new ChamadoHardware(
                102, "Empresa Beta", 4.0, 120.0, 400.0
        );

        ChamadoSoftware chamado3 = new ChamadoSoftware(
                103, "Empresa Gama", 2.0, 90.0, 80.0
        );

        ChamadoHardware chamado4 = new ChamadoHardware(
                104, "Empresa Delta", 5.0, 110.0, 800.0
        );

        ChamadoTecnico[] chamados = {
                chamado1,
                chamado2,
                chamado3,
                chamado4
        };

        double faturamento = 0;

        for (int i = 0; i < chamados.length; i++) {

            chamados[i].exibirDados();

            faturamento += chamados[i].calcularValorTotal();

            System.out.println("--------------------------------");
        }

        System.out.printf("Faturamento total: R$ %.2f%n", faturamento);
    }
}
