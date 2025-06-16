package src.main;
import javax.swing.*;

import java.awt.*;

import src.main.abas.ConhecaORobo;
import src.main.abas.PraticasEM;
import src.main.abas.QuemSomos;
import src.main.abas.Inicio;
import src.main.abas.PraticasEFI;
import src.main.abas.PraticasEFII;
import src.main.abas.Padrao;

public class MenuPrincipal extends JFrame {

    // Método estático para iniciar a interface (chamado pelo AppPrincipal)
    public static void iniciar() {
        new MenuPrincipal(); // Cria uma instância da janela
    }

    // Construtor da classe
    public MenuPrincipal() {
        configurarJanela();
        adicionarComponentes();
    }

    private void configurarJanela() {
        setTitle("Início");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
    }

     private void adicionarComponentes() {
    // Painel do menu lateral
    JPanel menu = new JPanel();
    menu.setLayout(new GridLayout(10, 1, 10, 5));
    menu.setBackground(Color.decode("#f1f6f9"));

    // Painel de abas
    JPanel painelAbas = new JPanel(new CardLayout());
    painelAbas.setBackground(Color.decode("#f1f6f9"));

    // CORREÇÃO: Nome da aba consistentes
    String[] abas = {"Início", "Quem somos", "Conheça o Robô", "Práticas EFI", "Práticas EFII", "Práticas EM"};
    Font fonte = new Font("Poppins", Font.PLAIN, 12);

    for (String aba : abas) {
        JButton btn = criarBotaoMenu(aba, fonte);
        menu.add(btn);

        JPanel conteudo;
        switch(aba) {
            case "Início":
                conteudo = new Inicio();
                break;
            case "Quem somos":
                conteudo = new QuemSomos();
                break;
            case "Conheça o Robô":
                conteudo = new ConhecaORobo();
                break;
            case "Práticas EFI":
                conteudo = new PraticasEFI();
                break;
            case "Práticas EFII":
                conteudo = new PraticasEFII();
                break;
            case "Práticas EM":
                conteudo = new PraticasEM();
                break;
            default:
                conteudo = new Padrao(aba);
        }
        painelAbas.add(conteudo, aba);

        btn.addActionListener(e -> {
            ((CardLayout) painelAbas.getLayout()).show(painelAbas, aba);
        });
    }

    // Botão Voltar
    JButton btnVoltar = criarBotaoVoltar(fonte);
    menu.add(btnVoltar);

    // Layout principal (ADICIONE ESTA PARTE QUE ESTAVA FALTANDO)
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menu, painelAbas);
    splitPane.setDividerLocation(150);
    splitPane.setEnabled(false);

    add(splitPane, BorderLayout.CENTER);
    setVisible(true); // ESSA LINHA É CRUCIAL PARA MOSTRAR A JANELA
}

    private JButton criarBotaoMenu(String texto, Font fonte) {
        JButton btn = new JButton(texto);
        btn.setBackground(Color.decode("#600098"));
        btn.setForeground(Color.WHITE);
        btn.setFont(fonte.deriveFont(Font.BOLD, 15f));
        btn.setPreferredSize(new Dimension(90, 25));
        btn.setMargin(new Insets(3, 5, 3, 5));
        btn.setFocusPainted(false);
        return btn;
    }

    private JButton criarBotaoVoltar(Font fonte) {
        JButton btn = new JButton("Voltar");
        btn.setBackground(Color.decode("#bf93ff"));
        btn.setForeground(Color.decode("#f1f6f9"));
        btn.setFont(fonte.deriveFont(Font.BOLD, 12f));
        btn.setPreferredSize(new Dimension(90, 25));
        btn.setMargin(new Insets(3, 5, 3, 5));
        btn.setFocusPainted(false);
        btn.addActionListener(e -> {
            dispose();
            new TelaInicial();
        });
        return btn;
    }
}
