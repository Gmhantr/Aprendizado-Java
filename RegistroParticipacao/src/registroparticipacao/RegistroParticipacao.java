/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroparticipacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

public class RegistroParticipacao extends JFrame implements ActionListener {

    private JLabel lblNome;
    private JLabel lblCategoria;
    private JTextField txtNome;
    private JComboBox<String> cbCategoria;
    private JButton btnRegistrar;
    private JButton btnLimpar;
    private JTextArea txtRegistros;

    public RegistroParticipacao() {
        setTitle("Registro de Participação");
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        lblNome = new JLabel("Nome do participante:");
        lblCategoria = new JLabel("Categoria:");

        txtNome = new JTextField(20);

        cbCategoria = new JComboBox<>(
            new String[]{"Estudante", "Profissional"}
        );

        btnRegistrar = new JButton("Registrar");
        btnLimpar = new JButton("Limpar");

        txtRegistros = new JTextArea();
        txtRegistros.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(txtRegistros);

        JPanel painelFormulario = new JPanel(new GridLayout(2, 2, 10, 10));
        painelFormulario.setBorder(
            BorderFactory.createEmptyBorder(15, 15, 10, 15)
        );

        painelFormulario.add(lblNome);
        painelFormulario.add(txtNome);
        painelFormulario.add(lblCategoria);
        painelFormulario.add(cbCategoria);

        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(btnRegistrar);
        painelBotoes.add(btnLimpar);

        JPanel painelSuperior = new JPanel(new BorderLayout());
        painelSuperior.add(painelFormulario, BorderLayout.CENTER);
        painelSuperior.add(painelBotoes, BorderLayout.SOUTH);

        add(painelSuperior, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnRegistrar.addActionListener(this);
        btnLimpar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnRegistrar) {

            String nome = txtNome.getText().trim();

            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(
                    this,
                    "O nome do participante é obrigatório.",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE
                );

                txtNome.requestFocus();
                return;
            }

            String categoria = (String) cbCategoria.getSelectedItem();

            Participante participante;

            if (categoria.equals("Estudante")) {
                participante = new Estudante(nome);
            } else {
                participante = new Profissional(nome);
            }

            double taxa = participante.calcularTaxa();

            NumberFormat formato = NumberFormat.getCurrencyInstance(
                new Locale("pt", "BR")
            );

            txtRegistros.append(
                "Nome: " + participante.getNome()
                + " | Categoria: " + participante.getCategoria()
                + " | Taxa: " + formato.format(taxa)
                + "\n"
            );

            txtNome.setText("");
            txtNome.requestFocus();

        } else if (e.getSource() == btnLimpar) {

            txtNome.setText("");
            txtRegistros.setText("");
            txtNome.requestFocus();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroParticipacao janela = new RegistroParticipacao();
            janela.setVisible(true);
        });
    }
}