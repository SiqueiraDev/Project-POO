import java.util.Date;

public class Equipamento {
    private int id;
    private String nomeEquipamento;
    private String tipo;
    private String fabricante;
    private Date dataDeAquisicao;

    public Equipamento(int id, String nomeEquipamento, String tipo, String fabricante, Date dataDeAquisicao) {
        this.id = id;
        this.nomeEquipamento = nomeEquipamento;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.dataDeAquisicao = dataDeAquisicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getDataDeAquisicao() {
        return dataDeAquisicao;
    }

    public void setDataDeAquisicao(Date dataDeAquisicao) {
        this.dataDeAquisicao = dataDeAquisicao;
    }
}
