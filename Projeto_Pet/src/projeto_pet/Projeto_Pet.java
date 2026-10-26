package projeto_pet;
// @author gmhan

public class Projeto_Pet {
    public static void main(String[] args) {
        Cachorro Cachorro = new Cachorro();

        Cachorro.nome = "BOLT";
        Cachorro.fome = 51;
        System.out.print("O Cachorro esta?\n");
        Cachorro.status();
        Cachorro.comer();
        Cachorro.status();
        
    }
}
    
    

