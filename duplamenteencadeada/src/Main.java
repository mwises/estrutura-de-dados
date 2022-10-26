public class Main {
    public static void main(String[] args) {
        //ListaEstatica lista = new ListaEstatica(10);
        //ListaDinamica lista = new ListaDinamica();
        LDE lista = new LDE();
        lista.inserirPrimeiro(4);
        lista.inserirUltimo(55);
        lista.inserirUltimo(66);
        lista.inserirPrimeiro(4545);
        lista.inserir_pos(2,45454);
        lista.remover_pos_v2(4);
        lista.inserirPrimeiro(1);
        lista.imprimir();

        //System.out.println(lista.isOrdenada());
        //lista.removerInicio();
        //lista.exibir();
        //lista.removerFinal();
        //lista.exibir();
    }
}
