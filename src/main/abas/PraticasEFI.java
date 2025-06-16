package src.main.abas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PraticasEFI extends JPanel {
    private Map<String, Boolean> secoesLidas = new HashMap<>();
    private JProgressBar progressBar;
    private JLabel lblProgresso;
    private boolean progressoCompleto = false;
    private Timer timerProgresso;
    private JScrollPane scrollPane;

    public PraticasEFI() {
       setBackground(Color.decode("#f1f6f9"));
        setLayout(new BorderLayout(10, 10));
        
        // Primeiro adiciona o cabeçalho (NORTH)
        adicionarCabecalho();
        
        // Depois adiciona a barra de progresso (PAGE_START)
        adicionarBarraProgresso();
        
        // Adiciona o conteúdo principal (CENTER)
        adicionarConteudoPrincipal();
        
        // Adiciona o rodapé (SOUTH)
        adicionarRodape();
    }

private void adicionarCabecalho() {
        JPanel cabecalhoPanel = new JPanel(new BorderLayout());
        cabecalhoPanel.setBackground(Color.decode("#600098"));
        
        JLabel titulo = new JLabel("STARBOTS - FTC", SwingConstants.CENTER);
        titulo.setFont(new Font("Poppins", Font.BOLD, 32));
        titulo.setForeground(Color.decode("#f1f6f9"));
        titulo.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
        
        JLabel subtitulo = new JLabel("Práticas EF I", SwingConstants.CENTER);
        subtitulo.setFont(new Font("Poppins", Font.PLAIN, 18));
        subtitulo.setForeground(Color.decode("#f1f6f9"));
        subtitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        
        cabecalhoPanel.add(titulo, BorderLayout.CENTER);
        cabecalhoPanel.add(subtitulo, BorderLayout.SOUTH);
        
        // Adiciona ao painel principal na posição NORTH
        add(cabecalhoPanel, BorderLayout.NORTH);
    }

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

        // Adiciona ao painel principal na posição PAGE_START (acima do conteúdo)
        add(painelProgresso, BorderLayout.PAGE_START);
    }


    private void adicionarConteudoPrincipal() {
        JPanel conteudo = new JPanel();
        conteudo.setLayout(new BoxLayout(conteudo, BoxLayout.PAGE_AXIS));
        conteudo.setBackground(Color.WHITE);
        conteudo.setBorder(BorderFactory.createEmptyBorder(50, 50, 80, 50));

        // CIÊNCIAS - PRÁTICA I
        adicionarSecaoComBotao(conteudo, 
            "CIÊNCIAS - PRÁTICA I",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Terra e Universo — Fontes de Luz e Sombra no Ambiente.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 3º série</p>" +
            "<h3>Objetivo da aula:</h3>" +
            "<ul>" +
            "<li>Compreender como a luz influencia a formação de sombras e a percepção do ambiente.</li>" +
            "<li>Observar e registrar as variações de luminosidade em diferentes espaços, utilizando os sensores do robô.</li>" +
            "<li>Identificar como a presença ou ausência de luz modifica o ambiente e os objetos ao nosso redor.</li>" +
            "</ul>" +
            "<h3>Conteúdos curriculares:</h3>" +
            "<ul>" +
            "<li>Fontes de luz (natural e artificial)</li>" +
            "<li>Luz e sombra no ambiente</li>" +
            "<li>Observação e registro da luminosidade em diferentes locais</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Conversar com os alunos sobre o que é luz e como ela interfere no ambiente.</p>" +
            "<p><b>Momento 2:</b> Organizar diferentes estações na sala simulando situações de luz e sombra.</p>" +
            "<p><b>Momento 3:</b> Dividir os alunos em grupos para medir a luminosidade com o robô (Função 16 e 17).</p>" +
            "<p><b>Momento 4:</b> Analisar em grupo onde estava mais claro e mais escuro.</p>" +
            "<p><b>Momento 5:</b> Compartilhar dados e relacionar com situações do cotidiano.</p>" +
            "</body></html>",
            "icons/ciencias.png");

        // CIÊNCIAS - PRÁTICA II
        adicionarSecaoComBotao(conteudo,
            "CIÊNCIAS - PRÁTICA II",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Matéria e Energia — Fontes de Energia no Cotidiano.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 4ª série</p>" +
            "<h3>Objetivo da aula:</h3>" +
            "<ul>" +
            "<li>Compreender que a luz é uma forma de energia.</li>" +
            "<li>Identificar diferentes fontes de luz (natural e artificial) no ambiente.</li>" +
            "<li>Observar como a luz influencia a temperatura dos objetos e do ambiente, utilizando sensores do robô.</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Conversar sobre a luz como forma de energia.</p>" +
            "<p><b>Momento 2:</b> Organizar quatro estações no pátio com diferentes condições.</p>" +
            "<p><b>Momento 3:</b> Medir luminosidade (Função 16) e temperatura (Função 11) com o robô.</p>" +
            "<p><b>Momento 4:</b> Comparar dados coletados e discutir resultados.</p>" +
            "<p><b>Momento 5:</b> Relacionar os aprendizados com situações do cotidiano.</p>" +
            "</body></html>",
            "icons/energia.png");

        // GEOGRAFIA - PRÁTICA I
        adicionarSecaoComBotao(conteudo,
            "GEOGRAFIA - PRÁTICA I",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Natureza e representação do espaço.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 3º série</p>" +
            "<h3>Objetivos da aula:</h3>" +
            "<ul>" +
            "<li>Compreender noções básicas de localização e deslocamento no espaço utilizando pontos de referência.</li>" +
            "<li>Utilizar direções (frente, trás, direita e esquerda) e trajetos com o robô.</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Organizar um mapa no chão com ruas e pontos de interesse.</p>" +
            "<p><b>Momento 2:</b> Explicar as funções do robô para movimentação.</p>" +
            "<p><b>Momento 3:</b> Dividir a turma em grupos para planejar trajetos.</p>" +
            "<p><b>Momento 4:</b> Compartilhar trajetos e discutir pontos de referência.</p>" +
            "</body></html>",
            "icons/geografia.png");

        // GEOGRAFIA - PRÁTICA II
        adicionarSecaoComBotao(conteudo,
            "GEOGRAFIA - PRÁTICA II",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Natureza, ambientes e qualidade de vida.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 4° série</p>" +
            "<h3>Objetivos da aula:</h3>" +
            "<ul>" +
            "<li>Compreender as diferenças entre clima e tempo</li>" +
            "<li>Observar e registrar as condições do ambiente utilizando sensores do robô</li>" +
            "<li>Relacionar elementos naturais com tipos de clima</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Discutir diferenças entre clima e tempo.</p>" +
            "<p><b>Momento 2:</b> Organizar estações representando diferentes ambientes.</p>" +
            "<p><b>Momento 3:</b> Medir umidade (Função 10), temperatura (Função 11) e luminosidade (Função 16).</p>" +
            "<p><b>Momento 4:</b> Comparar dados das diferentes estações.</p>" +
            "<p><b>Momento 5:</b> Refletir sobre como esses elementos interferem na nossa vida.</p>" +
            "</body></html>",
            "icons/geografia.png");

        // GEOGRAFIA - PRÁTICA III
        adicionarSecaoComBotao(conteudo,
            "GEOGRAFIA - PRÁTICA III",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Natureza, ambientes e qualidade de vida.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 5ª série</p>" +
            "<h3>Objetivos da aula:</h3>" +
            "<ul>" +
            "<li>Reconhecer as principais formas de relevo: planalto, planície, serra e depressão</li>" +
            "<li>Simular percursos em diferentes tipos de relevo com o robô</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Apresentar tipos de relevo com imagens e mapas.</p>" +
            "<p><b>Momento 2:</b> Construir maquete simplificada com diferentes relevos.</p>" +
            "<p><b>Momento 3:</b> Planejar trajetos para o robô em diferentes terrenos.</p>" +
            "<p><b>Momento 4:</b> Discutir desafios encontrados em cada tipo de relevo.</p>" +
            "<p><b>Momento 5:</b> Relacionar com situações reais de construção e transporte.</p>" +
            "</body></html>",
            "icons/relevo.png");

        // MATEMÁTICA - PRÁTICA I
        adicionarSecaoComBotao(conteudo,
            "MATEMÁTICA - PRÁTICA I",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Números e Operações.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 3º série</p>" +
            "<h3>Objetivos da aula:</h3>" +
            "<ul>" +
            "<li>Praticar adição e subtração de maneira divertida.</li>" +
            "<li>Utilizar o robô para associar movimento com cálculos.</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Criar 'ilhas do tesouro' com números no chão.</p>" +
            "<p><b>Momento 2:</b> Lançar desafios matemáticos para os alunos resolverem com o robô.</p>" +
            "<p><b>Momento 3:</b> Cada aluno cria um desafio para os colegas.</p>" +
            "</body></html>",
            "icons/matematica.png");

        // MATEMÁTICA - PRÁTICA II
        adicionarSecaoComBotao(conteudo,
            "MATEMÁTICA - PRÁTICA II",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Grandezas e Medidas - Sistema de Medidas de Comprimento.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 4° série</p>" +
            "<h3>Objetivos da aula:</h3>" +
            "<ul>" +
            "<li>Compreender medidas de comprimento (metro e centímetro)</li>" +
            "<li>Relacionar medidas com deslocamento e espaço</li>" +
            "<li>Utilizar o robô para representar e comparar medidas</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Introduzir conceitos de medidas de comprimento.</p>" +
            "<p><b>Momento 2:</b> Marcar trajetos no chão para medição.</p>" +
            "<p><b>Momento 3:</b> Fazer estimativas e medir com o robô (Função 2).</p>" +
            "<p><b>Momento 4:</b> Comparar estimativas com medidas reais.</p>" +
            "<p><b>Momento 5:</b> Refletir sobre a importância das medidas no cotidiano.</p>" +
            "</body></html>",
            "icons/medidas.png");

        // MATEMÁTICA - PRÁTICA III
        adicionarSecaoComBotao(conteudo,
            "MATEMÁTICA - PRÁTICA III",
            "<html><body style='font-family:Poppins; font-size:14px;'>" +
            "<h3>Unidade Temática:</h3>" +
            "<p>Geometria - Ângulos e suas classificações.</p>" +
            "<h3>Ano escolar:</h3>" +
            "<p>Ensino Fundamental I - 5º série</p>" +
            "<h3>Objetivos da aula:</h3>" +
            "<ul>" +
            "<li>Identificar e classificar ângulos (reto, agudo e obtuso)</li>" +
            "<li>Compreender ângulos na prática com movimentos do robô</li>" +
            "</ul>" +
            "<h3>Desenvolvimento da aula:</h3>" +
            "<p><b>Momento 1:</b> Introduzir conceitos de ângulos com exemplos.</p>" +
            "<p><b>Momento 2:</b> Demonstrar giros do robô (Funções 4, 5 e 6).</p>" +
            "<p><b>Momento 3:</b> Criar percurso com desafios de ângulos.</p>" +
            "<p><b>Momento 4:</b> Planejar figuras geométricas com giros específicos.</p>" +
            "<p><b>Momento 5:</b> Discutir aplicações dos ângulos no dia a dia.</p>" +
            "</body></html>",
            "icons/angulos.png");

        scrollPane = new JScrollPane(conteudo);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);
        
        // Força a rolagem para o topo após a exibição
        SwingUtilities.invokeLater(() -> scrollPane.getViewport().setViewPosition(new Point(0, 0)));
    }

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