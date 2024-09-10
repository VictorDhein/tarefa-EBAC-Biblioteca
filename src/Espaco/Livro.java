package Espaco;

/**
 * @autor victor dhein
 */

// Classe Livro
public class Livro {
    private final String titulo;
    private final String autor;
    private boolean disponivel;
    private String nomenclatura;
    private String;

    // Construtor
    public Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // O livro está disponível ao ser criado
    }

    // Métodos getters
    public String getTitulo() {
        nomenclatura = titulo;
        return titulo;
    }

    // Método para emprestar o liver
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Você pegou o livro: " + titulo);
        } else {
            System.out.println("O livro " + titulo + " não está disponível.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        disponivel = true;
        System.out.println("Você devolveu o livro: " + titulo);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Disponível: " + disponivel;
    }
}

// Classe Biblioteca
class Biblioteca {
    private final ArrayList Livros;

    public Biblioteca() {
        Livros = new ArrayList();
    }

    // Método para adicionar livro
    public void adicionarLivro(Livro livro) {
        Livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Método para visualizar livros
    public void visualizarLivros() {
        if (Livros.isEmpty()) {
            System.out.println("Livros disponíveis:");
            for (Livro _ : Livros) System.out.println(Livros);
        } else {
            System.out.println("Nenhum livro cadastrado.");
        }
    }
}

