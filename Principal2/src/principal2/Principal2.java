/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal2;

public class Principal2 {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        
        conta1.setTitular("rodolfo");
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.sacar(400);
        
        
      System.out.println("Nome do Titular: " + conta1.getTitular());
      System.out.println("Saldo em conta: " + conta1.getSaldo());
        

    }
    
}
