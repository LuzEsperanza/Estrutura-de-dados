import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos
        fila.add("João");
        fila.add("Maria");
        fila.add("Pedro");

        // Exibindo a fila
        System.out.println(fila);

        // Removendo elemento (primeiro da fila)
        fila.remove();

        // Mostrando o próximo da fila
        System.out.println(fila.peek());

        // Fila após remoção
        System.out.println(fila);

        System.out.println(fila.isEmpty()?"Fila vazia" : "Fila com elementos");
        PriorityQueue<Integer> num = new PriorityQueue<>();

        num.add(30);
        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println(num);
        System.out.println(num.poll());
        System.out.println("Fila totalmente ordenada");
        while (!num.isEmpty()) {
            System.out.println(num.poll());
        }
    }
}