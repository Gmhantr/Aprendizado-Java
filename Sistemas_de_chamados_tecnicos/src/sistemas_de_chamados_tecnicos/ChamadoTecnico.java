/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas_de_chamados_tecnicos;

/**
 *
 * @author gmhan
 */
public abstract class ChamadoTecnico {

    protected int numero;
    protected String cliente;
    protected double horasTrabalhadas;
    protected double valorHora;

    public ChamadoTecnico(int numero, String cliente, double horasTrabalhadas, double valorHora) {
        this.numero = numero;
        this.cliente = cliente;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void exibirDados() {
        System.out.println("Número do chamado: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.printf("Valor por hora: R$ %.2f%n", valorHora);
    }

    public abstract double calcularValorTotal();
}