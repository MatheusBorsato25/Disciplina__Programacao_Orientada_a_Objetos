package biblioteca;

public class Usuario {
    
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;
    private static int usuariosCadastrados;
    
    static {
        usuariosCadastrados = 0;
    }
    
    public static int getUsuariosCadastrados() {
        return usuariosCadastrados;
    }
    
    public Usuario(String nome, int idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        usuariosCadastrados++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void lerLivro(Livro livro) {
        System.out.println(this.nome + " está lendo o livro " + livro.getTitulo() + ".");
    }
    
    public void exibeUsuario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Telefone: " + this.telefone);
    }
}
