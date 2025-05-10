package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        // Criação dos livros
        Livro livro1 = new Livro("Java para Iniciantes", "João Silva", "Programação", "DIN", 2020, 1, 350);
        Livro livro2 = new Livro("Banco de Dados Avançado", "Maria Lima", "Banco de Dados", "ABC", 2019, 2, 420);

        // Criação dos usuários
        Usuario usuario1 = new Usuario("Matheus", 19, "Masculino", "99999-0000");
        Usuario usuario2 = new Usuario("Ana", 30, "Feminino", "98888-7654");

        // Exibe informações dos livros e dos usuários
        livro1.exibeFicha();
        System.out.println();
        livro2.exibeFicha();
        System.out.println();
        usuario1.exibeUsuario();
        System.out.println();
        usuario2.exibeUsuario();
        System.out.println();

        // Realiza um empréstimo com sucesso
        Emprestimo e1 = new Emprestimo("25/05/2025", "16:00", livro1, usuario1);
        e1.realizarEmprestimo();
        e1.imprimirEmprestimo();
        System.out.println();

        // Ações através da classe Empréstimo
        e1.getLivro().abreLivro(); 
        e1.getUsuario().lerLivro(livro1);   
        e1.getLivro().fechaLivro(); 
        System.out.println();

        // Tenta realizar empréstimo de um livro já emprestado (erro esperado)
        Emprestimo e2 = new Emprestimo("10/05/2025", "14:30", livro1, usuario2);
        e2.realizarEmprestimo(); 
        e2.imprimirEmprestimo();
        e2.devolverLivro();
        System.out.println();

        // Devolve o livro1
        e1.devolverLivro();
        System.out.println();

        // Agora o empréstimo e2 pode ser realizado
        e2.realizarEmprestimo(); 
        e2.imprimirEmprestimo();
        System.out.println();

        // Ações através da classe Emprestimo
        e2.getLivro().abreLivro();
        e2.getUsuario().lerLivro(livro1);
        e2.getLivro().fechaLivro();
        System.out.println();
        
        // Verifica o status do livro2
        livro2.verificaEmprestimo();
        System.out.println();
        
        Emprestimo e3 = new Emprestimo("17/09/2025", "20:00", livro2, usuario1);
        e3.realizarEmprestimo();
        e3.imprimirEmprestimo();
        System.out.println();
        
        // Verifica o novo status do livro2
        livro2.verificaEmprestimo();
        System.out.println();
        
        // Estatísticas finais
        System.out.println("Total de livros cadastrados: " + Livro.getNumeroLivros());
        System.out.println("Total de usuários cadastrados: " + Usuario.getUsuariosCadastrados());
        System.out.println("Total de empréstimos ativos: " + Emprestimo.getQuantidadeEmprestimos()); 
        System.out.println();
    }
}
