public class Disciplina {
    private String nomeDisciplina;
    private String descricao;

    // construtor
    public Disciplina(String nomeDisciplina, String descricao) {
        this.nomeDisciplina = nomeDisciplina;
        this.descricao = descricao;
    }

    //gets e sets das variaveis
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
