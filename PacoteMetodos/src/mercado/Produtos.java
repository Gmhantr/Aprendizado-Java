package mercado;

public class Produtos {
    String nome;
    double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
    }
}

