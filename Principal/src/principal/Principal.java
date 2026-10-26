/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author gmhan
 */
public class Principal {


    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Carlos");
        aluno1.setIdade(20);
        aluno2.setNome("Joao");
        aluno2.setIdade(19);

 
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
    }
}


