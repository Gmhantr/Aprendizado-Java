/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

/**
 *
 * @author gmhan
 */
public class main {

    public static void main(String[] args) {
       Carro carro1 = new Carro();
       Moto moto1 = new Moto();
       caminhao caminhao1 = new caminhao();
       
       carro1.modelo = "Gol";
       carro1.marca = "Volkswagen";
       carro1.ano = 2015;
       carro1.quantidadePortas = 4;
       
       carro1.exibirCarro();
       
       moto1.modelo = "CG 125";
       moto1.marca = "Honda";
       moto1.ano = 2020;
       moto1.cilindradas = 125;
       
       moto1.exibirMoto();
       
       caminhao1.modelo = "Atego";
       caminhao1.marca = "Mercedez";
       caminhao1.ano = 2023;
       caminhao1.capacidadeCarga = 32;
       
       caminhao1.exibirCaminhao();
       
       
       
    }
    
}
