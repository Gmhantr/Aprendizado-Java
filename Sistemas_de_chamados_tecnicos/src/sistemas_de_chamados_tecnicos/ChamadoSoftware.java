/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_de_chamados_tecnicos;

/**
 *
 * @author gmhan
 */
public class ChamadoSoftware extends ChamadoTecnico {

    private double valorLicenca;

    public ChamadoSoftware(int numero, String cliente, double horasTrabalhadas,
                           double valorHora, double valorLicenca) {

        super(numero, cliente, horasTrabalhadas, valorHora);
        this.valorLicenca = valorLicenca;
    }

    public double getValorLicenca() {
        return valorLicenca;
    }

    @Override
    public double calcularValorTotal() {
        double total = horasTrabalhadas * valorHora;
        total += valorLicenca;

        return total;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Tipo: chamado de software");
        System.out.printf("Valor da licença: R$ %.2f%n", valorLicenca);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }
}
