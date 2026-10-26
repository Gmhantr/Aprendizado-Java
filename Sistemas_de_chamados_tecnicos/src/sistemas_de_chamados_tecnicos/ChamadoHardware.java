/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_de_chamados_tecnicos;

/**
 *
 * @author gmhan
 */
public class ChamadoHardware extends ChamadoTecnico {

    private double valorPecas;

    public ChamadoHardware(int numero, String cliente, double horasTrabalhadas,
                           double valorHora, double valorPecas) {

        super(numero, cliente, horasTrabalhadas, valorHora);
        this.valorPecas = valorPecas;
    }

    public double getValorPecas() {
        return valorPecas;
    }

    @Override
    public double calcularValorTotal() {
        double total = horasTrabalhadas * valorHora;

        if (valorPecas > 500) {
            double taxa = valorPecas * 0.10;
            total += valorPecas + taxa;
        } else {
            total += valorPecas;
        }

        return total;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Tipo: chamado de hardware");
        System.out.printf("Valor das peças: R$ %.2f%n", valorPecas);

        if (valorPecas > 500) {
            double taxa = valorPecas * 0.10;
            System.out.printf("Taxa de serviço: R$ %.2f%n", taxa);
        }

        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }
}
