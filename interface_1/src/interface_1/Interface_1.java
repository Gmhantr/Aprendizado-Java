package interface_1;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Interface_1 {

    public static void main(String[] args) {

        JFrame tela = new JFrame();
        
        String nome = JOptionPane.showInputDialog(
            tela,
            "Digite seu nome:"
        );

        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
        JPanel painel5 = new JPanel();
        JPanel painel6 = new JPanel();



        JLabel texto = new JLabel(nome);

        tela.setLayout(new GridLayout(2, 3));

        painel1.add(texto);

        tela.add(painel1);
        tela.add(painel2);
        tela.add(painel3);
        tela.add(painel4);
        tela.add(painel5);
        tela.add(painel6);

        tela.setSize(300, 200);

        painel1.setBackground(Color.GRAY);
        painel2.setBackground(Color.darkGray);
        painel3.setBackground(Color.black);
        painel4.setBackground(Color.blue);
        painel5.setBackground(Color.red);
        painel6.setBackground(Color.green);

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}