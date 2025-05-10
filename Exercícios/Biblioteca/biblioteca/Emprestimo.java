package biblioteca;

public class Emprestimo {
    private String dataEmprestimo;
    private String horaEmprestimo;
    private Livro livro;
    private Usuario usuario;
    private boolean emprestimoRealizado;
    private static int quantidadeEmprestimos;
    
    static {
        quantidadeEmprestimos = 0;
    }

    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Livro livro, Usuario usuario) {
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
        this.emprestimoRealizado = false;
    }

    public static int getQuantidadeEmprestimos() {
        return quantidadeEmprestimos;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }

    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean getEmprestimoRealizado() {
        return emprestimoRealizado;
    }
    
    // Método privado usado apenas dentro da classe;
    private boolean verificarStatusLivro() {
        return this.livro.getEmprestimo();
    }
    
    public void realizarEmprestimo() {
        if (!verificarStatusLivro()) {
            this.livro.setEmprestimo(true);
            this.emprestimoRealizado = true;
            System.out.println("Empréstimo realizado!");
            quantidadeEmprestimos++;
        } else {
            System.out.println("O livro já está emprestado!");
        }
    }
    
    public void imprimirEmprestimo() {
        if (this.emprestimoRealizado) {
            System.out.println("----Informações do Empréstimo----\n");
            System.out.println("Data: " + this.dataEmprestimo);
            System.out.println("Hora: " + this.horaEmprestimo);
            System.out.println("Livro: " + this.livro.getTitulo());
            System.out.println("Nome: " + this.usuario.getNome());
        } else {
            System.out.println("Empréstimo não realizado!");
        }
    }
    
    public void devolverLivro() {
        if (this.emprestimoRealizado) {
            this.livro.setEmprestimo(false);
            this.emprestimoRealizado = false;
            System.out.println("Empréstimo finalizado! Livro devolvido!");
            quantidadeEmprestimos--;
        } else {
            System.out.println("O empréstimo não foi realizado!");
        }
    }
}
