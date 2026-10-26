
package principal2;
public class ContaBancaria {
    private String titular;
    private double saldo;
    
    
  public double getSaldo(){
      return saldo;
  }
  
  public String getTitular() {
      return titular;
  }
  
  public void setTitular (String titular){
      this.titular = titular;
  }
  
   public void depositar(double valor) {
       if(valor > 0){
           System.out.println("Deposito feito com sucesso, saldo + " + valor);
           saldo += valor;
           
       } else {
           System.out.println("Digite um valor valido");
       }        
   }
      public void sacar(double valor) {
          if(valor > 0 && valor <= saldo){
              saldo -= valor;
           System.out.println("Saque feito com sucesso saldo - " + valor);
          }else {
              System.out.println("Saldo insuficiente ou Valor invalido");
          }
      }
      
}
