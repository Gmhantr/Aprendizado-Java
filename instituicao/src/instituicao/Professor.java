/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituicao;

/**
 *
 * @author gmhan
 */
public class Professor extends Pessoa{
    
    String disciplina;
    Double salario;
    
    public void exibirProfessor(){
    System.out.println("========Professor========");
    exibirDados();
    System.out.println("Disciplina: " + disciplina);
    System.out.println("salario: " + salario);
    }
}
