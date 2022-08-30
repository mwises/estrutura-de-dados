public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[9];

        List myList = new List(stringArray, 0);
        myList.addStart("1");
        myList.addStart("2");
        myList.addEnding("5");
        myList.addPosition("2", 1);
        myList.addPosition("125634", 2);
        myList.removeStart();
        myList.removeStart();
        myList.removeEnd();
        myList.addEnding("5");
        myList.addEnding("6");
        myList.removePosition(2);
        myList.removePosition(2);
        myList.removePosition(2);
        myList.middleElement();
        myList.addPosition("4654", 1);
        myList.addPosition("554", 2);
        myList.addPosition("45646", 3);
        myList.addPosition("5464", 4);
        myList.removePosition(3);
        System.out.println(myList);

    }
}
