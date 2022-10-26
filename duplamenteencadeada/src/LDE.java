public class LDE {
    private DNode inicio;
    private DNode fim;
    private int tamanho;

    public LDE() {
        inicio = fim = null;
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void inserir_pos(int pos, Object v) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("POSICAO INVALIDA!!!!");
            return;
        }
        if (pos == 0) {
            inserirPrimeiro(v);
        } else if (pos == tamanho) {
            inserirUltimo(v);
        } else {
            DNode aux = inicio;
            for(int cont = 0; cont < pos-1; cont++) {
                aux = aux.getNext();
            }
            DNode novoNo = new DNode(v, aux, aux.getNext());
            aux.getNext().setPrev(novoNo);
            aux.setNext(novoNo);
            tamanho++;
        }

    }

    // remover meio (questão 2)
    public Object remover_meio_lista_exerciciosala() {
        //TODO: Adaptar o código para quando tiver apenas 1 elemento.
        //FIXME: Remover o elemento do meio da lista, supondo uma lista
        // com número de elementos ímpares.

        // CRIAR EXCEÇÕES PARA LISTA DE ZERO e 1 ELEMENTOS

        //FIXME: Encontrar o elemento do meio da lista
        DNode aux = inicio;
        for(int i = 0; i < size()/2; i++) {
            aux = aux.getNext();
        }
        //FIXME: Alterar ponteiros prev e next do elemento posterior e anterior para saltar o elemento que será deletado
        aux.getNext().setPrev(aux.getPrev());
        aux.getPrev().setNext(aux.getNext());
        Object ret = aux.getElement();

        tamanho--;

        return ret;
    }

    // remover meio (questão 2)
    public Object remover_meio() {
        return remover_pos_v1(tamanho/2);
    }

    // esquerda para direita
    public Object remover_pos_v1(int pos) {
        //TODO: Implementar o remover_pos
        if (!isEmpty()) {
            if (pos == 0)
                    this.removerPrimeiro();
            else if (pos == tamanho)
                    this.removerUltimo();
            else {
                DNode aux = inicio;
                for (int i = 0; i < pos -1; i++) {
                    aux = aux.getNext();
                }
                aux.getPrev().setNext(aux.getNext());
                aux.getNext().setPrev(aux.getPrev());
            };

        }
        return null;
    }
    // direita para esquerda
    public Object remover_pos_v2(int pos) {
        //TODO: Implementar o remover_pos
        if (!isEmpty()) {
            if (pos == 0)
                this.removerPrimeiro();
            else if (pos == tamanho)
                this.removerUltimo();
            else {
                DNode aux = inicio;
                for (int i = 0; i < pos -1; i++) {
                    aux = aux.getNext();
                }
                aux.getNext().setPrev(aux.getPrev());
                aux.getPrev().setNext(aux.getNext());
                tamanho--;
            };

        }
        return null;
    }

    public Object removerPrimeiro() {
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


    public void inserirPrimeiro(Object v) {
        DNode novoNo = new DNode(v, null, inicio);
        if (inicio != null) {
            inicio.setPrev(novoNo);
        } else {
            fim = novoNo;
        }
        inicio = novoNo;
        tamanho++;
    }

    // remover ultimo
    public Object removerUltimo() {
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

    // inserir ultimo
    public void inserirUltimo(Object v) {
        DNode novoNo = new DNode(v, fim, null);
        if (isEmpty()) {
            inicio = novoNo;
        } else {
            fim.setNext(novoNo);
        }
        fim = novoNo;
        tamanho++;
    }

    public void imprimir() {
        DNode aux = inicio;
        while(aux != null) {
            System.out.print(aux.getElement() + " ");
            aux = aux.getNext();
        }
    }

    //Imprimir a LDE ao contrario
    public void imprimirContrario() {
        DNode aux = fim;
        while(aux != null) {
            System.out.print(aux.getElement() + " ");
            aux = aux.getPrev();
        }
    }

    //// versão 1
    //1 ) Implementar o método de busca
    // retornar -1 caso não encontre
    // ou posição se encontrar o elemento
    public int searchElement(Object obj){
        DNode aux = inicio;
        int pos = 0;
        if(aux == null){
            System.out.println("Não há nenhum elemento disponível");
        }else {
            while(aux != null){
                if(obj.equals(aux.getElement())){
                    System.out.println("Elemento encontrado, pos:" + pos);
                    return pos;
                }
                aux = aux.getNext();
                pos++;
            }
        }
        return -1;
    }
    // versão 2
    public int buscar(Object obj){
        DNode aux = inicio;
        int index = 0;
        if(aux == null){
            System.out.println("Não há nenhum elemento disponível");
        }else {
            while(aux != null){
                if(obj.equals(aux.getElement())){
                    System.out.println("Elemento encontrado");
                    return index;
                }
                index++;
                aux = aux.getNext();
            }
        }
        System.out.println("Elemento não encontrado");
        return -1;
    }

}
