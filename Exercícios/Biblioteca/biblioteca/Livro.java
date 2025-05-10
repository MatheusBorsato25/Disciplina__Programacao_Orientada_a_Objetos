package biblioteca;

public class Livro {
    
    private String titulo;
    private String autores;
    private String area;
    private String editora;
    private int ano;
    private int edicao;
    private int numeroFolhas;
    private boolean emprestimo;
    private static int numeroLivros;
    
    static {
        numeroLivros = 0;    
    }
    
    public Livro(String titulo, String autores, String area, String editora, int ano, int edicao, int numeroFolhas) {
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroFolhas = numeroFolhas;
        this.emprestimo = false;
        numeroLivros ++;
    }
    
    public static int getNumeroLivros(){
        return numeroLivros;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }

    public boolean getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void abreLivro() {
        System.out.println("Livro Aberto!");
    }
    
    public void fechaLivro() {
        System.out.println("Livro Fechado!");
    }
    
    public void verificaEmprestimo() {
        if (this.emprestimo){
            System.out.println("O livro está emprestado!");
        } else {
            System.out.println("O livro não está emprestado!");
        }
    }
    
    public void exibeFicha() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor(es): " + this.autores);
        System.out.println("Área: " + this.area);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano: " + this.ano);
        System.out.println("Edição: " + this.edicao);
        System.out.println("Número de folhas: " + this.numeroFolhas);
    }
}
