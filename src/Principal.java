import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Livro livro1 = new Livro("One piece", "Eichiro oda", 1899);
        Livro livro2 = new Livro("Tio patinhas", "Carl Barks", 1947);
        Livro livro3 = new Livro("Turma da monica", "Mauricio de souza", 1963);


        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        int opcao = 0;
        while (opcao != 7) {
            System.out.println("=====BIBLIOTECA====");
            System.out.println("1 - Buscar livro");
            System.out.println("2 - Mostrar todos os livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Cadastrar livrto");
            System.out.println("6 - Remover livro");
            System.out.println("7 - Sair");


            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Digite o nome do livro: ");
                    String livroProcurado = scanner.nextLine().trim();

                    Livro livroEncontrado = biblioteca.buscarLivro(livroProcurado);

                    if (livroEncontrado != null) {
                        livroEncontrado.mostrarInformacoes();
                        System.out.println("Livro encontrado");
                    } else {
                        System.out.println("Livro nao encontrado");
                    }

                    break;
                //
                case 2:
                    biblioteca.mostrarLivros();
                    break;
                //
                case 3:
                    System.out.print("Digite o nome do livro: ");
                    String livroEmprestar = scanner.nextLine().trim();

                    Livro livroEmprestado = biblioteca.buscarLivro(livroEmprestar);

                    if (livroEmprestado!= null) {
                        livroEmprestado.emprestar();
                    } else {
                        System.out.println("Livro não encontrado!");
                    }

                    break;
                case 4:
                    System.out.print("Digite o nome do livro: ");
                    String livroDevolvido = scanner.nextLine().trim();

                    Livro livroParaDevolver = biblioteca.buscarLivro(livroDevolvido);

                    if (livroParaDevolver != null) {
                        livroParaDevolver.devolver();
                    } else {
                        System.out.println("Livro não encontrado!");
                    }

                    break;
                //
                case 5:
                    System.out.println("Digite o nome do livro para o cadastro");
                    String tituloDigitado = scanner.nextLine().trim();

                    System.out.println("Digite o autor para cadastro");
                    String autorDigitado = scanner.nextLine().trim();

                    System.out.println("Digite o ano para cadastro");
                    Integer anoDigitado = scanner.nextInt();
                    scanner.nextLine();

                    Livro novoLivro = new Livro(tituloDigitado, autorDigitado, anoDigitado);

                    boolean livroCadastrado = biblioteca.adicionarLivro(novoLivro);

                    if (livroCadastrado) {
                        System.out.println("Livro cadastrado com sucesso!!!");
                    } else {
                        System.out.println("Este livro já está cadastrado na sua biblioteca.");
                    }

                    break;
                //
                case 6:
                    System.out.print("Digite o nome do livro: ");
                    String livroRemover = scanner.nextLine().trim();

                    boolean removido = biblioteca.removerLivro(livroRemover);

                    if (removido) {
                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado!");
                    }

                    break;
                //
                case 7:
                    System.out.println("Saindo da biblioteca...");
                    break;
            }
        }
    }
}


