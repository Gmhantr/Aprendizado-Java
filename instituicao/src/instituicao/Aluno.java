/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituicao;

public class Aluno extends Pessoa {
    int matricula;
    String curso;
    
    public void exibirAluno(){
    System.out.println("========ALUNO========");
    exibirDados();
    System.out.println("Matricula: " + matricula);
    System.out.println("Curso: " + curso);
    }
    
}
