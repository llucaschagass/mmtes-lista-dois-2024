public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Lucas Chagas");
        pessoa.setIdade(23);
        pessoa.setCpf("12345678910");
        pessoa.setDataNascimento("25/01");
        pessoa.setProfissao("Desenvolvedor");
        pessoa.setAltura(1.70);
        pessoa.setPeso(84.6);
        pessoa.setEstadoCivil("Solteiro");

        System.out.println("Dados do usuário:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Profissão: " + pessoa.getProfissao());
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
    }
}