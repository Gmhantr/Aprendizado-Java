
package car;

public class Veiculo {
    int ano;
    String modelo;
    String marca;
        
    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }



}

// Classe filha herdando de Veiculo
//public class Carro extends Veiculo {

    // Atributo próprio da classe Carro
   // String modelo;

    // Sobrescrevendo (override) o método da classe pai

//    public void exibirCarro() {
        // Agora o comportamento é diferente do pai
 //       System.out.println("Modelo do carro: " + modelo);


