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

    public void fullStructureMessage() {
        System.out.println("Estrutura cheia!");

    }

    public void emptyStructureMessage() {
        System.out.println("Estrutura vazia!");

    }

    public void impossibleMessage() {
        System.out.println("Não é possível realizar a operação!");

    }

    public void addStart(No e) {
        No newNo = e;

        if (!emptyList()) {
            newNo.nextNo = topOfDaList;

        }
        topOfDaList = newNo;
    }

    public void addEnding(No e) {
        No newNo = e;

        if (emptyList()) {
            topOfDaList = newNo;

        } else {
            No aux = topOfDaList;

            while (aux.nextNo != null) {
                aux = aux.nextNo;

            }
            aux.nextNo = newNo;
        }
    }

    public No removeStart() {
        No removed = null;
        if (emptyList()) {
            this.emptyStructureMessage();

        } else {
            removed = topOfDaList;
            topOfDaList = topOfDaList.nextNo;

        }
        return removed;
    }

    public No removeEnding() {
        No removed = null;

        if (emptyList()) {
            this.emptyStructureMessage();

        } else {
            No aux = null;
            removed = aux;
            aux = topOfDaList;

            while (removed.nextNo != null) {
                aux = removed;
                removed = removed.nextNo;

            }
            aux.nextNo = null;
        }
        return removed;
    }

    public int addPosition(No e, int i) {

        if (emptyList() || i <= 1) {
            this.addStart(e);

        } else {
            No newNo = e;
            No aux = topOfDaList;
            int index = 1;

            while (index < i && aux != null) {
                aux = aux.nextNo;
                index = index + 1;

            }
            if (aux == null) {
                this.addEnding(e);

            } else {
                newNo.nextNo = aux.nextNo;
                aux.nextNo =  newNo;
            }
        }
        return i;
    }

    public No removePosition(int i) {
        No removed = null;

        if (emptyList()) {
            removed = this.removeEnding();

        } else {
            No aux = null;
            removed = aux;
            aux = topOfDaList;
            int index = 1;

            while (index < i && removed != null) {
                aux = removed;
                removed = removed.nextNo;
                index = index + 1;
            }
            if (removed == null) {
                removed = this.removeEnding();

            } else {
                aux.nextNo = removed.nextNo;

            }
        }
        return removed;
    }

    public No returnLastElement() {
        if (emptyList()) {
            impossibleMessage();

        } else {
            No aux = topOfDaList;

            while (aux.nextNo != null) {
                aux = aux.nextNo;

            }
            return aux;
        }
        return null;
    }

    public No returnPenultimate() {

        if (emptyList()) {
            this.impossibleMessage();

        }
        No aux = topOfDaList;

        while (aux.nextNo.nextNo != null) {
            aux = aux.nextNo;

        }
        return aux;
    }

}
