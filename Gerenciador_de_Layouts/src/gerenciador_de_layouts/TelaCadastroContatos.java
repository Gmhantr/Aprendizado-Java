
package gerenciador_de_layouts;

/**
 *
 * @author gmhan
 */
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaCadastroContatos extends JFrame {

    private JTextField campoNome;
    private JTextField campoTelefone;
    private JTextField campoEmail;

    private JButton botaoCadastrar;
    private JButton botaoLimpar;
    private JButton botaoRemover;
    private JButton botaoSair;

    private JList<Contato> listaContatos;
    private DefaultListModel<Contato> modeloLista;

    private GerenciadorContatos gerenciador;

    public TelaCadastroContatos() {
        gerenciador = new GerenciadorContatos();

        configurarJanela();
        inicializarComponentes();
        montarInterface();
        configurarEventos();
    }

    private void configurarJanela() {
        setTitle("Cadastro de Contatos");
        setSize(650, 450);
        setMinimumSize(new Dimension(500, 350));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
    }

    private void inicializarComponentes() {
        campoNome = new JTextField();
        campoTelefone = new JTextField();
        campoEmail = new JTextField();

        botaoCadastrar = new JButton("Cadastrar");
        botaoLimpar = new JButton("Limpar");
        botaoRemover = new JButton("Remover");
        botaoSair = new JButton("Sair");

        modeloLista = new DefaultListModel<>();

        listaContatos = new JList<>(modeloLista);
        listaContatos.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );
    }

    private JPanel criarPainelTitulo() {
        JPanel painelTitulo = new JPanel(new BorderLayout());

        JLabel labelTitulo = new JLabel(
                "Cadastro de Contatos",
                SwingConstants.CENTER
        );

        labelTitulo.setFont(
                new Font("Arial", Font.BOLD, 20)
        );

        painelTitulo.add(
                labelTitulo,
                BorderLayout.CENTER
        );

        painelTitulo.setBorder(
                BorderFactory.createEmptyBorder(
                        10, 10, 10, 10
                )
        );

        return painelTitulo;
    }

    private JPanel criarPainelFormulario() {
        JPanel painelFormulario = new JPanel(
                new GridLayout(3, 2, 8, 8)
        );

        painelFormulario.add(new JLabel("Nome:"));
        painelFormulario.add(campoNome);

        painelFormulario.add(new JLabel("Telefone:"));
        painelFormulario.add(campoTelefone);

        painelFormulario.add(new JLabel("E-mail:"));
        painelFormulario.add(campoEmail);

        painelFormulario.setBorder(
                BorderFactory.createTitledBorder(
                        "Dados do contato"
                )
        );

        return painelFormulario;
    }

    private JScrollPane criarListaComRolagem() {
        JScrollPane barraRolagem =
                new JScrollPane(listaContatos);

        barraRolagem.setBorder(
                BorderFactory.createTitledBorder(
                        "Contatos cadastrados"
                )
        );

        return barraRolagem;
    }

    private JPanel criarPainelConteudo() {
        JPanel painelConteudo = new JPanel(
                new BorderLayout(10, 10)
        );

        JPanel painelFormulario =
                criarPainelFormulario();

        JScrollPane listaComRolagem =
                criarListaComRolagem();

        painelConteudo.add(
                painelFormulario,
                BorderLayout.PAGE_START
        );

        painelConteudo.add(
                listaComRolagem,
                BorderLayout.CENTER
        );

        painelConteudo.setBorder(
                BorderFactory.createEmptyBorder(
                        0, 10, 0, 10
                )
        );

        return painelConteudo;
    }

    private JPanel criarPainelBotoes() {
        JPanel painelBotoes = new JPanel(
                new FlowLayout(
                        FlowLayout.RIGHT,
                        8,
                        8
                )
        );

        painelBotoes.add(botaoCadastrar);
        painelBotoes.add(botaoLimpar);
        painelBotoes.add(botaoRemover);
        painelBotoes.add(botaoSair);

        return painelBotoes;
    }

    private void montarInterface() {
        JPanel painelTitulo =
                criarPainelTitulo();

        JPanel painelConteudo =
                criarPainelConteudo();

        JPanel painelBotoes =
                criarPainelBotoes();

        add(
                painelTitulo,
                BorderLayout.PAGE_START
        );

        add(
                painelConteudo,
                BorderLayout.CENTER
        );

        add(
                painelBotoes,
                BorderLayout.PAGE_END
        );
    }

    private void configurarEventos() {

        botaoCadastrar.addActionListener(
                evento -> cadastrarContato()
        );

        botaoLimpar.addActionListener(
                evento -> limparCampos()
        );

        botaoRemover.addActionListener(
                evento -> removerContato()
        );

        botaoSair.addActionListener(
                evento -> sair()
        );

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent evento) {
                sair();
            }
        });
    }

    private void cadastrarContato() {

        String nome = campoNome.getText().trim();
        String telefone = campoTelefone.getText().trim();
        String email = campoEmail.getText().trim();

        if (!validarCampos(nome, telefone, email)) {
            return;
        }

        Contato contato = new Contato(
                nome,
                telefone,
                email
        );

        gerenciador.cadastrar(contato);

        atualizarLista();

        JOptionPane.showMessageDialog(
                this,
                "Contato cadastrado com sucesso.",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE
        );

        limparCampos();
    }

    private void limparCampos() {

        campoNome.setText("");
        campoTelefone.setText("");
        campoEmail.setText("");

        listaContatos.clearSelection();

        campoNome.requestFocusInWindow();
    }

    private void removerContato() {

        Contato selecionado =
                listaContatos.getSelectedValue();

        if (selecionado == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um contato para remover.",
                    "Nenhum contato selecionado",
                    JOptionPane.WARNING_MESSAGE
            );

            listaContatos.requestFocusInWindow();

            return;
        }

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja remover o contato "
                        + selecionado.getNome() + "?",
                "Confirmar remoção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (resposta != JOptionPane.YES_OPTION) {
            return;
        }

        boolean removido =
                gerenciador.remover(selecionado);

        if (removido) {

            atualizarLista();

            JOptionPane.showMessageDialog(
                    this,
                    "Contato removido com sucesso.",
                    "Remoção",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "O contato não foi encontrado.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void sair() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente sair?",
                "Confirmar saída",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    private void atualizarLista() {

        modeloLista.clear();

        for (Contato contato : gerenciador.listarTodos()) {
            modeloLista.addElement(contato);
        }
    }

    private boolean validarCampos(
            String nome,
            String telefone,
            String email
    ) {

        if (nome.isBlank()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Informe o nome do contato.",
                    "Nome obrigatório",
                    JOptionPane.WARNING_MESSAGE
            );

            campoNome.requestFocusInWindow();

            return false;
        }

        if (nome.length() < 3) {

            JOptionPane.showMessageDialog(
                    this,
                    "O nome deve possuir pelo menos 3 caracteres.",
                    "Nome inválido",
                    JOptionPane.WARNING_MESSAGE
            );

            campoNome.requestFocusInWindow();

            return false;
        }

        if (telefone.isBlank()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Informe o telefone do contato.",
                    "Telefone obrigatório",
                    JOptionPane.WARNING_MESSAGE
            );

            campoTelefone.requestFocusInWindow();

            return false;
        }

        String somenteNumeros =
                telefone.replaceAll("\\D", "");

        if (somenteNumeros.length() < 8) {

            JOptionPane.showMessageDialog(
                    this,
                    "O telefone deve possuir pelo menos 8 números.",
                    "Telefone inválido",
                    JOptionPane.WARNING_MESSAGE
            );

            campoTelefone.requestFocusInWindow();

            return false;
        }

        if (email.isBlank()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Informe o e-mail do contato.",
                    "E-mail obrigatório",
                    JOptionPane.WARNING_MESSAGE
            );

            campoEmail.requestFocusInWindow();

            return false;
        }

        int posicaoArroba =
                email.indexOf("@");

        int posicaoPonto =
                email.lastIndexOf(".");

        if (posicaoArroba <= 0
                || posicaoPonto <= posicaoArroba + 1
                || posicaoPonto == email.length() - 1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Informe um e-mail válido.",
                    "E-mail inválido",
                    JOptionPane.WARNING_MESSAGE
            );

            campoEmail.requestFocusInWindow();

            return false;
        }

        return true;
    }
}