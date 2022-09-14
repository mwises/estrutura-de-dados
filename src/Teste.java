public class Teste {
    public static void main(String[] args) {

        ListTwo linkedList = new ListTwo(new No(9));


        linkedList.addStart(new No(4));
        System.out.println("lista do moises: " + linkedList.topOfDaList.storedElement);
    }
}
