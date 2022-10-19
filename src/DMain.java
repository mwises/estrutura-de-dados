public class DMain {
    public static void main(String[] args) {
        ListD lista = new ListD();

        lista.adicionarInicio(new DNo("3",null,null));
        lista.adicionarInicio(new DNo("2",null,null));

        for (int index = 1; index <= 50; index++) {
            lista.adicionarUltimo(new DNo(index + "", null,null));
        }
        System.out.println(lista);
    }
}
