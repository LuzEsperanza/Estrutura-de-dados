import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
        Tipos Primativos -> Wrapper Class
        int              -> Integer
        float            -> Float
        double           -> Double
        char             -> Character
         */
        Integer idade = 10;
//        String nome = "Luz";
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(9);
        numeros.add(7);

        Collections.sort(numeros);

        for(Integer numero : numeros){
            System.out.println(numero);
        }

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Sofia");
        nomes.add("Valentina");
        nomes.add("Enzo");
        Collections.sort(nomes, Collections.reverseOrder());
        for(String nome : nomes){
            System.out.println(nome);
        }
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Joao", 20));
        pessoas.add(new Pessoa("Maria", 22));
        pessoas.add(new Pessoa("Pedro", 75));

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getNome());
        }

    }
}
