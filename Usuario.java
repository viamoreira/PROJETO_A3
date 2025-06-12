public class Usuario {
    private String nome;
    private String email; // Adicione mais atributos se necessário

    // Construtor
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters (obrigatórios para o JSON)
    public String getNome() { return nome; }
    public String getEmail() { return email; }
}
