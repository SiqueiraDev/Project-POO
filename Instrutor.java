public class Instrutor extends Pessoa {
    private String especialidade;
    private double salario;
    private String horarioDeTrabalho;

    public Instrutor(String nome, String CPF, String especialidade, double salario, String horarioDeTrabalho) {
        super(nome, CPF);
        this.especialidade = especialidade;
        this.salario = salario;
        this.horarioDeTrabalho = horarioDeTrabalho;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorarioDeTrabalho() {
        return horarioDeTrabalho;
    }

    public void setHorarioDeTrabalho(String horarioDeTrabalho) {
        this.horarioDeTrabalho = horarioDeTrabalho;
    }
}
