/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_entregas;

/**
 *
 * @author gmhan
 */
public class EntregaExpressa implements Calculavel {
    private double distanciaKm; 
    private double valorPorKm; 
    private double taxaUrgencia;
    
    public EntregaExpressa (double distanciaKm, double valorPorKm, double taxaUrgencia ){
        this.distanciaKm = distanciaKm;
        this.valorPorKm = valorPorKm;
        this.taxaUrgencia = taxaUrgencia;
   }
    
    
    @Override
    public double calcularvalor () {
        return (distanciaKm * valorPorKm) + taxaUrgencia;
        
    }
    
    public void exibirDados() {
        System.out.printf("Valor total: R$ %.2f%n", calcularvalor());
    }
}
