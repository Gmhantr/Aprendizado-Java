/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroparticipacao;

/**
 *
 * @author gmhan
 */
public class Estudante extends Participante {

    public Estudante(String nome) {
        super(nome, "Estudante");
    }

    @Override
    public double calcularTaxa() {
        return 20.00;
    }
}