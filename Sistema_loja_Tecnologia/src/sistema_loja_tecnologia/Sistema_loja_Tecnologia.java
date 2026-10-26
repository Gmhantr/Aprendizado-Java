package sistema_loja_tecnologia;

// ==========================
// CLASSE PRINCIPAL
// ==========================

public class Sistema_loja_Tecnologia {

   public static void main(String[] args) {
       Notebook notebook1 = new Notebook(
               "N001",
               "Notebook Gamer",
               "Dell",
               4500,
               16,
               512,
               true
       );


       Notebook notebook2 = new Notebook(
               "N002",
               "Notebook Office",
               "Lenovo",
               3000,
               8,
               256
       );


       Smartphone smartphone1 = new Smartphone(
               "S001",
               "Galaxy Pro",
               "Samsung",
               2800,
               256,
               4,
               true
       );


       Smartphone smartphone2 = new Smartphone(
               "S002",
               "iPhone Lite",
               "Apple",
               5000,
               128,
               2
       );


       System.out.println("===== NOTEBOOK 1 =====");
       notebook1.exibirDados();
       System.out.println("Preço final sem desconto: R$ " + notebook1.calcularPrecoFinal());
       System.out.println("Preço final com desconto: R$ " + notebook1.calcularPrecoFinal(200));
       System.out.println("Preço final com desconto e frete: R$ " + notebook1.calcularPrecoFinal(200, 300));
       System.out.println("Preço final com desconto, frete e garantia em anos: R$ " + notebook1.calcularPrecoFinal(200, 300, 1));


       System.out.println();


       System.out.println("===== NOTEBOOK 2 =====");
       notebook2.exibirDados();
       System.out.println("Preço final sem desconto: R$ " + notebook2.calcularPrecoFinal());
       System.out.println("Preço final com desconto: R$ " + notebook2.calcularPrecoFinal(150));
       System.out.println("Preço final com desconto, frete e garantia em anos: R$ " + notebook2.calcularPrecoFinal(150, 200, 2));


       System.out.println();


       System.out.println("===== SMARTPHONE 1 =====");
       smartphone1.exibirDados();
       System.out.println("Preço final à vista: R$ " + smartphone1.calcularPrecoFinal());
       System.out.println("Preço final com desconto: R$ " + smartphone1.calcularPrecoFinal(100));
       System.out.println("Preço final parcelado: R$ " + smartphone1.calcularPrecoFinal(100, 5));
       System.out.println("Preço final com frete: R$ " + smartphone1.calcularPrecoFinal(100, 5, 50));


       System.out.println();


       System.out.println("===== SMARTPHONE 2 =====");
       smartphone2.exibirDados();
       System.out.println("Preço final à vista: R$ " + smartphone2.calcularPrecoFinal());
       System.out.println("Preço final com desconto: R$ " + smartphone2.calcularPrecoFinal(300));
       System.out.println("Preço final parcelado: R$ " + smartphone2.calcularPrecoFinal(300, 8));
       System.out.println("Preço final com frete: R$ " + smartphone2.calcularPrecoFinal(300, 8, 80));


       System.out.println();


       System.out.println("===== RESUMO DE VENDA NOTEBOOK =====");
       notebook1.exibirResumoVenda(200, notebook1.calcularPrecoFinal(200, 300, 1));

       
       System.out.println();


       System.out.println("===== RESUMO DE VENDA SMARTPHONE =====");
       smartphone1.exibirResumoVenda(100, smartphone1.calcularPrecoFinal(100, 5, 50));
   }
}

