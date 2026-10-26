/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroparticipacao;

/**
 *
 * @author gmhan
 */
public class Profissional extends Participante {

    public Profissional(String nome) {
        super(nome, "Profissional");
    }

    @Override
    public double calcularTaxa() {
        return 50.00;
    }
}