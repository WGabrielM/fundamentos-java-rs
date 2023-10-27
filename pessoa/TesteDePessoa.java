package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "12345667889";
        pessoa1.nome = "Gabriel";
        pessoa1.idade = 24;

        System.out.println(pessoa1.imprimirDadosPessoa(1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "12345667889";
        pessoa2.nome = "Gabriel";
        pessoa2.idade = 24;

        System.out.println(pessoa2.imprimirDadosPessoa(2));
    }
}
