import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>(0);
        nomes.add("Wellington");
        nomes.add("Maria");
        nomes.add("Elizabeth");
        
        for(String nome : nomes) {
            System.out.println("O nome é " + nome);
        }

        nomes.forEach(nome -> System.out.println("O nome foi " + nome));
    }
}
