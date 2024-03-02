public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(1, "Doméstico", "Terrestre", "Hulk", "Pitbull", 3);
        Gato gato = new Gato(2, "Doméstico", "Terrestre", "Amendoim", "Siames", 5);
        Cavalo cavalo = new Cavalo(3, "Doméstico", "Terrestre", "Pé de Pano", "Puro Sangue", 8);
        Tigre tigre = new Tigre(4, "Selvagem", "Terrestre", "Tigrão", "Panthera tigris", 6);

        System.out.println("Dados dos animais:");
        // Imprimindo os dados dos animais

        System.out.println("Dados do cachorro:");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("Tipo: " + cachorro.getTipo());
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade());
        System.out.println("");

        System.out.println("Dados do gato:");
        System.out.println("ID: " + gato.getId());
        System.out.println("Tipo: " + gato.getTipo());
        System.out.println("Habitat: " + gato.getHabitat());
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Raça: " + gato.getRaca());
        System.out.println("Idade: " + gato.getIdade());
        System.out.println("");

        System.out.println("Dados do cavalo:");
        System.out.println("ID: " + cavalo.getId());
        System.out.println("Tipo: " + cavalo.getTipo());
        System.out.println("Habitat: " + cavalo.getHabitat());
        System.out.println("Nome: " + cavalo.getNome());
        System.out.println("Raça: " + cavalo.getRaca());
        System.out.println("Idade: " + cavalo.getIdade());
        System.out.println("");

        System.out.println("Dados do tigre:");
        System.out.println("ID: " + tigre.getId());
        System.out.println("Tipo: " + tigre.getTipo());
        System.out.println("Habitat: " + tigre.getHabitat());
        System.out.println("Nome: " + tigre.getNome());
        System.out.println("Espécie: " + tigre.getEspecie());
        System.out.println("Idade: " + tigre.getIdade());
    }
}