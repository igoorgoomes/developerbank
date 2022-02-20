public class Colaborador {

    private String nome;
    private String cargo;
    private String cpf;
    private double salario;
    // private int tipoCargo = 0; //tipoCargo 0 -> Colaborador comum | tipoCargo = 1 -> Gerente | tipoCargo = 2 -> Diretor

    public double getParticipacao(){
       return this.salario *0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
