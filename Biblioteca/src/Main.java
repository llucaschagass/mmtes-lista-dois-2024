import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("As Cronicas de Gelo e Fogo: A Guerra dos Tronos");
        livro1.setAutor("George R. R. Martin");
        livro1.setGenero("Fantasia");
        livro1.setPaginas(600);

        Livro livro2 = new Livro();
        livro2.setTitulo("Senhor dos Anéis: A Sociedade do Anel");
        livro2.setAutor("J.R.R. Tolkien");
        livro2.setGenero("Fantasia");
        livro2.setPaginas(576);

        Livro livro3 = new Livro();
        livro3.setTitulo("O Menino do Pijama Listrado");
        livro3.setAutor("John Boyne");
        livro3.setGenero("Ficção Histórica");
        livro3.setPaginas(215);

        Livro livro4 = new Livro();
        livro4.setTitulo("Percy Jackson e o Ladrão de Raios");
        livro4.setAutor("Rick Riordan");
        livro4.setGenero("Fantasia");
        livro4.setPaginas(375);

        Livro livro5 = new Livro();
        livro5.setTitulo("Harry Potter e o Cálice de Fogo");
        livro5.setAutor("J.K. Rowling");
        livro5.setGenero("Fantasia");
        livro5.setPaginas(640);

        System.out.println("Selecione um livro do nosso acervo: ");
        System.out.println("1 - " + livro1.getTitulo());
        System.out.println("2 - " + livro2.getTitulo());
        System.out.println("3 - " + livro3.getTitulo());
        System.out.println("4 - " + livro4.getTitulo());
        System.out.println("5 - " + livro5.getTitulo());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao livro desejado:");
        int livroEscolhido = scanner.nextInt();


        switch (livroEscolhido) {
            case 1:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro1.getTitulo());
                System.out.println("Autor: " + livro1.getAutor());
                System.out.println("Gênero: " + livro1.getGenero());
                System.out.println("Quantidade de páginas: " + livro1.getPaginas());
                break;
            case 2:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro2.getTitulo());
                System.out.println("Autor: " + livro2.getAutor());
                System.out.println("Gênero: " + livro2.getGenero());
                System.out.println("Quantidade de páginas: " + livro2.getPaginas());
                break;
            case 3:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro3.getTitulo());
                System.out.println("Autor: " + livro3.getAutor());
                System.out.println("Gênero: " + livro3.getGenero());
                System.out.println("Quantidade de páginas: " + livro3.getPaginas());
                break;
            case 4:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro4.getTitulo());
                System.out.println("Autor: " + livro4.getAutor());
                System.out.println("Gênero: " + livro4.getGenero());
                System.out.println("Quantidade de páginas: " + livro4.getPaginas());
                break;
            case 5:
                System.out.println("Dados do livro:");
                System.out.println("Título: " + livro5.getTitulo());
                System.out.println("Autor: " + livro5.getAutor());
                System.out.println("Gênero: " + livro5.getGenero());
                System.out.println("Quantidade de páginas: " + livro5.getPaginas());
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}