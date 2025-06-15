package src.main;
public class Usuario {
    private String nome;
    private String email;
    private String senha; 

    // Construtor padrão necessário para o Jackson
    public Usuario() {
    }

    // Construtor com argumentos
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
}