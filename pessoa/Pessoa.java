package pessoa;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    String imprimirDadosPessoa(int indice) {
        return "O nome da pessoa é " + nome + "a idade é " + idade + " e o documento é " + cpf + " com indice: " + indice;
    }

}
