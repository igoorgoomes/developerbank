public class TesteColaborador {

    public static void main(String[] args) {

        Colaborador novoColaborador = new Colaborador();
        novoColaborador.setNome("Igor Gomes");
        novoColaborador.setCargo("Desenvolvedor Java Jr");
        novoColaborador.setCpf("701.701.701-00");
        novoColaborador.setSalario(5500.00);

        System.out.println("*****************************");
        System.out.println("COLABORADOR - DeveloperBank");
        System.out.println(novoColaborador.getNome());
        System.out.println(novoColaborador.getCargo());
        System.out.println(novoColaborador.getCpf());
        System.out.println(novoColaborador.getSalario());
        System.out.println("*****************************");
        System.out.println("PARTICIPAÇÃO NOS LUCROS");
        System.out.println("*****************************");
        System.out.println(novoColaborador.getParticipacao());
        System.out.println("*****************************");


    }
}
