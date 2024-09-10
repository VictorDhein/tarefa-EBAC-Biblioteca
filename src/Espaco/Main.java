package Espaco;

// Classe principal
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("A Revolução dos Bichos", "George Orwell");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Visualizando livros
        biblioteca.visualizarLivros();

        // Emprestando um livro
        livro1.emprestar();
        biblioteca.visualizarLivros();

        // Devolvendo o livro
        livro1.devolver();
        biblioteca.visualizarLivros();
    }
}
