public class List {
    private String elementsVector[];
    private int numberOfElements;

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

    public void impossibleMessage() {
        System.out.println("Não é possível realizar a operação!");

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
            numberOfElements = numberOfElements + 1;

        }
    }

    public String removeEnd() {
        String removedElement = null;

        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else {
            int i;

            i = numberOfElements - 1;
            removedElement = elementsVector[i];
            numberOfElements = i;

        }

        return removedElement;
    }

    public void addStart(String e) {
        if (this.fullList()) {
            this.fullStructureMessage();

        } else {
            for (int i = numberOfElements - 1; i > 0; i--) {
                elementsVector[i] = elementsVector[i - 1];

            }
            elementsVector[0] = e;
            numberOfElements = numberOfElements + 1;
        }
    }

    public String removeStart() {
        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else {
            String removedElement = elementsVector[0];

            for (int i = 1; i < numberOfElements; i++) {
                elementsVector[i - 1] = elementsVector[i];

            }
            numberOfElements = numberOfElements - 1;

            return removedElement;
        }
        return null;
    }

    public void addPosition(String e, int i) {
        if (this.fullList()) {
            this.fullStructureMessage();
            
        } else if (i <= 0) {
            this.addStart(e);

        } else if (i >= numberOfElements) {
            this.addEnding(e);

        } else {
            for (int index = numberOfElements; index > i; index--) {
                elementsVector[index] = elementsVector[index - 1];

            }

            elementsVector[i] = e;
            numberOfElements = numberOfElements + 1;
        }
    }

    public String removePosition(int i) {
        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else if (i <= 0) {
            removeStart();

        } else if (i >= numberOfElements) {
            removeEnd();

        } else {
            String removedElement = elementsVector[i];

            for (int index = 0; i <= numberOfElements; i++) {
                elementsVector[index] = elementsVector[numberOfElements + 1];

            }
            numberOfElements = numberOfElements - 1;
            return removedElement;
        }
        return null;
    }


    public String getIndex(int index) {
        String removedElement = null;

        if (emptyList()) {
            this.emptyStructureMessage();

        } else {
            for (int i = 0; i < numberOfElements; i++) {
                String auxRemoveStart = this.removeStart();
                addEnding(auxRemoveStart);

                if (i == index) {
                    removedElement = auxRemoveStart;

                }
            }
        }
        return removedElement;
    }

    public String MiddleElement() {
        return getIndex(numberOfElements/2);

    }

    public void firstToFinal() {
        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else {
            String firstNumber = removeStart();
            String lastNumber = removeEnd();

            addStart(lastNumber);
            addEnding(firstNumber);

        }
    }

    public void invertedList() {
        for (int i = 0; i <= numberOfElements + 1; i++) {
            addPosition(removeEnd(),i);

        }
    }

    public void removeRepeatedElements() {
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                if (getIndex(i) == getIndex(j)) {
                    removePosition(j);
                    j--;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfElements; i++) {
            sb.append(elementsVector[i]);
            sb.append("\n");
        }
        return sb.toString();
    }
}