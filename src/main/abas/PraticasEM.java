package src.main.abas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class PraticasEM extends JPanel {
    private Map<String, Boolean> secoesLidas = new HashMap<>();
    private JProgressBar progressBar;
    private JLabel lblProgresso;
    private boolean progressoCompleto = false;
    private Timer timerProgresso;
    private JScrollPane scrollPane;

    public PraticasEM() {
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

       // BIOLOGIA - PRÁTICA I
adicionarSecaoComBotao(conteudo, 
    "BIOLOGIA - PRÁTICA I",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade Temática:</h3>" +
    "<p>Vida e Evolução - Ecologia e Sustentabilidade.</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>1ª Série do Ensino Médio</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Analisar a influência da umidade relativa do ar sobre os organismos vivos e os ambientes urbanos e naturais, considerando a saúde humana e a qualidade do ar.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Fatores abióticos e ecossistemas</li>" +
    "<li>Relação entre clima e saúde</li>" +
    "<li>Poluição e qualidade ambiental</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT201) Analisar os impactos da ação humana sobre os ciclos naturais e propor medidas para a preservação do ambiente.</li>" +
    "<li>(EM13CNT103) Relacionar os fatores ambientais às adaptações dos organismos.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Introdução teórica sobre doenças respiratórias relacionadas à baixa umidade e impactos sobre a vegetação.</p>" +
    "<p><b>Momento 2:</b> Coleta de dados com o Botinho (função 10) em diferentes pontos da escola.</p>" +
    "<p><b>Momento 3:</b> Análise e discussão sobre relação entre umidade e vegetação, efeitos nos seres vivos e estratégias para melhorar ambientes urbanos.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\ciencia_icon.jpg");

// BIOLOGIA - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "BIOLOGIA - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Vida e Evolução / Ecologia</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>1ª ou 2ª Série do Ensino Médio</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Investigar a influência da intensidade luminosa sobre o processo de fotossíntese e desenvolvimento vegetal.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Fotossíntese</li>" +
    "<li>Cadeia alimentar e produtividade dos ecossistemas</li>" +
    "<li>Fatores abióticos</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT205) Analisar os fatores que influenciam o processo fotossintético e sua importância ecológica.</li>" +
    "<li>(EM13CNT204) Explicar a interdependência entre os seres vivos e os fatores abióticos.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Introdução sobre curva de saturação da luz na fotossíntese e apresentação do Botinho (função 12).</p>" +
    "<p><b>Momento 2:</b> Medição de luminosidade em diferentes locais.</p>" +
    "<p><b>Momento 3:</b> Relacionar dados com tipo de vegetação, formular hipóteses e discutir impactos da variação de luz.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\ciencia_icon.jpg");

// BIOLOGIA - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "BIOLOGIA - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade Temática:</h3>" +
    "<p>Vida e Evolução / Corpo humano</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>2ª Série do Ensino Médio</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Analisar como a temperatura do ambiente interfere na homeostase dos seres vivos e nas estratégias de adaptação e regulação térmica.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Homeostase e termorregulação</li>" +
    "<li>Adaptações fisiológicas e comportamentais</li>" +
    "<li>Impactos das mudanças climáticas</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT104) Discutir os mecanismos de homeostase em organismos vivos.</li>" +
    "<li>(EM13CNT207) Avaliar os impactos das mudanças ambientais nos organismos.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Revisão dos conceitos de homeostase e exemplos de regulação térmica.</p>" +
    "<p><b>Momento 2:</b> Medição com o Botinho (função 11) em diferentes locais e horários.</p>" +
    "<p><b>Momento 3:</b> Análise dos dados e discussão sobre adaptações, interferência no metabolismo e efeitos das mudanças climáticas.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\ciencia_icon.jpg");

