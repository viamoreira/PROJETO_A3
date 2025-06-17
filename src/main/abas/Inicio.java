package src.main.abas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Inicio extends JPanel {
    private Map<String, Boolean> secoesLidas = new HashMap<>();
    private JProgressBar progressBar;
    private JLabel lblProgresso;
    private boolean progressoCompleto = false;
    private Timer timerProgresso;
    private JScrollPane scrollPane;

    // Construtor da classe Inicio que configura toda a aba
    public Inicio() {
        setBackground(Color.decode("#f1f6f9"));
        setLayout(new BorderLayout(10, 10));
        adicionarCabecalho();
        adicionarBarraProgresso();
        adicionarConteudoPrincipal();
        adicionarRodape();
    }

    // Método para adicionar a barra de progresso no topo da aba
    private void adicionarBarraProgresso() {
        JPanel painelProgresso = new JPanel(new BorderLayout());
        painelProgresso.setBackground(Color.decode("#f1f6f9"));
        painelProgresso.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.decode("#600098"));
        progressBar.setBackground(Color.WHITE);
        progressBar.setValue(0);

        lblProgresso = new JLabel("Progresso: 0%");
        lblProgresso.setFont(new Font("Poppins", Font.BOLD, 12));
        lblProgresso.setForeground(Color.decode("#600098"));

        painelProgresso.add(lblProgresso, BorderLayout.WEST);
        painelProgresso.add(progressBar, BorderLayout.CENTER);

        add(painelProgresso, BorderLayout.NORTH);
    }

    // Método para adicionar o cabeçalho da aba
    private void adicionarCabecalho() {
        JPanel cabecalhoPanel = new JPanel(new BorderLayout());
        cabecalhoPanel.setBackground(Color.decode("#600098"));
        
        JLabel titulo = new JLabel("STARBOTS - FTC", SwingConstants.CENTER);
        titulo.setFont(new Font("Poppins", Font.BOLD, 32));
        titulo.setForeground(Color.decode("#f1f6f9"));
        titulo.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        
        JLabel subtitulo = new JLabel("Início", SwingConstants.CENTER);
        subtitulo.setFont(new Font("Poppins", Font.PLAIN, 18));
        subtitulo.setForeground(Color.decode("#f1f6f9"));
        subtitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        
        cabecalhoPanel.add(titulo, BorderLayout.CENTER);
        cabecalhoPanel.add(subtitulo, BorderLayout.SOUTH);
        add(cabecalhoPanel, BorderLayout.NORTH);
    }

    // Método para adicionar o conteúdo principal da aba
    private void adicionarConteudoPrincipal() {
        JPanel conteudo = new JPanel();
        conteudo.setLayout(new BoxLayout(conteudo, BoxLayout.PAGE_AXIS));
        conteudo.setBackground(Color.WHITE);
        conteudo.setBorder(BorderFactory.createEmptyBorder(50, 50, 80, 50));

        // Seção 1: Introdução
        adicionarSecaoComBotao(conteudo, 
            "Desafios da Robótica Educacional",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<p>Observamos que a falta de contato e conhecimento sobre robótica pode prejudicar significativamente os estudantes, " +
            "principalmente quando comparados àqueles que têm acesso a esse tipo de oportunidade desde cedo.</p>" +
            "<p>Essa desigualdade educacional reflete diretamente no desenvolvimento de habilidades essenciais para o século XXI.</p>" +
            "<p>Entre os impactos mais evidentes estão a dificuldade de adaptação às novas tecnologias, " +
            "a limitação no pensamento crítico e criativo, e a perda de interesse por áreas fundamentais como STEAM " +
            "(Science, Technology, Engineering, Arts e Mathematics).</p>" +
            "<p>Além disso, essa lacuna pode comprometer a preparação desses jovens para os desafios do mercado de trabalho, " +
            "onde competências tecnológicas, resolução de problemas e trabalho em equipe são cada vez mais exigidos.</p>" +
            "<p>Por isso, acreditamos que democratizar o acesso à robótica educacional é uma forma concreta de promover equidade, " +
            "fortalecer a educação e transformar realidades.</p>" +
            "</body></html>",
            "src\\resources\\imagens\\desafios.jpg");

        // Seção 2: Benefícios
        adicionarSecaoComBotao(conteudo,
            "Benefícios da Robótica na Educação",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<p>Entretanto, durante o processo de aprendizagem, ter o auxílio da robótica traz inúmeros benefícios para os alunos.</p>" +
            "<p>Ela atua como uma ferramenta dinâmica e envolvente, que transforma o ambiente educacional e desperta o interesse dos estudantes.</p>" +
            "<p>Dentre os principais benefícios estão o desenvolvimento de habilidades como a criatividade — permitindo que os alunos deem vida às suas ideias —, " +
            "o pensamento crítico para a resolução de problemas reais, o trabalho em equipe e a capacidade de comunicação.</p>" +
            "<p>Além disso, a robótica estimula a curiosidade e o envolvimento com as áreas STEAM (Science, Technology, Engineering, Arts e Mathematics), " +
            "contribuindo para uma formação mais completa, prática e alinhada às demandas do mundo moderno.</p>" +
            "<p>Com esse propósito, desenvolvemos um kit educacional composto por quatro robôs didáticos, carinhosamente chamados de Botinho.</p>" +
            "<p>Esses robôs foram projetados para tornar as aulas mais lúdicas, acessíveis e interessantes para os estudantes.</p>" +
            "<p>Este manual foi criado com o intuito de auxiliar os professores na aplicação dessa ferramenta em sala de aula, " +
            "com foco em proporcionar um aprendizado significativo para alunos do 6º ao 9º ano do Ensino Fundamental II.</p>" +
            "</body></html>",
            "src\\resources\\imagens\\beneficios.jpg");

        // Seção 3: Estatísticas
        adicionarSecaoComBotao(conteudo,
            "Impacto Mensurável",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<ul>" +
            "<li>Alunos que possuem acesso à robótica educacional em suas aulas têm um aumento de <b>25% no desempenho</b> em matérias de STEM</li>" +
            "<li>A robótica pode aumentar em até <b>30% a capacidade</b> dos estudantes em habilidades de resolução de problemas e pensamento crítico</li>" +
            "</ul></body></html>",
            "src\\resources\\imagens\\impacto.jpg");

        scrollPane = new JScrollPane(conteudo);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);
        
        // Força a rolagem para o topo após a exibição
        SwingUtilities.invokeLater(() -> scrollPane.getViewport().setViewPosition(new Point(0, 0)));
    }

    // Método para adicionar uma seção com botão de confirmação
    private void adicionarSecaoComBotao(JPanel container, String titulo, String texto, String iconeCaminho) {
        String nomeSecao = "SECAO_" + titulo.replaceAll(" ", "_");
        secoesLidas.put(nomeSecao, false);

        JPanel secao = new JPanel();
        secao.setLayout(new BoxLayout(secao, BoxLayout.Y_AXIS));
        secao.setBackground(Color.WHITE);
        secao.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        secao.setName(nomeSecao);

        // Painel do conteúdo
        JPanel painelConteudo = new JPanel(new BorderLayout());
        painelConteudo.setBackground(Color.WHITE);

        // Ícone
        JLabel lblIcone = new JLabel();
        try {
            ImageIcon icon = new ImageIcon(iconeCaminho);
            lblIcone.setIcon(new ImageIcon(icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            lblIcone.setIcon(new ImageIcon(new ImageIcon("icons/default.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        }
        lblIcone.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 15));

        // Textos
        JPanel textos = new JPanel(new BorderLayout());
        textos.setBackground(Color.WHITE);

        JLabel lblTitulo = new JLabel(titulo);
        lblTitulo.setFont(new Font("Poppins", Font.BOLD, 18));
        lblTitulo.setForeground(Color.decode("#600098"));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));

        JEditorPane txtDescricao = new JEditorPane();
        txtDescricao.setContentType("text/html");
        txtDescricao.setText(texto);
        txtDescricao.setEditable(false);
        txtDescricao.setBackground(Color.WHITE);
        txtDescricao.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        txtDescricao.setPreferredSize(new Dimension(600, txtDescricao.getPreferredSize().height));

        textos.add(lblTitulo, BorderLayout.NORTH);
        textos.add(txtDescricao, BorderLayout.CENTER);

        painelConteudo.add(lblIcone, BorderLayout.WEST);
        painelConteudo.add(textos, BorderLayout.CENTER);

        // Botão de confirmação
        JButton btnConfirmar = new JButton("Li e entendi esta seção");
        btnConfirmar.setFont(new Font("Poppins", Font.BOLD, 14));
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.setBackground(Color.decode("#600098"));
        btnConfirmar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnConfirmar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secoesLidas.put(nomeSecao, true);
                btnConfirmar.setEnabled(false);
                btnConfirmar.setText("Seção concluída ✓");
                atualizarProgresso();
            }
        });

        secao.add(painelConteudo);
        secao.add(Box.createRigidArea(new Dimension(0, 20)));
        secao.add(btnConfirmar);

        container.add(secao);
        container.add(Box.createRigidArea(new Dimension(0, 40)));
    }

    private void atualizarProgresso() {
        if (progressoCompleto) return;
        
        int totalSecoes = secoesLidas.size();
        int secoesLidasCount = (int) secoesLidas.values().stream().filter(b -> b).count();
        int novoProgresso = (int) ((double) secoesLidasCount / totalSecoes * 100);
        
        if (timerProgresso != null && timerProgresso.isRunning()) {
            timerProgresso.stop();
        }
        
        timerProgresso = new Timer(20, e -> {
            int current = progressBar.getValue();
            if (current < novoProgresso) {
                progressBar.setValue(current + 1);
                lblProgresso.setText(String.format("Progresso: %d%% (%d/%d)", 
                    progressBar.getValue(),
                    secoesLidasCount,
                    totalSecoes));
            } else {
                timerProgresso.stop();
                if (novoProgresso == 100) {
                    progressoCompleto = true;
                }
            }
        });
        timerProgresso.start();
    }

    private void adicionarRodape() {
        JPanel rodapePanel = new JPanel(new BorderLayout());
        rodapePanel.setBackground(Color.decode("#600098"));
        
        JLabel rodape = new JLabel("© 2025 STARBOTS - Todos os direitos reservados | FTC Team #16055", SwingConstants.CENTER);
        rodape.setFont(new Font("Poppins", Font.ITALIC, 12));
        rodape.setForeground(Color.WHITE);
        rodape.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        rodapePanel.add(rodape);
        add(rodapePanel, BorderLayout.SOUTH);
    }
}