public class List {
    private String elementsVector[];
    private int numberOfElements;
    private static String myList;

    public List(String[] elementsVector, int numberOfElements) {
        this.elementsVector = elementsVector;
        this.numberOfElements = numberOfElements;
    }

    public void fullStructureMessage() {
        System.out.println("Estrutura cheia!");

    }

    public void emptyStructureMessage() {
        System.out.println("Estrutura vazia!");

    }

    public boolean emptyList() {
        if (numberOfElements == 0) {
            return true;

        } else {
            return false;

        }
    }

    public boolean fullList() {
        return numberOfElements >= this.elementsVector.length - 1;

    }

    public void addEnding(String e) {
        if (this.fullList()) {
            this.fullStructureMessage();

        } else {
            int i = numberOfElements;
            elementsVector[i] = e;
            i = numberOfElements;
            numberOfElements = numberOfElements - 1;

        }
    }

    public void removeEnd() {

        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else {
            int i;
            String removedElement;

            i = numberOfElements - 1;
            removedElement = elementsVector[i];
            numberOfElements = i;

            System.out.println("Número removido: " + removedElement);
        }

    }

    public void addStart(int e) {
        if (this.fullList()) {
            this.fullStructureMessage();

        } else {
            elementsVector[numberOfElements] = elementsVector[numberOfElements - 1];

            elementsVector[0] = String.valueOf(e);
            numberOfElements = numberOfElements + 1;
        }
    }

    public String removeStart() {
        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else {
            String removedElement;
            removedElement = elementsVector[0];
            
            elementsVector[numberOfElements - 1] = elementsVector[numberOfElements];
            numberOfElements = numberOfElements - 1;

            return removedElement;

        }
        return null;
    }

    public void addPosition(int e, int i) {
        if (this.fullList()) {
            this.fullStructureMessage();
            
        } else if (i <= 0) {
            this.addStart(e);

        } else if (i >= numberOfElements) {
            this.addEnding(String.valueOf(e));

        } else {
            elementsVector[numberOfElements] = elementsVector[numberOfElements - 1];

            elementsVector[i] = String.valueOf(e);
            numberOfElements = numberOfElements + 1;
        }
    }

    public Object removePosition(int i) {
        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else if (i <= 0) {
            removeStart();

        } else if (i >= numberOfElements) {
            removeEnd();

        } else {
            int removedElement = Integer.parseInt(elementsVector[i]);

            elementsVector[numberOfElements] = elementsVector[numberOfElements + 1];
            numberOfElements = numberOfElements - 1;

            return removedElement;
        }
        return null;
    }

    


}