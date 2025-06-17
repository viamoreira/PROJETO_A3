package src.main.abas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PraticasEFII extends JPanel {
    private Map<String, Boolean> secoesLidas = new HashMap<>();
    private JProgressBar progressBar;
    private JLabel lblProgresso;
    private boolean progressoCompleto = false;
    private Timer timerProgresso;
    private JScrollPane scrollPane;

    public PraticasEFII() {
       setBackground(Color.decode("#f1f6f9"));
        setLayout(new BorderLayout(10, 10));

        adicionarCabecalho();
        adicionarBarraProgresso();
        adicionarConteudoPrincipal();
        adicionarRodape();
    }
 
    // Método para adicionar o cabeçalho da aba
private void adicionarCabecalho() {
        JPanel cabecalhoPanel = new JPanel(new BorderLayout());
        cabecalhoPanel.setBackground(Color.decode("#600098"));
        
        JLabel titulo = new JLabel("STARBOTS - FTC", SwingConstants.CENTER);
        titulo.setFont(new Font("Poppins", Font.BOLD, 32));
        titulo.setForeground(Color.decode("#f1f6f9"));
        titulo.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
        
        JLabel subtitulo = new JLabel("Práticas EF II", SwingConstants.CENTER);
        subtitulo.setFont(new Font("Poppins", Font.PLAIN, 18));
        subtitulo.setForeground(Color.decode("#f1f6f9"));
        subtitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
        
        cabecalhoPanel.add(titulo, BorderLayout.CENTER);
        cabecalhoPanel.add(subtitulo, BorderLayout.SOUTH);
        
        // Adiciona ao painel principal na posição NORTH
        add(cabecalhoPanel, BorderLayout.NORTH);
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

        // Adiciona ao painel principal na posição PAGE_START (acima do conteúdo)
        add(painelProgresso, BorderLayout.PAGE_START);
    }

    // Método para adicionar o conteúdo principal da aba
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
    "<p>Terra e Universo.</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II – 7º série</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Compreender o conceito de umidade relativa do ar e sua importância para os seres vivos e para o clima.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Umidade do ar</li>" +
    "<li>Relação entre clima e qualidade de vida</li>" +
    "<li>Observação e análise de fenômenos naturais</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF07CI09) Relacionar a ocorrência de fenômenos naturais (como chuvas, ventos, secas, entre outros) com as mudanças climáticas sazonais e suas influências sobre os seres vivos e o ambiente.</li>" +
    "<li>(EF07CI10) Utilizar diferentes instrumentos e tecnologias para coleta de dados relacionados ao clima local.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Introdução ao conceito de umidade relativa do ar com exemplos do cotidiano.</p>" +
    "<p><b>Momento 2:</b> Coleta de dados com o Botinho (Função 10) em diferentes locais e horários.</p>" +
    "<p><b>Momento 3:</b> Análise e discussão dos dados coletados, respondendo a questões sobre variações de umidade.</p>" +
    "<p><b>Momento 4:</b> Registro dos dados em tabela e construção de gráfico, com compartilhamento de conclusões.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\ciencia_icon.jpg");

// CIÊNCIAS - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "CIÊNCIAS - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Terra e Universo/Vida e Evolução.</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II - 8° e 9° série.</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Relacionar as temperaturas e umidade do ar com os impactos ambientais causados devido às mudanças climáticas.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Clima</li>" +
    "<li>Preservação da biodiversidade</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF08C15) Identificar as principais variáveis envolvidas na previsão do tempo e simular situações nas quais elas possam ser medidas.</li>" +
    "<li>(EF08C16) Discutir iniciativas que contribuam para restabelecer o equilíbrio ambiental a partir da identificação de alterações climáticas regionais e globais provocadas pela intervenção humana.</li>" +
    "<li>(EF09C13) Propor iniciativas individuais e coletivas para a solução de problemas ambientais da cidade ou da comunidade.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Dividir os alunos em grupos e inserir no Botinho as funções 10 e 11 para medir umidade e temperatura.</p>" +
    "<p><b>Momento 2:</b> Analisar variações nos dados e estabelecer conexões com impactos ambientais das mudanças climáticas.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\ciencia_icon.jpg");

