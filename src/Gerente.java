public class Gerente extends Colaborador{

    private int senha;

    public boolean autentificandoSenha (int senha){
        //fazendo autentificação da senha do Gerente
        if (this.senha == senha){
            System.out.println("Acesso liberado!");
            return true;
        }else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override //recuso que permite uma subclasse ou classe filha fornecer uma implementação especifica de uma classe mãe ou base classe.
    public double getParticipacao() {
        return super.getParticipacao() + super.getSalario();
    }
}
