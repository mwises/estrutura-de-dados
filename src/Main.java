public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[9];

        List myList = new List(stringArray, 0);

        myList.addPosition("1",0);
        myList.addPosition("1",1);
        myList.addPosition("2",2);
        myList.addPosition("3",3);
        myList.addPosition("4",4);
        myList.addPosition("4",5);

        myList.removeRepeatedElements();
        System.out.println(myList);

    }
}
