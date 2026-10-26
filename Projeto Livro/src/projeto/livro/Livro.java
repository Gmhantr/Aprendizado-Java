package projeto.livro;
public class Livro {
    //atributos
    public String autor;
    public String titulo;
    
    //metodos
    public void livros(){
       System.out.println("\nInformações do livro selecionado:");
        
    }
    

    public void imprimirInfo(){
        System.out.println("\nTitular..............:" + this.titulo+
                           "\nSaldo em conta...............:" + this.autor);
    }
}

