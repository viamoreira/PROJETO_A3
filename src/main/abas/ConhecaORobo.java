package src.main.abas;

import javax.swing.*;
import java.awt.*;

public class ConhecaORobo extends JPanel {

    public ConhecaORobo() {
        setBackground(Color.decode("#f1f6f9"));
        setLayout(new BorderLayout(10, 10));

        // Painel principal que contém as imagens
        JPanel imagensPanel = new JPanel(new GridLayout(1, 3, 10, 0)); // 1 linha, 3 colunas, com espaçamento horizontal de 10px
        imagensPanel.setBackground(Color.decode("#f1f6f9"));
        imagensPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // Margens

        // Carrega e adiciona as 3 imagens
        carregarImagens(imagensPanel);

        // Adiciona o painel de imagens ao centro do layout
        add(imagensPanel, BorderLayout.CENTER);
    }

    private void carregarImagens(JPanel panel) {
        // Imagem 1
        ImageIcon icon1 = new ImageIcon("src\\resources\\imagens\\conheca_o_robo.png"); // Substitua pelo caminho real
        JLabel label1 = new JLabel(new ImageIcon(icon1.getImage().getScaledInstance(420, 595, Image.SCALE_SMOOTH)));
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label1);

        // Imagem 2
        ImageIcon icon2 = new ImageIcon("src\\resources\\imagens\\componentes_robo.png"); // Substitua pelo caminho real
        JLabel label2 = new JLabel(new ImageIcon(icon2.getImage().getScaledInstance(420, 595, Image.SCALE_SMOOTH)));
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);

        // Imagem 3
        ImageIcon icon3 = new ImageIcon("src\\resources\\imagens\\entradas_robo.png"); // Substitua pelo caminho real
        JLabel label3 = new JLabel(new ImageIcon(icon3.getImage().getScaledInstance(420, 595, Image.SCALE_SMOOTH)));
        label3.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label3);
    }
}