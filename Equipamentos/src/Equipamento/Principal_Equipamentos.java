/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipamento;

/**
 *
 * @author gmhan
 */
public class Principal_Equipamentos {

    public static void main(String[] args) {

        // Criando  equipamentos

        Equipamento equipamento1 = new Equipamento();




        Equipamento equipamento2 = new Equipamento(
                102,
                "Notebook",
                "Informatica"
        );


   

        Equipamento equipamento3 = new Equipamento(
                103,
                "Monitor",
                "Perifericos",
                850.00,
                5
        );


     

        equipamento2.setValorAquisicao(2500.00);
        equipamento2.setQuantidade(10);


        // Adicionando equipamentos 

        equipamento2.adicionarEstoque(5);

        equipamento3.adicionarEstoque(
                3,
                "Reposicao de equipamentos"
        );


        // Exibindo os equipamentos

        System.out.println("===== EQUIPAMENTO 1 =====");
        equipamento1.exibirDados();

        System.out.println("===== EQUIPAMENTO 2 =====");
        equipamento2.exibirDados();

        System.out.println("===== EQUIPAMENTO 3 =====");
        equipamento3.exibirDados();


       

        equipamento1.setQuantidade(-10);
    }
}
