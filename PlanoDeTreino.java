public class PlanoDeTreino {
    private int id;
    private String nomePlano;
    private String descricao;
    private int duracaoSemanas;

    public PlanoDeTreino(int id, String nomePlano, String descricao, int duracaoSemanas) {
        this.id = id;
        this.nomePlano = nomePlano;
        this.descricao = descricao;
        this.duracaoSemanas = duracaoSemanas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoSemanas() {
        return duracaoSemanas;
    }

    public void setDuracaoSemanas(int duracaoSemanas) {
        this.duracaoSemanas = duracaoSemanas;
    }
}
