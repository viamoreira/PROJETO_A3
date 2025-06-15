package src.main;
import javax.swing.*;

import src.main.PaginaInicial.RoundedBorder;

import java.awt.*;
import java.util.List;

public class TelaLogin extends JFrame {

public static void iniciar() {
    SwingUtilities.invokeLater(() -> new TelaLogin().setVisible(true));
}

    private JTextField emailField;
    private JPasswordField senhaField;

    public TelaLogin() {
        setTitle("Login");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#600098"));
        setLocationRelativeTo(null);
        initComponents();

        Font fonte = new Font("Poppins", Font.PLAIN, 12);
        setFont( fonte.deriveFont(Font.PLAIN, 12f)); // Define a fonte padrão para a janela
    }

    private void initComponents() {
        Font fonte = new Font("Poppins", Font.PLAIN, 12);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(fonte.deriveFont(Font.BOLD, 14f));
        emailLabel.setForeground(Color.decode("#600098"));  // Cor do texto do rótulo
        emailField = new JTextField();

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setFont(fonte.deriveFont(Font.BOLD, 14f));
        senhaLabel.setForeground(Color.decode("#600098"));  // Cor do texto do rótulo
        senhaField = new JPasswordField();

        JButton loginButton = new JButton("Entrar");
        loginButton.setFocusPainted(false);  // Remove a borda de foco ao clicar
        loginButton.setBackground(Color.decode("#600098"));  // Cor de fundo do botão
        loginButton.setForeground(Color.decode("#f1f6f9"));  // Cor do texto do botão
        
        loginButton.setFont(fonte.deriveFont(Font.BOLD, 14f));  // Define a fonte do botão em negrito
        loginButton.addActionListener(e -> autenticar());

        emailField.setFont(fonte);
        senhaField.setFont(fonte);


        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(senhaLabel);
        panel.add(senhaField);
        panel.add(new JLabel()); // espaço vazio
        panel.add(loginButton);

        add(panel);
    }

    private void autenticar() {
        String email = emailField.getText().trim();
        String senha = new String(senhaField.getPassword()).trim();

        List<Usuario> usuarios = UsuarioService.carregarUsuarios();

        if (usuarios != null) {
    for (Usuario u : usuarios) {
        if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
            JLabel label = new JLabel("Bem-vindo, " + u.getNome() + "!");
            label.setFont(new Font("Poppins", Font.PLAIN, 16));
            JOptionPane.showMessageDialog(this, label);
            this.dispose();
            new PaginaInicial().setVisible(true);
            return;
        }
    }
}

       JLabel label = new JLabel("Email ou senha inválidos.");
        label.setFont(new Font("Poppins", Font.PLAIN, 16));
        JOptionPane.showMessageDialog(this, label);
    }
}