// FÍSICA - PRÁTICA I
adicionarSecaoComBotao(conteudo,
    "FÍSICA - PRÁTICA I",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade Temática:</h3>" +
    "<p>Movimento, repouso e referência</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>1ª série do Ensino Médio</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Compreender os conceitos de movimento, repouso, deslocamento e trajetória e calcular velocidade média.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Movimento e repouso</li>" +
    "<li>Trajetória e deslocamento</li>" +
    "<li>Tempo e velocidade média</li>" +
    "<li>Referencial</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT101) Discutir e compreender conceitos e fenômenos físicos como movimento, velocidade, deslocamento e referencial.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Introdução aos conceitos de referencial, movimento e repouso.</p>" +
    "<p><b>Momento 2:</b> Preparação de pista com marcas de referência.</p>" +
    "<p><b>Momento 3:</b> Coleta de dados do movimento do robô (funções 2, 3, 4, 5, 12) para cálculo de velocidade média.</p>" +
    "<p><b>Momento 4:</b> Discussão sobre referencial e variações na velocidade.</p>" +
    "<p><b>Momento 5:</b> Compartilhamento de cálculos e conclusões.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\fisica_icon.jpg");

// FÍSICA - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "FÍSICA - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade Temática:</h3>" +
    "<p>Leis de Newton e suas aplicações</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>2ª Série do Ensino Médio</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Compreender as três Leis de Newton e observar como as forças interferem no movimento.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Leis de Newton (Inércia, Dinâmica e Ação e Reação)</li>" +
    "<li>Força, movimento e equilíbrio</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT103) Compreender conceitos de força, movimento, interação e equilíbrio.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Apresentação das Leis de Newton com exemplos do cotidiano.</p>" +
    "<p><b>Momento 2:</b> Demonstração da 1ª Lei (Inércia) com robô seguindo linha (função 1) e superfície com atrito.</p>" +
    "<p><b>Momento 3:</b> Demonstração da 2ª Lei (Dinâmica) com pesos adicionais no robô.</p>" +
    "<p><b>Momento 4:</b> Demonstração da 3ª Lei (Ação e Reação) com robô puxando objeto leve.</p>" +
    "<p><b>Momento 5:</b> Discussão sobre aplicações das leis em situações reais.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\fisica_icon.jpg");

// FÍSICA - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "FÍSICA - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade Temática:</h3>" +
    "<p>Estudo da Energia</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>3ª Série do Ensino Médio</p>" +
    "<h3>Objetivo da aula:</h3>" +
    "<p>Compreender o conceito de energia mecânica e suas formas (cinética e potencial).</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Energia cinética</li>" +
    "<li>Energia potencial gravitacional</li>" +
    "<li>Conservação e transformação de energia</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT104) Analisar transformações de energia em diferentes processos físicos.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Revisão dos conceitos de energia cinética e potencial.</p>" +
    "<p><b>Momento 2:</b> Simulação 1 - Energia Cinética com robô em movimento (função 2).</p>" +
    "<p><b>Momento 3:</b> Simulação 2 - Energia Potencial em rampa com transformação em cinética.</p>" +
    "<p><b>Momento 4:</b> Simulação 3 - Conservação de Energia com obstáculos leves.</p>" +
    "<p><b>Momento 5:</b> Discussão sobre aplicações em situações cotidianas.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\fisica_icon.jpg");

// GEOGRAFIA - PRÁTICA I
adicionarSecaoComBotao(conteudo,
    "GEOGRAFIA - PRÁTICA I",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Cartografia</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>1ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Compreender e identificar como é possível se localizar por meio das coordenadas geográficas (latitude e longitude).</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Latitude</li>" +
    "<li>Longitude</li>" +
    "<li>Coordenadas geográficas</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CHS106) Utilizar linguagens cartográficas de forma crítica e reflexiva.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Divisão em grupos e uso das funções 13 e 14 no Botinho para medir rotação.</p>" +
    "<p><b>Momento 2:</b> Configuração do robô com frente voltada para o norte (eixo y).</p>" +
    "<p><b>Momento 3:</b> Movimentação do robô para pontos A, B, C e D.</p>" +
    "<p><b>Momento 4:</b> Identificação de ângulos e hemisférios.</p>" +
    "<p><b>Momento 5:</b> Preenchimento de tabela com coordenadas geográficas.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\fisica_icon.jpg");