// CIÊNCIAS - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "CIÊNCIAS - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade Temática:</h3>" +
    "<p>Terra e Universo.</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II – 9º série</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Identificar a relação entre a umidade relativa do ar e a temperatura, conceitos importantes na meteorologia e no cotidiano.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Umidade relativa do ar</li>" +
    "<li>Mudanças climatológicas</li>" +
    "<li>Relacionar dados e fazer previsões</li>" +
    "<li>Analisar e interpretar dados meteorológicos</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF08C115) Identificar as principais variáveis envolvidas na previsão do tempo e simular situações nas quais elas possam ser medidas.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Dividir os alunos em grupos e inserir a função 10 no Botinho para medir a umidade relativa do ar.</p>" +
    "<p><b>Momento 2:</b> Análise prática da interação entre umidade e temperatura ambiente.</p>" +
    "<p><b>Momento 3:</b> Observação e registro de dados sobre variações de umidade em diferentes condições térmicas.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\ciencia_icon.jpg");

// GEOGRAFIA - PRÁTICA I
adicionarSecaoComBotao(conteudo,
    "GEOGRAFIA - PRÁTICA I",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Movimentos da Terra</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II – 6° série</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Simular o movimento de rotação da Terra.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Movimento de rotação da Terra</li>" +
    "<li>Desenvolvimento de dia e noite</li>" +
    "<li>Fuso horário</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF06GE03) Descrever os movimentos do planeta (rotação e translação) e sua relação com a circulação geral da atmosfera, o tempo atmosférico e os padrões climáticos.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Dividir os alunos em grupos e acionar as funções 4, 5 e 6 no Botinho para simular rotação.</p>" +
    "<p><b>Momento 2:</b> Simular o movimento de rotação da Terra com o robô.</p>" +
    "<p><b>Momento 3:</b> Explicar o movimento e suas consequências (dia/noite, fusos horários).</p>" +
    "</body></html>",
    "src\\resources\\imagens\\geografia_icon.jpgg");

// GEOGRAFIA - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "GEOGRAFIA - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Rosa dos ventos</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II – 6º série</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Identificar os pontos cardeais e colaterais.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Pontos cardeais</li>" +
    "<li>Pontos colaterais</li>" +
    "<li>Rosa dos ventos</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF06GE08) Contribuir para o desenvolvimento da competência de compreensão e interpretação do espaço geográfico, utilizando a cartografia como ferramenta.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Dividir a turma em grupos e acionar as funções 2, 4 e 5 no Botinho para traçar linhas dos pontos cardeais/colaterais.</p>" +
    "<p><b>Momento 2:</b> Usar folha pré-desenhada para o robô locomover-se sobre as linhas.</p>" +
    "<p><b>Momento 3:</b> Identificar pontos cardeais/colaterais a cada linha traçada.</p>" +
    "<p><b>Momento 4:</b> Trabalhar o movimento aparente do sol após conclusão.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\geografia_icon.jpg");

// GEOGRAFIA - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "GEOGRAFIA - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Elementos do clima</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II - 7º série</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Identificar a temperatura e a umidade relativa do ar.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Elementos do clima</li>" +
    "<li>Temperatura</li>" +
    "<li>Amplitude térmica</li>" +
    "<li>Umidade relativa do ar</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF06GE11) Analisar distintas interações das sociedades com a natureza, com base na distribuição dos componentes físico-naturais.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Dividir a turma em grupos e acionar as funções 10 e 11 no Botinho para medir temperatura e umidade.</p>" +
    "<p><b>Momento 2:</b> Coletar dados em diferentes locais da escola.</p>" +
    "<p><b>Momento 3:</b> Criar tabela com 5 pontos de medição.</p>" +
    "<p><b>Momento 4:</b> Calcular amplitude térmica.</p>" +
    "<p><b>Momento 5:</b> Refletir sobre diferenças de umidade em áreas verdes.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\geografia_icon.jpg");

// MATEMÁTICA - PRÁTICA I
adicionarSecaoComBotao(conteudo,
    "MATEMÁTICA - PRÁTICA I",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Grandezas e medidas</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II - 6º série</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Entender as variações do metro (cm, dm, mm, entre outras).</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Compreender e utilizar unidades de medida</li>" +
    "<li>Desenvolver a habilidade de medir e calcular distâncias</li>" +
    "<li>Utilizar a tecnologia para coletar dados e realizar medições</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF02MA16) Estimar, medir e comparar comprimentos utilizando unidades de medida padronizadas (metro, centímetro e milímetro).</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Dividir os alunos em grupos e inserir a função 1 no Botinho.</p>" +
    "<p><b>Momento 2:</b> Medir a distância percorrida pelo robô com régua, explorando unidades como cm, dm, mm.</p>" +
    "<p><b>Momento 3:</b> Aprender a converter entre unidades no sistema métrico decimal.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\matematica_icon.jpg");

