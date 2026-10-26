/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_loja_tecnologia;

public class Notebook extends Produto {
   private int memoriaRam;
   private int armazenamento;
   private boolean temPlacaVideoDedicada;


   public Notebook(String codigo, String nome, String marca, double precoBase,
                   int memoriaRam, int armazenamento) {
       super(codigo, nome, marca, precoBase);
       setMemoriaRam(memoriaRam);
       setArmazenamento(armazenamento);
       this.temPlacaVideoDedicada = false;
   }


   public Notebook(String codigo, String nome, String marca, double precoBase,
                   int memoriaRam, int armazenamento, boolean temPlacaVideoDedicada) {
       super(codigo, nome, marca, precoBase);
       setMemoriaRam(memoriaRam);
       setArmazenamento(armazenamento);
       this.temPlacaVideoDedicada = temPlacaVideoDedicada;
   }


   public int getMemoriaRam() {
       return memoriaRam;
   }

   
   public void setMemoriaRam(int memoriaRam) {
       if (memoriaRam > 0) {
           this.memoriaRam = memoriaRam;
       } else {
           System.out.println("Memória RAM inválida.");
       }
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


   public boolean isTemPlacaVideoDedicada() {
       return temPlacaVideoDedicada;
   }


   public void setTemPlacaVideoDedicada(boolean temPlacaVideoDedicada) {
       this.temPlacaVideoDedicada = temPlacaVideoDedicada;
   }


   public double calcularPrecoFinal() {
       return getPrecoBase();
   }


   public double calcularPrecoFinal(double desconto) {
       return getPrecoBase() - desconto;
   }


   public double calcularPrecoFinal(double desconto, double frete) {
       return getPrecoBase() - desconto + frete;
   }


   public double calcularPrecoFinal(double desconto, double frete, int garantiaEstendida) {
       return getPrecoBase() - desconto + frete + (garantiaEstendida * 250);
   }


   @Override
   public void exibirDados() {
       super.exibirDados();
       System.out.println("Memória RAM: " + memoriaRam + " GB");
       System.out.println("Armazenamento: " + armazenamento + " GB");


       if (temPlacaVideoDedicada) {
           System.out.println("Placa de vídeo dedicada: Sim");
       } else {
           System.out.println("Placa de vídeo dedicada: Não");
       }
   }


   public void exibirResumoVenda(double desconto, double precoFinal) {
       System.out.println("Resumo da venda");
       System.out.println("Produto: " + getNome());
       System.out.println("Marca: " + getMarca());
       System.out.println("Preço base: R$ " + getPrecoBase());
       System.out.println("Desconto aplicado: R$ " + desconto);
       System.out.println("Preço final: R$ " + precoFinal);
       System.out.println("Memória RAM: " + memoriaRam + " GB");
       System.out.println("Armazenamento: " + armazenamento + " GB");


       if (temPlacaVideoDedicada) {
           System.out.println("Placa de vídeo dedicada: Sim");
       } else {
           System.out.println("Placa de vídeo dedicada: Não");
       }
   }
}

