# PROJETO_A3

## Descrição

Trabalho desenvolvido para a avaliação A3 da UC - Programação de Soluções Computacionais, do curso de Sistemas de Informação da Faculdade UNABetim.

Este repositório contém uma versão digital interativa do manual didático do robô Botinho, desenvolvido pela equipe STARBOTS (#16055). O projeto transforma as práticas pedagógicas descritas no manual em uma experiência virtual, permitindo que educadores explorem as atividades de Ciências, Geografia e Matemática de forma dinâmica.

## Estrutura de Pastas

```
│   Settings.json
│
├───lib
│       jackson-annotations-2.15.0.jar
│       jackson-core-2.15.0.jar
│       jackson-databind-2.15.0.jar
│
└───src
    ├───main
    │   │   InicioConsole.java
    │   │   MenuPrincipal.java
    │   │   TelaInicial.java
    │   │   TelaLogin.java
    │   │   Usuario.java
    │   │   UsuarioService.java
    │   │
    │   └───abas
    │           ConhecaORobo.java
    │           Inicio.java
    │           Padrao.java
    │           PraticasEFI.java
    │           PraticasEFII.java
    │           PraticasEM.java
    │           QuemSomos.java
    │
    └───resources
        ├───data
        │       Usuario.json
        │
        └───imagens
                button_welcome.png
                logo_botinho_funoroxo.png
```

## Tecnologias Utilizadas

- **Java** (Swing para interface gráfica)
- **Jackson** (para manipulação de JSON)
- **JSON** (persistência dos dados de usuário)

## Como Executar

1. **Compile os arquivos Java:**
   ```
   javac -cp "lib/*" -d bin src/main/*.java src/main/abas/*.java
   ```

2. **Execute a aplicação:**
   ```
   java -cp "bin;lib/*;src/resources" TelaLogin
   ```

3. **Pré-requisitos:**
   - Java 8 ou superior instalado
   - Bibliotecas Jackson na pasta `lib`

## Observações

- Os dados dos usuários estão em `src/resources/data/Usuario.json`.
- Imagens usadas pela interface estão em `src/resources/imagens/`.
- Para adicionar novos usuários, edite o arquivo JSON manualmente ou implemente uma tela de cadastro.

---