/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Equipamento;

/**
 *
 * @author gmhan
 */
public class Equipamento {


    private int codigo;
    private String descricao;
    private String categoria;
    private double valorAquisicao;
    private int quantidade;


    // Construtores

    public Equipamento() {
        this.codigo = 0;
        this.descricao = "Nao informada";
        this.categoria = "Nao informada";
        this.valorAquisicao = 0;
        this.quantidade = 0;
    }

    public Equipamento(int codigo, String descricao, String categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valorAquisicao = 0;
        this.quantidade = 0;
    }

    public Equipamento(int codigo, String descricao, String categoria,
            double valorAquisicao, int quantidade) {

        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;

        if (valorAquisicao >= 0) {
            this.valorAquisicao = valorAquisicao;
        } else {
            System.out.println("Valor de aquisicao nao pode ser negativo.");
            this.valorAquisicao = 0;
        }

        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade nao pode ser negativa.");
            this.quantidade = 0;
        }
    }


 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
        } else {
            System.out.println("A descricao nao pode ser vazia.");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorAquisicao() {
        return valorAquisicao;
    }

    public void setValorAquisicao(double valorAquisicao) {
        if (valorAquisicao >= 0) {
            this.valorAquisicao = valorAquisicao;
        } else {
            System.out.println("O valor de aquisicao nao pode ser negativo.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("A quantidade nao pode ser negativa.");
        }
    }


 

    public void adicionarEstoque(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("A quantidade nao pode ser negativa.");
        }
    }

    public void adicionarEstoque(int quantidade, String justificativa) {
        if (quantidade >= 0) {
            this.quantidade += quantidade;
            System.out.println("Justificativa: " + justificativa);
        } else {
            System.out.println("A quantidade nao pode ser negativa.");
        }
    }


    // Calculando valor do estoque

    public double calcularValorEstoque() {
        double valorTotal = valorAquisicao * quantidade;
        return valorTotal;
    }


    // Mostrando os dados

    public void exibirDados() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor de aquisicao: R$ " + valorAquisicao);
        System.out.println("Quantidade disponivel: " + quantidade);
        System.out.println("Valor total do estoque: R$ " + calcularValorEstoque());
        System.out.println("----------------------------------------");
    }
}
