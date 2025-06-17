package src.main;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class InicioConsole {
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarMenuConsole(); // Método que controla o menu no console
    }

    // Método que inicia o menu no console
    public static void iniciarMenuConsole() {
        while (true) {
            System.out.println("\n=== MENU CONSOLE ===");
            System.out.println("Seja bem-vindo(a)!");
            System.out.println("Aqui você pode ter acesso a todos os recursos necessários para usar seu robô didático! O que deseja fazer?");
            System.out.println("");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Salvar cadastro do usuário");
            System.out.println("3 - Abrir interface gráfica");
            System.out.println("4 - Mostrar usuários cadastrados");
            System.out.println("5 - Sair do programa");
            System.out.print("Escolha uma opção: ");

            // Lê a opção do usuário
            // Trata exceções para garantir que o usuário digite um número válido
            try {
                int opcao = Integer.parseInt(scanner.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.println("Iniciando cadastro de usuário...");
                        cadastrarUsuario();
                        break;
                    case 2:
                        System.out.println("Salvando cadastro do usuário...");
                        salvarUsuariosEmJson();
                        break;
                    case 3:
                        System.out.println("Abrindo interface gráfica...");
                        TelaLogin.iniciar();
                        break;
                    case 4:
                        System.out.println("Mostrando usuários cadastrados...");
                        mostrarUsuarios();
                        break;  
                    case 5:
                        System.out.println("Saindo do programa...");
                        System.out.println("Obrigado por usar o Botinho!");
                        System.exit(0);


                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números!");
            }
        }
    }

    // Método que exibe os usuários cadastrados no console
    public static void mostrarUsuarios() {
        if(listaUsuarios == null) {
            System.out.println("A lista de usuários é NULL");
            return;
        }
        
        System.out.println("\n📋 Usuários na lista (" + listaUsuarios.size() + "):");
        for(int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println((i+1) + ". " + listaUsuarios.get(i).toString());
        }
    }

    // Método que cadastra um novo usuário
    public static void cadastrarUsuario() {
    System.out.print("Digite o nome: ");
    String nome = scanner.nextLine();
    
    System.out.print("Digite o email: ");
    String email = scanner.nextLine();

    System.out.print("Digite a senha: ");
    String senha = scanner.nextLine();

    // Validação simples
    if (nome.isEmpty() || !email.contains("@")) {
        System.out.println("Dados inválidos! Nome não pode ser vazio e email deve conter '@'.");
        return;
    }

    Usuario novoUsuario = new Usuario(nome, email, senha);
    listaUsuarios.add(novoUsuario);
    System.out.println("✅ Usuário cadastrado!");
    }

// Método que salva a lista de usuários em um arquivo JSON
    public static void salvarUsuariosEmJson() {
    mostrarUsuarios(); // Mostra o conteúdo atual antes de salvar
    
    if(listaUsuarios == null || listaUsuarios.isEmpty()) {
        System.out.println("⚠️ Lista de usuários vazia - nada para salvar");
        return;
    }

    try {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        File arquivo = new File("src/resources/data/Usuario.json");
        
        // 1. Verifica se o arquivo já existe e tem conteúdo
        if(arquivo.exists() && arquivo.length() > 0) {
            // 2. Carrega os usuários existentes
            List<Usuario> usuariosExistentes = mapper.readValue(arquivo, 
                new TypeReference<List<Usuario>>(){});
            
            // 3. Filtra para adicionar apenas usuários novos
            for(Usuario novoUsuario : listaUsuarios) {
                boolean usuarioJaExiste = usuariosExistentes.stream()
                    .anyMatch(u -> 
                        u.getEmail().equalsIgnoreCase(novoUsuario.getEmail()) &&
                        u.getNome().equalsIgnoreCase(novoUsuario.getNome()));
                
                if(!usuarioJaExiste) {
                    usuariosExistentes.add(novoUsuario);
                } else {
                    System.out.println("Usuário " + novoUsuario.getNome() + 
                        " já existe - não será adicionado novamente");
                }
            }
            
            // 4. Atualiza a lista para salvar
            listaUsuarios = usuariosExistentes;
        }
        
        // 5. Salva a lista consolidada
        mapper.writeValue(arquivo, listaUsuarios);
        
        System.out.println("\n✅ " + listaUsuarios.size() + 
            " usuários salvos em: " + arquivo.getAbsolutePath());
    } catch (Exception e) {
        System.err.println("\n❌ Erro ao salvar: " + e.getMessage());
        e.printStackTrace();
    }
}
}