// GEOGRAFIA - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "GEOGRAFIA - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Elementos do clima</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>2ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Identificar as possíveis mudanças nos fatores que interferem no tempo.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Umidade relativa do ar</li>" +
    "<li>Temperatura</li>" +
    "<li>Amplitude térmica</li>" +
    "<li>Fatores do tempo</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CHS304) Analisar os impactos socioambientais decorrentes de práticas humanas.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Divisão em grupos e uso das funções 10 e 11 no Botinho para medições.</p>" +
    "<p><b>Momento 2:</b> Coleta de dados em 10 pontos da escola (áreas com sol e sombra).</p>" +
    "<p><b>Momento 3:</b> Criação de tabela com dados de temperatura e umidade.</p>" +
    "<p><b>Momento 4:</b> Cálculo da amplitude térmica.</p>" +
    "<p><b>Momento 5:</b> Reflexão sobre diferenças encontradas.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\geografia_icon.jpg");

// GEOGRAFIA - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "GEOGRAFIA - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Rosa dos ventos</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>3ª Série Ensino Médio</p>" +
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
    "<li>(EM13CHS106) Utilizar linguagens cartográficas de forma crítica e reflexiva.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Divisão em grupos e uso das funções 2, 4 e 5 no Botinho.</p>" +
    "<p><b>Momento 2:</b> Locomoção do robô sobre folha pré-desenhada.</p>" +
    "<p><b>Momento 3:</b> Identificação de pontos cardeais e colaterais.</p>" +
    "<p><b>Momento 4:</b> Trabalho sobre movimento aparente do sol.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\geografia_icon.jpg");

// MATEMÁTICA - PRÁTICA I
adicionarSecaoComBotao(conteudo,
    "MATEMÁTICA - PRÁTICA I",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Função Afim e Representação Gráfica</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>1ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Confeccionar uma função afim no plano cartesiano, identificando seus coeficientes numéricos.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Identificar que uma função afim pode ser diretamente proporcional</li>" +
    "<li>Desenvolver a habilidade de construção de tabelas e gráficos</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13MAT401) Converter representações algébricas de funções polinomiais de 1º grau em representações geométricas.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Programação do robô para andar em linha reta com velocidade constante.</p>" +
    "<p><b>Momento 2:</b> Medição da distância percorrida em diferentes tempos.</p>" +
    "<p><b>Momento 3:</b> Registro dos dados em tabela.</p>" +
    "<p><b>Momento 4:</b> Criação do gráfico da função (distância × tempo).</p>" +
    "<p><b>Momento 5:</b> Discussão sobre variáveis, coeficientes e equação da função.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\matematica_icon.jpg");

// MATEMÁTICA - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "MATEMÁTICA - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Proporcionalidade e Geometria</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>2ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Identificar que o perímetro de retângulos é proporcional à razão entre os lados e a área ao quadrado da razão.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Áreas de figuras planas, especificamente retângulos</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13MAT201) Participar de ações envolvendo cálculos de perímetro e área.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Preparação do robô com caneta para desenhar.</p>" +
    "<p><b>Momento 2:</b> Programação para desenhar quadrados e retângulos.</p>" +
    "<p><b>Momento 3:</b> Comparação de perímetros e áreas com diferentes dimensões.</p>" +
    "<p><b>Momento 4:</b> Discussão sobre proporcionalidade e razões.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\matematica_icon.jpg");

// MATEMÁTICA - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "MATEMÁTICA - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Geometria Espacial</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>3ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Calcular o volume de um paralelepípedo e relacionar volume e área de sólidos.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Sólidos geométricos (paralelepípedo e cubo)</li>" +
    "<li>Cálculo de volume</li>" +
    "<li>Cálculo da área da base</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13MAT201) Participar de ações envolvendo cálculos de volume.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Montagem de caminho retangular representando base de paralelepípedo.</p>" +
    "<p><b>Momento 2:</b> Simulação do robô subindo 'andares' do sólido.</p>" +
    "<p><b>Momento 3:</b> Cálculo de área da base, volume e capacidade.</p>" +
    "<p><b>Momento 4:</b> Discussão sobre diferença entre área e volume.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\matematica_icon.jpg");