// MATEMÁTICA - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "MATEMÁTICA - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Grandezas e medidas</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II - 6º série</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Desenvolver a capacidade de classificar diferentes tipos de ângulos (agudo, reto, obtuso, raso).</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Identificação de ângulos</li>" +
    "<li>Medição de ângulos</li>" +
    "<li>Uso de instrumentos de medição</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF06MA25) Reconhecer a abertura do ângulo como grandeza associada às figuras geométricas.</li>" +
    "<li>(EF06MA26) Resolver problemas que envolvam a noção de ângulo em diferentes contextos.</li>" +
    "<li>(EF06MA27) Determinar medidas da abertura de ângulos, por meio de transferidor e/ou tecnologias digitais.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Distribuir alunos em grupos e inserir a função 4 no Botinho (movimento de 90° sentido horário).</p>" +
    "<p><b>Momento 2:</b> Medir com esquadro e classificar ângulos (raso se <90°, reto se =90°).</p>" +
    "<p><b>Momento 3:</b> Repetir com função 5 (sentido anti-horário).</p>" +
    "</body></html>",
    "src\\resources\\imagens\\matematica_icon.jpg");

// MATEMÁTICA - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "MATEMÁTICA - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Grandezas e medidas</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II - 6º série</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Medir e classificar os tipos de ângulos existentes.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Identificação de ângulos</li>" +
    "<li>Medição de ângulos</li>" +
    "<li>Uso de instrumentos de medição</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF06MA25) Reconhecer a abertura do ângulo como grandeza associada às figuras geométricas.</li>" +
    "<li>(EF06MA26) Resolver problemas que envolvam a noção de ângulo em diferentes contextos.</li>" +
    "<li>(EF06MA27) Determinar medidas da abertura de ângulos, por meio de transferidor e/ou tecnologias digitais.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Dividir alunos em grupos e inserir a função 6 no Botinho (rotação de 180° sentido horário).</p>" +
    "<p><b>Momento 2:</b> Medir com transferidor e verificar ângulo formado.</p>" +
    "<p><b>Momento 3:</b> Classificar ângulo (raso se =180°).</p>" +
    "</body></html>",
    "src\\resources\\imagens\\matematica_icon.jpg");

// MATEMÁTICA - PRÁTICA IV
adicionarSecaoComBotao(conteudo,
    "MATEMÁTICA - PRÁTICA IV",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Grandezas e medidas</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>Ensino Fundamental II - 9º série</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Desenvolver habilidades práticas de medição, cálculo e interpretação de dados ambientais.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Compreensão e aplicação de razão e proporção</li>" +
    "<li>Conversão de unidades</li>" +
    "<li>Multiplicação e divisão de grandezas</li>" +
    "<li>Uso de fórmulas matemáticas</li>" +
    "<li>Compreensão das propriedades da água e do ar</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF02MA17) Estimar, medir e comparar capacidade e massa, utilizando unidades padronizadas.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Distribuir alunos em grupos.</p>" +
    "<p><b>Momento 2:</b> Medir dimensões da sala com trena para calcular área.</p>" +
    "<p><b>Momento 3:</b> Aplicar fórmula para cálculo da área.</p>" +
    "<p><b>Momento 4:</b> Inserir função 10 no Botinho para medir umidade relativa do ar.</p>" +
    "<p><b>Momento 5:</b> Calcular quantidade de água no ar usando densidade de umidade e volume da sala.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\matematica_icon.jpg");

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
    
    // Ajuste crítico para o tamanho do texto
    txtDescricao.setPreferredSize(new Dimension(600, 1)); // Altura inicial mínima
    txtDescricao.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
    
    // Forçar o JEditorPane a calcular seu tamanho preferido corretamente
    SwingUtilities.invokeLater(() -> {
        int height = txtDescricao.getPreferredSize().height;
        txtDescricao.setPreferredSize(new Dimension(600, height));
    });

    textos.add(lblTitulo, BorderLayout.NORTH);
    textos.add(new JScrollPane(txtDescricao), BorderLayout.CENTER); // Adiciona scroll se necessário

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