public class TesteGerente {

    public static void main(String[] args) {
        Gerente gerencia = new Gerente();
        gerencia.setNome("Lane Nunes");
        gerencia.setCargo("Gerente Financeiro");
        gerencia.setCpf("702.702.702-22");
        gerencia.setSalario(12400.00);
        gerencia.setSenha(7022);

        System.out.println("************************************");
        System.out.println(gerencia.getNome());
        System.out.println(gerencia.getCargo());
        System.out.println("************************************");

        //fazendo a validação da senha
        boolean validou = gerencia.autentificandoSenha(7022);
        System.out.println("************************************");
        System.out.println(gerencia.getParticipacao());

    }
}
