import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Universidade universidade = new Universidade("Centro Universitario UNA", "Av. Gov. Valadares, 640");

        Disciplina disciplina1 = new Disciplina("Modelos, Métodos e Técnicas de Engenharia de Software", "Esta disciplina aborda os principais modelos, métodos e técnicas utilizados no desenvolvimento de software, incluindo metodologias ágeis, engenharia de requisitos, design de software, entre outros.");
        Disciplina disciplina2 = new Disciplina("Análise de Dados e Big Data", "Esta disciplina explora os conceitos e técnicas relacionados à análise de grandes volumes de dados, incluindo processamento de dados, mineração de dados, aprendizado de máquina e visualização de dados.");

        // Adiciona as disciplinas à universidade
        universidade.adicionarDisciplina(disciplina1);
        universidade.adicionarDisciplina(disciplina2);

        // Adiciona os alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas Chagas");
        aluno1.setMatricula(6212);
        aluno1.setCurso("Engenharia da Computação");
        aluno1.setSemestre(6);
        aluno1.setSenhaAluno("1234");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Marco Tulio");
        aluno2.setMatricula(6213);
        aluno2.setCurso("Engenharia da Computação");
        aluno2.setSemestre(5);
        aluno2.setSenhaAluno("1234");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Paulo Mateus");
        aluno3.setMatricula(6214);
        aluno3.setCurso("Engenharia da Computação");
        aluno3.setSemestre(5);
        aluno3.setSenhaAluno("1234");

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Daniel Jones");
        aluno4.setMatricula(6215);
        aluno4.setCurso("Engenharia da Computação");
        aluno4.setSemestre(5);
        aluno4.setSenhaAluno("1234");

        Aluno aluno5 = new Aluno();
        aluno5.setNome("Gustavo Rodrigues");
        aluno5.setMatricula(6216);
        aluno5.setCurso("Engenharia da Computação");
        aluno5.setSemestre(5);
        aluno5.setSenhaAluno("1234");

        // Adiciona os alunos na array em universidade
        universidade.adicionarAluno(aluno1);
        universidade.adicionarAluno(aluno2);
        universidade.adicionarAluno(aluno3);
        universidade.adicionarAluno(aluno4);
        universidade.adicionarAluno(aluno5);

        // Adiciona os professores
        Professor professor1 = new Professor();
        professor1.setNome("Daniel Paiva");
        professor1.setMatricula(7575);
        professor1.setDisciplinaLecionada("Modelos, Métodos e Técnicas de Engenharia de Software");
        professor1.setSenhaProfessor("1234");
        universidade.adicionarProfessor(professor1);

        Professor professor2 = new Professor();
        professor2.setNome("Leonardo Melgaço");
        professor2.setMatricula(7676);
        professor2.setDisciplinaLecionada("Análise de Dados e Big Data");
        professor2.setSenhaProfessor("1234");
        universidade.adicionarProfessor(professor2);

        //Notas provisórias até implementação do sistema de lançamento de notas
        aluno1.setNota1(70);
        aluno1.setNota2(80);

        // Inicio do Programa
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Ulife!");
        System.out.println("Por favor, selecione uma opção:");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                exibirListaAlunos(universidade);
                System.out.println("Selecione o aluno:");
                int indiceAluno = scanner.nextInt();
                Aluno alunoSelecionado = universidade.getAlunos().get(indiceAluno - 1);
                System.out.println("Digite a senha de " + alunoSelecionado.getNome() + ":");
                String senhaAluno = scanner.next();
                if (verificarSenhaAluno(alunoSelecionado, senhaAluno)) {
                    exibirOpcoesAluno(universidade);
                    int escolhaAluno = scanner.nextInt();
                    switch (escolhaAluno) {
                        case 1:
                            exibirDisciplinas(universidade);
                            break;
                        case 2:
                            System.out.println("Sistema ainda não implementado como esperado");
                            System.out.println("Nota para Modelos, Métodos e Técnicas de Engenharia de Software:");
                            System.out.println(aluno1.getNota1());
                            System.out.println("");
                            System.out.println("Nota para Análise de Dados e Big Data:");
                            System.out.println(aluno1.getNota2());
                            break;
                        case 3:
                            System.out.println("Saindo do programa.");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } else {
                    System.out.println("Senha incorreta!");
                }
                break;
            case 2:
                exibirListaProfessores(universidade);
                System.out.println("Selecione o professor:");
                int indiceProfessor = scanner.nextInt();
                Professor professorSelecionado = universidade.getProfessores().get(indiceProfessor - 1);
                System.out.println("Digite a senha de " + professorSelecionado.getNome() + ":");
                String senhaProfessor = scanner.next();
                if (verificarSenhaProfessor(professorSelecionado, senhaProfessor)) {
                    exibirOpcoesProfessor(universidade);
                    int escolhaProfessor = scanner.nextInt();
                    switch (escolhaProfessor) {
                        case 1:
                            System.out.println("Sistema ainda não implementado como esperado");
                            break;
                        case 2:
                            visualizarAlunos(universidade);
                            break;
                        case 3:
                            System.out.println("Saindo do programa.");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } else {
                    System.out.println("Senha incorreta!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static boolean verificarSenhaAluno(Aluno aluno, String senha) {
        return aluno.getSenhaAluno().equals(senha);
    }

    private static boolean verificarSenhaProfessor(Professor professor, String senha) {
        return professor.getSenhaProfessor().equals(senha);
    }

    private static void exibirListaAlunos(Universidade universidade) {
        System.out.println("Lista de Alunos:");
        for (int i = 0; i < universidade.getAlunos().size(); i++) {
            Aluno aluno = universidade.getAlunos().get(i);
            System.out.println((i + 1) + ". " + aluno.getNome());
        }
    }

    private static void exibirListaProfessores(Universidade universidade) {
        System.out.println("Lista de Professores:");
        for (int i = 0; i < universidade.getProfessores().size(); i++) {
            Professor professor = universidade.getProfessores().get(i);
            System.out.println((i + 1) + ". " + professor.getNome());
        }
    }

    private static void exibirOpcoesAluno(Universidade universidade) {
        System.out.println("Opções para Aluno:");
        System.out.println("1 - Visualizar disciplinas");
        System.out.println("2 - Visualizar notas");
        System.out.println("3 - Sair");
    }

    private static void exibirOpcoesProfessor(Universidade universidade) {
        System.out.println("Opções para Professor:");
        System.out.println("1 - Lançar notas");
        System.out.println("2 - Visualizar alunos");
        System.out.println("3 - Sair");
    }

    private static void exibirDisciplinas(Universidade universidade) {
        System.out.println("Disciplinas disponíveis:");
        for (Disciplina disciplina : universidade.getDisciplinas()) {
            System.out.println("- " + disciplina.getNomeDisciplina());
        }
    }

    private static void visualizarAlunos(Universidade universidade) {
        List<Aluno> alunos = universidade.getAlunos();
        System.out.println("Lista de Alunos:");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println((i + 1) + ". " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }
    }

}
