/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciador_de_layouts;

/**
 *
 * @author gmhan
 */
import java.util.ArrayList;

public class GerenciadorContatos {

    private ArrayList<Contato> contatos;

    public GerenciadorContatos() {
        contatos = new ArrayList<>();
    }

    public void cadastrar(Contato contato) {
        contatos.add(contato);
    }

    public boolean remover(Contato contato) {
        return contatos.remove(contato);
    }

    public ArrayList<Contato> listarTodos() {
        return new ArrayList<>(contatos);
    }
}