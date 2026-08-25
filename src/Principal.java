import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Livro livro1 = new Livro("One piece", "Eichiro oda", 1899);
        Livro livro2 = new Livro("Tio patinhas", "Carl Barks", 1947);
        Livro livro3 = new Livro("Turma da monica", "Mauricio de souza", 1963);
        boolean encontrado = false;

        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);

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

            encontrado = false;

            switch (opcao) {
                case 1:

                    System.out.print("Digite o nome do livro");
                    String livroProcurado = scanner.nextLine().trim();


                    for (Livro livro : listaDeLivros) {

                        if (livro.getTitulo().equalsIgnoreCase(livroProcurado)) {
                            livro.mostrarInformacoes();
                            System.out.println("Livro encontrado");
                            encontrado = true;
                        }


                    }
                    if (!encontrado) {
                        System.out.println("Livro nao encontrado");
                    }
                    break;
                //
                case 2:
                    for (Livro livro : listaDeLivros) {
                        livro.mostrarInformacoes();
                    }
                    break;
                //
                case 3:
                    System.out.print("Digite o nome do livro");
                    String livroEmprestar = scanner.nextLine().trim();
                    for (Livro livro : listaDeLivros) {
                        if (livro.getTitulo().equalsIgnoreCase(livroEmprestar)) {
                            livro.emprestar();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Livro não encontrado!");

                    }
                    //
                    break;
                case 4:

                    System.out.println("Digite o nome do livro");
                    String livroDevolvido = scanner.nextLine().trim();
                    for (Livro livro : listaDeLivros) {
                        if (livro.getTitulo().equalsIgnoreCase(livroDevolvido)) {
                            livro.devolver();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Livro nao encontrado");
                    }
                    break;
                //
                case 5:
                    System.out.println("Digite o nome do livro para o cadastro");
                    String tituloDigitado = scanner.nextLine().trim();
                    System.out.println("Digite o autor para cadastro");
                    String AutorDigitado = scanner.nextLine().trim();
                    System.out.println("Digite o ano para cadastro");
                    Integer anoDigitado = scanner.nextInt();
                    scanner.nextLine();
                    Livro novoLivro = new Livro(tituloDigitado, AutorDigitado, anoDigitado);
                    listaDeLivros.add(novoLivro);
                    System.out.println("Livro Cadastrado com sucesso!!!");
                    break;
                //

                case 6:
                    System.out.print("Digite o nome do livro");
                    String livroDigitado = scanner.nextLine().trim();
                    Livro livroRemovido = null;
                    for (Livro livro : listaDeLivros) {
                        if (livro.getTitulo().equalsIgnoreCase(livroDigitado)) {
                            encontrado = true;
                            livroRemovido = livro;
                            System.out.println("livro removido com sucesso!");
                        }
                    }
                    listaDeLivros.remove(livroRemovido);
                    if (!encontrado) {
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


