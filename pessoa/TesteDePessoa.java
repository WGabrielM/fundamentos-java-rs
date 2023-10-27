package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("12345667889");
        professor.setNome("Gabriel");
        professor.setIdade(24);
        professor.setSalario(50000);
        
        System.out.println(professor.imprimirDadosPessoa());
        
        Aluno aluno = new Aluno();
        aluno.setCpf("12345667889");
        aluno.setNome("Gabriel");
        aluno.setIdade(24);
        aluno.setMatricula("123");
        System.out.println(aluno.imprimirDadosPessoa());
    }
}
