public class DNo {
    private String elemento;
    private DNo proximo, anterior;

    public DNo(String elemento, DNo proximo, DNo anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public String getElemento() {
        return elemento;
    }

    public DNo getAnterior() {
        return proximo;
    }
    public DNo getProximo() {
        return proximo;
    }

    public void setElemento(String novoElemento) {
        elemento = novoElemento;
    }

    public void setAnterior(DNo novoAnterior) {
        anterior = novoAnterior;
    }

    public void setProximo(DNo novoProximo) {
        proximo = novoProximo;
    }
}
