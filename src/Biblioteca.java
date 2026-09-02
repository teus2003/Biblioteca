import java.util.ArrayList;


public class Biblioteca {
    private ArrayList<Livro> listaDeLivros = new ArrayList<>();


    public void mostrarLivros() {
        for (Livro livro : listaDeLivros) {
            livro.mostrarInformacoes();
        }
    }

    public boolean adicionarLivro(Livro livroAdicionado) {
        Livro livroExistente = buscarLivro(livroAdicionado.getTitulo());
        if (livroExistente == null) {
            listaDeLivros.add(livroAdicionado);
            return true;

        } else {

        }


        return false;
    }

    public Livro buscarLivro(String tituloProcurado) {
        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloProcurado)) {
                return livro;
            }
        }
        return null;
    }

    public boolean removerLivro(String tituloRemovido) {
        Livro removerEstelivro;
        removerEstelivro = buscarLivro(tituloRemovido);
        if (removerEstelivro != null) {
            listaDeLivros.remove(removerEstelivro);
            System.out.println("Livro removido com sucesso!!");
            return true;
        } else {
            System.out.println("Livro nao encontrado!!");
            return false;
        }
    }
}

