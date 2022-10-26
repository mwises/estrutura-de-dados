public class Stack {
    private StackList inicio;
    private StackList fim;
    private int tamanho;

    public Stack() {
        inicio = fim = null;
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void push(Object v) {
        StackList novoNo = new StackList(v, fim, null);
        if (isEmpty()) {
            inicio = novoNo;
        } else {
            fim.setNext(novoNo);
        }
        fim = novoNo;
        tamanho++;
    }

    public Object pop() {
        if (!isEmpty()) {
            Object retorno = fim.getElement();
            fim = fim.getPrev();
            tamanho--;
            if (isEmpty()) {
                inicio = null;
            } else {
                fim.setNext(null);
            }
            return retorno;
        } else {
            return null;
        }
    }

    public void imprimir() {
        StackList aux = inicio;
        while(aux != null) {
            System.out.print(aux.getElement() + " ");
            aux = aux.getNext();
        }
    }
}
