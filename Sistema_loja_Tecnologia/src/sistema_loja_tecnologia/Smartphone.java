/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_loja_tecnologia;
public class Smartphone extends Produto {
   private int armazenamento;
   private int quantidadeCameras;
   private boolean suporta5G;


   public Smartphone(String codigo, String nome, String marca, double precoBase,
                     int armazenamento, int quantidadeCameras) {
       super(codigo, nome, marca, precoBase);
       setArmazenamento(armazenamento);
       setQuantidadeCameras(quantidadeCameras);
       this.suporta5G = false;
   }


   public Smartphone(String codigo, String nome, String marca, double precoBase,
                     int armazenamento, int quantidadeCameras, boolean suporta5G) {
       super(codigo, nome, marca, precoBase);
       setArmazenamento(armazenamento);
       setQuantidadeCameras(quantidadeCameras);
       this.suporta5G = suporta5G;
   }


   public int getArmazenamento() {
       return armazenamento;
   }


   public void setArmazenamento(int armazenamento) {
       if (armazenamento > 0) {
           this.armazenamento = armazenamento;
       } else {
           System.out.println("Armazenamento inválido.");
       }
   }


   public int getQuantidadeCameras() {
       return quantidadeCameras;
   }


   public void setQuantidadeCameras(int quantidadeCameras) {
       if (quantidadeCameras > 0) {
           this.quantidadeCameras = quantidadeCameras;
       } else {
           System.out.println("Quantidade de câmeras inválida.");
       }
   }


   public boolean isSuporta5G() {
       return suporta5G;
   }


   public void setSuporta5G(boolean suporta5G) {
       this.suporta5G = suporta5G;
   }


   public double calcularPrecoFinal() {
       return getPrecoBase();
   }


   public double calcularPrecoFinal(double desconto) {
       return getPrecoBase() - desconto;
   }


   public double calcularPrecoFinal(double desconto, int quantidadeParcelas) {
       double preco = getPrecoBase() - desconto;


       if (quantidadeParcelas >= 4 && quantidadeParcelas <= 6) {
           preco = preco + (preco * 0.05);
       } else if (quantidadeParcelas > 6) {
           preco = preco + (preco * 0.10);
       }


       return preco;
   }


   public double calcularPrecoFinal(double desconto, int quantidadeParcelas, double frete) {
       return calcularPrecoFinal(desconto, quantidadeParcelas) + frete;
   }


   @Override
   public void exibirDados() {
       super.exibirDados();
       System.out.println("Armazenamento: " + armazenamento + " GB");
       System.out.println("Quantidade de câmeras: " + quantidadeCameras);


       if (suporta5G) {
           System.out.println("Suporta 5G: Sim");
       } else {
           System.out.println("Suporta 5G: Não");
       }
   }


   public void exibirResumoVenda(double desconto, double precoFinal) {
       System.out.println("Resumo da venda");
       System.out.println("Produto: " + getNome());
       System.out.println("Marca: " + getMarca());
       System.out.println("Preço base: R$ " + getPrecoBase());
       System.out.println("Desconto aplicado: R$ " + desconto);
       System.out.println("Preço final: R$ " + precoFinal);
       System.out.println("Armazenamento: " + armazenamento + " GB");
       System.out.println("Quantidade de câmeras: " + quantidadeCameras);


       if (suporta5G) {
           System.out.println("Suporta 5G: Sim");
       } else {
           System.out.println("Suporta 5G: Não");
       }
   }
}
