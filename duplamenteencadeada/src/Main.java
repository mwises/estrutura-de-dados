public class Main {
    public static void main(String[] args) {
        //ListaEstatica lista = new ListaEstatica(10);
        //ListaDinamica lista = new ListaDinamica();
        LDE lista = new LDE();

        lista.inserirPrimeiro(35);
        lista.imprimir();
        lista.inserirPrimeiro(38);
        lista.imprimir();
        lista.inserirUltimo(25);
        lista.imprimir();
        lista.inserirUltimo(27);
        lista.imprimir();
        //System.out.println(lista.isOrdenada());
        //lista.removerInicio();
        //lista.exibir();
        //lista.removerFinal();
        //lista.exibir();
    }
}
