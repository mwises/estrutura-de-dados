public class ListD {
    private DNo inicio;
    private DNo fim;
    private int tamanho;

    public ListD() {
        inicio = new DNo(null, null, null);
        fim = new DNo(null,null,null);
        inicio.setProximo(fim);
        tamanho = 0;
    }

    public void adicionarInicio(DNo no) {
        DNo primeiroElemento;

        primeiroElemento = inicio.getProximo();
        no.setProximo(primeiroElemento);
        no.setAnterior(inicio);
        primeiroElemento.setAnterior(no);
        inicio.setProximo(no);
        tamanho = tamanho + 1;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean listaVazia() {
        return (tamanho == 0);
    }

    public DNo impossivelMsg() {
        System.out.println("lista vazia!");
        return null;
    }

    public DNo getInicio() {
        if (listaVazia()) {
            return this.impossivelMsg();
        } else return inicio.getProximo();
    }

    public DNo getUltimo() {
        if (listaVazia()) {
            return this.impossivelMsg();
        } else return fim.getAnterior();
    }

    public DNo getAnterior(DNo no) {
        if (no == inicio) {
            return this.impossivelMsg();
        } else return no.getAnterior();
    }

    public DNo getProximo(DNo no) {
        if (no == fim) {
            return this.impossivelMsg();
        } else return no.getProximo();

    }

    public void adicionarAnterior(DNo v, DNo no) {
        DNo u = getAnterior(v);
        no.setAnterior(u);
        no.setProximo(v);
        v.setAnterior(no);
        u.setProximo(no);
        tamanho++;
    }


    public void adicionarApos(DNo v, DNo no) {
        DNo u = getProximo(v);
        no.setAnterior(v);
        no.setProximo(u);
        v.setProximo(no);
        u.setAnterior(no);
        tamanho++;
    }

    public void adicionarUltimo(DNo no) {
        adicionarAnterior(fim, no);
    }

    public void removerNo(DNo no) {
        DNo u = getAnterior(no);
        DNo w = getProximo(no);
        u.setProximo(w);
        w.setAnterior(u);
        no.setProximo(null);
        no.setAnterior(null);

    }

    public Boolean temAnterior(DNo no) {
        return (no != inicio);
    }

    public Boolean temSucessor(DNo no) {
        return (no != inicio);

    }

    public String toString() {
        DNo ponteiro = inicio.getProximo();

        int i = 1;

        while (ponteiro.getProximo() != null) {
            if (i == 1) {
                ponteiro.getElemento();
                i++;
                ponteiro = ponteiro.getProximo();
            }
        }
        return null;
    }
}
