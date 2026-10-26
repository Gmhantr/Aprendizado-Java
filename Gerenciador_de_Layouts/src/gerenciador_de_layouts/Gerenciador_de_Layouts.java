/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciador_de_layouts;
import javax.swing.SwingUtilities;
/**
 *
 * @author gmhan
 */
public class Gerenciador_de_Layouts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            TelaCadastroContatos tela =
                    new TelaCadastroContatos();

            tela.setVisible(true);
        });
    }
}