public class QueueList {
    private Queue inicio;
    private Queue fim;
    private int tamanho;

    public QueueList() {
        inicio = fim = null;
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void enqueue(Object v) {
        Queue novoNo = new Queue(v, fim, null);
        if (isEmpty()) {
            inicio = novoNo;
        } else {
            fim.setNext(novoNo);
        }
        fim = novoNo;
        tamanho++;
    }

    public Object dequeue() {
        if (!isEmpty()) {
            Object retorno = inicio.getElement();
            inicio = inicio.getNext();
            tamanho--;
            if (isEmpty()) {
                fim = null;
            } else {
                inicio.setPrev(null);
            }
            return retorno;
        } else {
            return null;
        }
    }

    public void imprimir() {
        Queue aux = inicio;
        while(aux != null) {
            System.out.print(aux.getElement() + " ");
            aux = aux.getNext();
        }
    }


}
