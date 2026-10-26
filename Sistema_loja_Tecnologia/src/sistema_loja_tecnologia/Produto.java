/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_loja_tecnologia;

public class Produto {
   private String codigo;
   private String nome;
   private String marca;
   private double precoBase;


   public Produto(String codigo, String nome, String marca, double precoBase) {
       setCodigo(codigo);
       setNome(nome);
       setMarca(marca);
       setPrecoBase(precoBase);
   }


   public String getCodigo() {
       return codigo;
   }


   public void setCodigo(String codigo) {
       if (codigo != null && !codigo.trim().isEmpty()) {
           this.codigo = codigo;
       } else {
           System.out.println("Código inválido.");
       }
   }


   public String getNome() {
       return nome;
   }


   public void setNome(String nome) {
       if (nome != null && !nome.trim().isEmpty()) {
           this.nome = nome;
       } else {
           System.out.println("Nome inválido.");
       }
   }


   public String getMarca() {
       return marca;
   }


   public void setMarca(String marca) {
       if (marca != null && !marca.trim().isEmpty()) {
           this.marca = marca;
       } else {
           System.out.println("Marca inválida.");
       }
   }


   public double getPrecoBase() {
       return precoBase;
   }


   public void setPrecoBase(double precoBase) {
       if (precoBase > 0) {
           this.precoBase = precoBase;
       } else {
           System.out.println("Preço base inválido.");
       }
   }


   public void exibirDados() {
       System.out.println("Código: " + codigo);
       System.out.println("Nome: " + nome);
       System.out.println("Marca: " + marca);
       System.out.println("Preço base: R$ " + precoBase);
   }
}

