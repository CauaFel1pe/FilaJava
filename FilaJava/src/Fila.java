public class Fila {
    private int[] elementos;
    private int primeiro;
    private int ultimo;
    private int total;

    // Construtor: define o tamanho da fila
    public Fila(int tamanho) {
        elementos = new int[tamanho];
        primeiro = 0;
        ultimo = -1;
        total = 0;
    }

    // Método para inserir (Enqueue)
    public void inserir(int valor) {
        if (total < elementos.length) {
            ultimo = (ultimo + 1) % elementos.length;
            elementos[ultimo] = valor;
            total++;
            System.out.println("Inseriu: " + valor);
        } else {
            System.out.println("Fila cheia!");
        }
    }

    // Método para remover (Dequeue)
    public int remover() {
        if (total > 0) {
            int valor = elementos[primeiro];
            primeiro = (primeiro + 1) % elementos.length;
            total--;
            return valor;
        }
        return -1; // Indica fila vazia
    }

    public boolean estaVazia() {
        return (total == 0);
    }
}