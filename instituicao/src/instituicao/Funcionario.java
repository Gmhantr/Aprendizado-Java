/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituicao;

/**
 *
 * @author gmhan+
 */
public class Funcionario extends Pessoa {
    String cargo;
    String setor;
    
    public void exibirFuncionario(){
    System.out.println("========Funcionario========");
    exibirDados();
    System.out.println("Setor: " + setor);
    System.out.println("Cargo: " + cargo);
    }
    
}
