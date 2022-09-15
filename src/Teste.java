public class Teste {
    public static void main(String[] args) {

        ListTwo linkedList = new ListTwo(new No(9));


        linkedList.returnLastElement();
        System.out.println("lista do moises: " + linkedList.topOfDaList.storedElement);
    }
}
