package projeto.livro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Livro livro1= new Livro(); //instanciando um objeto
        Livro livro2= new Livro();
        
      
        livro1.livros();
        
        
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";

        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        
        
        livro1.imprimirInfo();
        
        livro2.livros();
        
        livro2.imprimirInfo();
        

        
        System.out.println("FINAL DE EXECUCAO");
    }   
}
