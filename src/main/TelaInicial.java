package src.main;
// Importação das bibliotecas necessárias para criar a interface gráfica
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;

import src.main.abas.QuemSomos;

// Classe principal que estende JFrame para criar uma janela
public class TelaInicial extends JFrame {

    public static void iniciar() {
        new TelaInicial();
    }

    // Classe interna responsável por criar uma borda arredondada personalizada
    class RoundedBorder implements Border {
        private int radius;  // Raio dos cantos arredondados
        private Color color; // Cor da borda

        // Construtor que recebe o raio e a cor da borda
        RoundedBorder(int radius, Color color) {
            this.radius = radius;
            this.color = color;
        }

        // Define as margens internas da borda (Insets)
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius + 1, radius + 1, radius + 1, radius + 1);
        }

        // Indica se a borda é opaca (não é)
        @Override
        public boolean isBorderOpaque() {
            return false;
        }

        // Método que desenha a borda arredondada no componente
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(color);  // Define a cor da borda
            g2.setStroke(new BasicStroke(2));  // Define a espessura da linha da borda
            // Desenha o retângulo com cantos arredondados
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
    

    // Construtor da classe PaginaInicial que configura toda a janela
    public TelaInicial() {
        setTitle("Botinho: Robô didático"); // Define o título da janela
        setSize(800, 600);  // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Fecha o programa ao fechar a janela
        getContentPane().setBackground(Color.decode("#600098"));  // Define a cor de fundo da janela
        setLayout(new BorderLayout());  // Define o layout para organizar componentes

        // Define a fonte padrão para componentes
        Font fonte = new Font("Poppins", Font.PLAIN, 12);

        // Carregando a imagem principal
        String caminhoImagem = "src/resources/imagens/logo_botinho_funoroxo.png";
        ImageIcon imagemIcon = new ImageIcon(caminhoImagem);  // Carrega a imagem como ícone
        JLabel imagem = new JLabel(imagemIcon, SwingConstants.CENTER);  // Cria um JLabel com a imagem centralizada
        imagem.setFont(fonte.deriveFont(Font.BOLD, 20f));  // Define a fonte em negrito
        imagem.setForeground(Color.decode("#600098"));  // Define a cor do texto do JLabel (opcional)

        // Carregando o ícone que será usado no botão
        String caminhoIcone = "C:\\Users\\livia\\CODE\\PROJETO_A3\\src\\resources\\imagens\\button_welcome.png";
        ImageIcon iconeBotao = new ImageIcon(caminhoIcone);  // Carrega o ícone do botão

        // Criando o botão com texto e ícone
        JButton iniciar = new JButton("Seja bem-vindo(a)!", iconeBotao);
        iniciar.setIconTextGap(5);  // Espaço entre ícone e texto
        iniciar.setPreferredSize(new Dimension(250, 40));  // Define o tamanho preferencial do botão
        iniciar.setMaximumSize(new Dimension(250, 40));  // Define o tamanho máximo
        iniciar.setMinimumSize(new Dimension(250, 40));  // Define o tamanho mínimo
        iniciar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Define margens internas do botão
        iniciar.setFocusPainted(false);  // Remove a borda de foco ao clicar
        iniciar.setContentAreaFilled(false);  // Remove a área de preenchimento padrão
        iniciar.setBorder(new RoundedBorder(10, Color.decode("#f1f6f9")));  // Define a borda arredondada
        iniciar.setBackground(Color.decode("#600098"));  // Cor de fundo do botão
        iniciar.setForeground(Color.decode("#f1f6f9"));  // Cor do texto do botão
        iniciar.setFont(fonte.deriveFont(Font.BOLD, 14f));  // Define a fonte do botão em negrito

        // Configura a posição do texto no botão (à direita do ícone)
        iniciar.setHorizontalTextPosition(SwingConstants.RIGHT);
        iniciar.setIconTextGap(10);  // Espaçamento entre ícone e texto

        // Criando um painel para conter o botão
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.CENTER));  // Painel com layout centralizado
        painel.setOpaque(false);  // Deixa o fundo do painel transparente
        painel.add(iniciar);  // Adiciona o botão ao painel

        // Adiciona o painel com o botão à parte inferior da janela
        add(painel, BorderLayout.SOUTH);
        // Adiciona a imagem ao centro da janela
        add(imagem, BorderLayout.CENTER);

        // Define a ação que ocorre ao clicar no botão
        iniciar.addActionListener((ActionEvent e) -> {
            dispose();  // Fecha a janela atual
            new MenuPrincipal();  // Abre uma nova janela ou tela
        });

        setLocationRelativeTo(null);  // Centraliza a janela na tela
        setVisible(true);  // Torna a janela visível
    }

    // Método main: ponto de entrada do programa
    public static void main(String[] args) {
        new TelaInicial();  // Cria e exibe a janela PaginaInicial
    }
}


