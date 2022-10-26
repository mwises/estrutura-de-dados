public class Main {
    public static void main(String[] args) {
        QueueList lista = new QueueList();

        lista.enqueue(1);
        lista.enqueue(465465);
        lista.enqueue(65498798);
        lista.enqueue(4548489);
        lista.dequeue();
        lista.imprimir();
    }
}
