package projeto_pet;
public class Cachorro {
    public String nome;
    public int fome;

    public void comer() {
        fome -= 10;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void status() {
        if (fome > 50) {
            System.out.println(nome + " está faminto.");
        } else {
            System.out.println(nome + " está satisfeito.");
        }
    }
}
