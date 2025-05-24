import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVerticalComAbas extends JFrame {

    // Construtor da classe MenuVerticalComAbas
    public MenuVerticalComAbas() {
        
        // Definindo as configurações da janela principal
        setTitle("Início");  // Título da janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Ação ao fechar a janela
        setSize(800, 600);  // Tamanho da janela
        setLocationRelativeTo(null);  // Janela centralizada na tela
        setLayout(new BorderLayout());  // Layout principal como BorderLayout

        // Criação do painel lateral de menu
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(10, 1, 10, 5));  // GridLayout para os botões do menu
        menu.setBackground(Color.decode("#f1f6f9"));  // Cor de fundo roxa do menu

        // Lista de abas (botões) do menu
        String[] abas = {"Início", "Quem somos", "Conheça o Robô", "Práticas EFI", "Práticas EFII", "Práticas EM"};

        // Criação do painel que gerencia as abas (conteúdos)
        JPanel painelAbas = new JPanel(new CardLayout());  // Layout de abas (CardLayout)
        painelAbas.setBackground(Color.decode("#f1f6f9"));  // Cor de fundo para o conteúdo das abas

        // Definindo a fonte para os botões e textos
        Font fonte = new Font("Poppins", Font.PLAIN, 12);  // Fonte padrão com tamanho 12

        // Loop para criar os botões de cada aba
        for (String aba : abas) {
            JButton btn = new JButton(aba);  // Criando um botão para cada aba
            btn.setBackground(Color.decode("#600098"));  // Cor de fundo do botão
            btn.setForeground(Color.WHITE);  // Cor do texto do botão
            btn.setFont(fonte.deriveFont(Font.BOLD, 15f));  // Fonte do botão em negrito
            btn.setPreferredSize(new Dimension(90, 25));  // Tamanho do botão (menor)
            btn.setMargin(new Insets(3, 5, 3, 5));  // Ajustando as margens internas do botão
            btn.setFocusPainted(false);  // Remove a borda de foco ao clicar
            menu.add(btn);  // Adicionando o botão ao painel de menu

            // Criando o conteúdo de cada aba
            JPanel conteudo = new JPanel();
            conteudo.setBackground(Color.decode("#f1f6f9"));  // Cor de fundo do conteúdo da aba
            conteudo.add(new JLabel("Conteúdo de " + aba));  // Adicionando um label de exemplo ao conteúdo

            painelAbas.add(conteudo, aba);  // Adicionando o conteúdo da aba no painel de abas

            // Ação do botão para exibir o conteúdo da aba correspondente
            btn.addActionListener(e -> {
                CardLayout cl = (CardLayout) (painelAbas.getLayout());  // Obtendo o CardLayout
                cl.show(painelAbas, aba);  // Mostrando o conteúdo da aba ao clicar no botão
            });
        }

        // ✅ Criando o botão "Voltar"
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.setBackground(Color.decode("#bf93ff"));  // Cor de fundo do botão "Voltar"
        btnVoltar.setForeground(Color.decode("#f1f6f9"));  // Cor do texto do botão "Voltar"
        btnVoltar.setFont(fonte.deriveFont(Font.BOLD, 12f));  // Fonte em negrito para o botão "Voltar"
        btnVoltar.setPreferredSize(new Dimension(90, 25));  // Tamanho do botão "Voltar"
        btnVoltar.setMargin(new Insets(3, 5, 3, 5));  // Ajustando as margens internas do botão "Voltar"
        btnVoltar.setFocusPainted(false);  // Remove a borda de foco ao clicar

        // Ação ao clicar no botão "Voltar" (fecha a janela atual e abre a PaginaInicial)
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // Fecha a janela atual
                new PaginaInicial();  // Cria uma nova instância da classe PaginaInicial
            }
        });

        menu.add(btnVoltar);  // Adicionando o botão "Voltar" ao painel de menu

        // Criando o painel de divisão entre o menu e o conteúdo das abas
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menu, painelAbas);
        splitPane.setDividerLocation(150);  // Definindo a posição da linha de divisão
        splitPane.setEnabled(false);  // Desabilitando a movimentação da linha de divisão

        add(splitPane, BorderLayout.CENTER);  // Adicionando o splitPane à janela principal

        setVisible(true);  // Tornando a janela visível
    }
}
