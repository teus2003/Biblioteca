public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Este livro já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            this.disponivel = true;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Este livro já está disponível.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        if (disponivel) {
            System.out.println("Disponivel: Sim");
        } else {
            System.out.println("Disponivel: Nao");
        }
    }
}


