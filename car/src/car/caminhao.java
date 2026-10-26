/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author gmhan
 */
public class caminhao extends Veiculo {
    
    float capacidadeCarga; 
    
    public void exibirCaminhao() {
        
        System.out.println("===================CAMINHAO====================");
        exibirDados();
        System.out.println("Capacidade De Cargo: " + capacidadeCarga + "Toneladas");
        
    }
    
    
}
