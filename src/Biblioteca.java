import java.awt.*;
import java.util.ArrayList;


public class Biblioteca {
    private ArrayList<Livro> listaDeLivros = new ArrayList<>();


    public void mostrarlivros() {
        for (Livro livro : listaDeLivros) {
            livro.mostrarInformacoes();
        }
    }

    public void adicionarLivros(Livro livroAdicionado) {
        listaDeLivros.add(livroAdicionado);
    }

    public Livro buscarLivro(String tituloProcurado) {
        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloProcurado)) {
                return livro;
            }
        }
        return null;
    }
}

