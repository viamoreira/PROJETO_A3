package src.main;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;


public class InicioConsole {
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarMenuConsole(); // Método que controla o menu no console
    }

    public static void iniciarMenuConsole() {
        while (true) {
            System.out.println("\n=== MENU CONSOLE ===");
            System.out.println("Seja bem-vindo(a)!");
            System.out.println("Aqui você pode ter acesso a todos os recursos necessários para usar seu robô didático! O que deseja fazer?");
            System.out.println("");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Salvar cadastro do usuário");
            System.out.println("3 - Abrir interface gráfica");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

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

    // Métodos auxiliares (adicione esses dentro da classe AppPrincipal)
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

    public static void salvarUsuariosEmJson() {
    try {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("Usuario.json"), listaUsuarios);
        System.out.println("✅ Dados salvos em 'usuarios.json'!");
    } catch (Exception e) {
        System.out.println("❌ Erro ao salvar: " + e.getMessage());
    }
 }
}