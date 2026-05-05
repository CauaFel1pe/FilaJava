public class Main {
    public static void main(String[] args) {
        // Criamos um objeto da nossa classe Fila com 5 espaços
        Fila minhaFila = new Fila(5);

        // Testando a inserção
        minhaFila.inserir(10);
        minhaFila.inserir(20);
        minhaFila.inserir(30);

        System.out.println("--- Removendo elementos ---");

        // Enquanto a fila não estiver vazia, remove e mostra
        while (!minhaFila.estaVazia()) {
            int elemento = minhaFila.remover();
            System.out.println("Removido: " + elemento);
        }
    }
}