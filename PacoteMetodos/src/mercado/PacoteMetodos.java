package mercado;

public class PacoteMetodos {
    public static void main(String[] args) {

        System.out.println("----------------------");
        
        Produtos p1 = new Produtos("arroz", 25.50);
        Produtos p2 = new Produtos("feijao", 16.40);

        p1.exibirDetalhes();
        System.out.println("----------------------");
        p2.exibirDetalhes();


        System.out.println("----------------------");
    }
}


