/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instituicao;

public class main {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno();
        Funcionario Fun1 = new Funcionario();
        Professor Prof1 = new Professor();
        
        
        alu1.Nome = "Gustavo";
        alu1.idade = 19;
        alu1.cpf = "493.108.190.30";
        alu1.curso = "Administracao";
        alu1.matricula = 00000001;
        
        Fun1.Nome = "jailson";
        Fun1.idade = 32;
        Fun1.cpf = "810.130.108.93";
        Fun1.cargo = "Secretario";
        Fun1.setor = "Administracao";
        
        
        Prof1.Nome = "vitor";
        Prof1.idade = 40;
        Prof1.cpf = "090.100.911.87";
        Prof1.disciplina = "Sistemas da informacao";
        Prof1.salario = 10000.00;
        
        alu1.exibirAluno();
        Fun1.exibirFuncionario();
        Prof1.exibirProfessor();
        
        
        
        
        
 
        
        
       
      
        
    }
    
}
