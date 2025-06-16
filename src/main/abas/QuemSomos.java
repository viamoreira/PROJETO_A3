package src.main.abas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class QuemSomos extends JPanel {
    private Map<String, Boolean> secoesLidas = new HashMap<>();
    private JProgressBar progressBar;
    private JLabel lblProgresso;
    private boolean progressoCompleto = false;
    private Timer timerProgresso;
    private JScrollPane scrollPane;

    // Construtor da classe QuemSomos que configura toda a aba
    public QuemSomos() {
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
        
        JLabel subtitulo = new JLabel("Equipe de Robótica", SwingConstants.CENTER);
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

        // Seção 1: Sobre a Equipe
        adicionarSecaoComBotao(conteudo, 
            "Sobre Nós",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<p>Somos a equipe de robótica STARBOTS, orgulhosamente participantes da modalidade FIRST Tech Challenge (FTC).</p>" +
            "<p>Nossa jornada teve início em 2018, ano em que o SESI trouxe oficialmente essa modalidade para o Brasil.</p>" +
            "<p>Desde então, temos nos dedicado com entusiasmo à robótica educacional e à competição tecnológica, " +
            "marcando presença constante nos torneios nacionais.</p>" +
            "<p>Ao longo dos anos, acumulamos aprendizados valiosos, enfrentamos desafios técnicos, desenvolvemos soluções criativas " +
            "e fortalecemos o trabalho em equipe.</p>" +
            "<p>Nosso objetivo vai muito além da competição: buscamos inspirar jovens a explorarem o mundo da ciência e tecnologia, " +
            "contribuindo para a formação de futuros profissionais preparados para enfrentar os desafios do século XXI.</p>" +
            "<p>A STARBOTS se orgulha de representar não só a nossa escola e comunidade, mas também os valores do Gracious Professionalism " +
            "e Coopertition que estão no coração da FIRST.</p>" +
            "</body></html>",
            "icons/equipe.png");

        // Seção 2: Sobre a FIRST
        adicionarSecaoComBotao(conteudo,
            "FIRST Tech Challenge",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<p>Participamos de uma das modalidades da FIRST® (For Inspiration and Recognition of Science and Technology), " +
            "uma Organização Não Governamental (ONG) de alcance global que busca transformar a educação por meio da robótica.</p>" +
            "<p>Fundada com o objetivo de inspirar jovens a se envolverem com ciência e tecnologia, a FIRST promove valores como inovação, " +
            "cooperação e profissionalismo com propósito.</p>" +
            "<p>Seu foco principal está no incentivo às áreas STEAM (Science, Technology, Engineering, Arts and Mathematics), " +
            "proporcionando experiências práticas e desafiadoras que simulam situações reais de engenharia e resolução de problemas.</p>" +
            "<p>Ao fazer parte desse movimento global, contribuímos para a formação de uma nova geração de pensadores criativos, " +
            "cientistas, engenheiros, artistas e líderes comprometidos com um futuro mais inovador e sustentável.</p>" +
            "</body></html>",
            "icons/first.png");

        // Seção 3: Nossos Valores
        adicionarSecaoComBotao(conteudo,
            "Nossos Valores",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<p>Desde nossa criação, temos o objetivo de levar os valores da FIRST® para a comunidade através de nossas ações.</p>" +
            "<p>Acreditamos que a robótica vai muito além da tecnologia: ela é uma ferramenta de transformação social, " +
            "capaz de impactar positivamente a vida das pessoas ao nosso redor.</p>" +
            "<p>Prezamos pelo respeito, empatia e harmonia em todas as nossas interações, valorizando sempre a diversidade de ideias " +
            "e o trabalho colaborativo.</p>" +
            "<p>Por meio de oficinas, mentorias, eventos e ações sociais, nos esforçamos para expandir o alcance do conhecimento, " +
            "compartilhando o que aprendemos e inspirando outras pessoas a também acreditarem na força da ciência e da cooperação.</p>" +
            "</body></html>", 
            "icons/valores.png");

        // Seção 4: Contato
        JPanel painelContato = criarPainelContato();
        conteudo.add(painelContato);

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

    // Método para atualizar o progresso da barra de progresso
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

    // Método para criar o painel de contato
    private JPanel criarPainelContato() {
        JPanel painelContato = new JPanel();
        painelContato.setLayout(new BoxLayout(painelContato, BoxLayout.Y_AXIS));
        painelContato.setBackground(Color.WHITE);
        painelContato.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        JLabel tituloContato = new JLabel("Contato");
        tituloContato.setFont(new Font("Poppins", Font.BOLD, 18));
        tituloContato.setForeground(Color.decode("#600098"));
        tituloContato.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel email = new JLabel("Email: ftcstarbots@gmail.com");
        email.setFont(new Font("Poppins", Font.PLAIN, 14));
        email.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel redes = new JLabel("Redes Sociais: @starbotsftc");
        redes.setFont(new Font("Poppins", Font.PLAIN, 14));
        redes.setAlignmentX(Component.LEFT_ALIGNMENT);

        painelContato.add(tituloContato);
        painelContato.add(Box.createRigidArea(new Dimension(0, 10)));
        painelContato.add(email);
        painelContato.add(Box.createRigidArea(new Dimension(0, 5)));
        painelContato.add(redes);

        return painelContato;
    }

    // Método para adicionar o rodapé da aba
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