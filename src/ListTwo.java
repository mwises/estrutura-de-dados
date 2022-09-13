public class ListTwo {
    No topOfDaList;

    public ListTwo(No topOfDaList) {
        this.topOfDaList = topOfDaList;
    }
    public boolean emptyList() {
        if (topOfDaList == null) {
            return true;

        } else return false;
    }

    public void addStart(int e) {
        No newNo = topOfDaList;

        if (emptyList()) {
            newNo.nextNo = topOfDaList;

        }
    }
}