// QUÍMICA - PRÁTICA I
adicionarSecaoComBotao(conteudo,
    "QUÍMICA - PRÁTICA I",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Matéria e Energia</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>1ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Observar e analisar os processos de fusão e evaporação da água, correlacionando variações de temperatura, umidade e luminosidade.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Estados físicos da matéria</li>" +
    "<li>Mudanças de estado físico</li>" +
    "<li>Variáveis ambientais (temperatura, umidade, luz)</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EF09CI01) Investigar as mudanças de estado físico da matéria.</li>" +
    "<li>(EM13CNT101) Analisar transformações e conservações em sistemas.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Introdução teórica sobre estados físicos e mudanças de estado.</p>" +
    "<p><b>Momento 2:</b> Experimento com cubo de gelo e monitoramento com Botinho (funções 10, 11, 16).</p>" +
    "<p><b>Momento 3:</b> Registro de dados durante fusão e evaporação.</p>" +
    "<p><b>Momento 4:</b> Discussão sobre as fases da mudança de estado físico.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\quimica_icon.jpg");

// QUÍMICA - PRÁTICA II
adicionarSecaoComBotao(conteudo,
    "QUÍMICA - PRÁTICA II",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Matéria e Energia/ Vida, Terra e cosmos</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>2ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Investigar a influência da temperatura na velocidade das reações ácido-base.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Reações ácido-base: reação de neutralização</li>" +
    "<li>Cinética química: fatores que afetam a velocidade das reações químicas</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT202X) Analisar as diversas formas de manifestação da vida.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Explicação sobre velocidade das reações químicas.</p>" +
    "<p><b>Momento 2:</b> Experimento com bicarbonato e vinagre em diferentes temperaturas.</p>" +
    "<p><b>Momento 3:</b> Monitoramento com Botinho (funções 11, 12, 2, 7) e cronometragem.</p>" +
    "<p><b>Momento 4:</b> Comparação de tempos e discussão dos resultados.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\quimica_icon.jpg");

// QUÍMICA - PRÁTICA III
adicionarSecaoComBotao(conteudo,
    "QUÍMICA - PRÁTICA III",
    "<html><body style='font-family:Poppins; font-size:14px;'>" +
    "<h3>Unidade temática:</h3>" +
    "<p>Matéria e Energia</p>" +
    "<h3>Ano escolar:</h3>" +
    "<p>3ª Série do Ensino Médio</p>" +
    "<h3>Objetivos da aula:</h3>" +
    "<p>Analisar a volatilidade e a inflamabilidade de compostos orgânicos simples.</p>" +
    "<h3>Conteúdos curriculares:</h3>" +
    "<ul>" +
    "<li>Química Orgânica</li>" +
    "<li>Características e propriedades dos compostos orgânicos</li>" +
    "<li>Hidrocarbonetos: combustíveis tipos, consumo, petróleo</li>" +
    "</ul>" +
    "<h3>Competências em foco:</h3>" +
    "<ul>" +
    "<li>(EM13CNT306) Avaliar os riscos envolvidos em atividades cotidianas.</li>" +
    "<li>(EM13CNT307) Analisar as propriedades específicas dos materiais.</li>" +
    "<li>(EM13CNT309) Analisar questões socioambientais relativas a recursos não renováveis.</li>" +
    "</ul>" +
    "<h3>Desenvolvimento da aula:</h3>" +
    "<p><b>Momento 1:</b> Apresentação teórica sobre compostos orgânicos voláteis.</p>" +
    "<p><b>Momento 2:</b> Experimento controlado com álcool etílico e monitoramento com Botinho (funções 11, 10, 16, 9).</p>" +
    "<p><b>Momento 3:</b> Discussão sobre medidas de segurança e aplicações reais.</p>" +
    "</body></html>",
    "src\\resources\\imagens\\quimica_icon.jpg");

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