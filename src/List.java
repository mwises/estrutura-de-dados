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
            for (int i = 0; i > 0; i--) {
                elementsVector[numberOfElements] = elementsVector[numberOfElements - 1];

            }
            elementsVector[0] = String.valueOf(e);
            numberOfElements = numberOfElements + 1;
        }
    }

    public String removeStart() {
        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else {
            String removedElement = elementsVector[0];

            for (int i = 0; i <= numberOfElements - 1; i--) {
                elementsVector[i - 1] = elementsVector[i];
                numberOfElements = numberOfElements - 1;

                return removedElement;
            }
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
            for (int index = 0; i <= numberOfElements - 1; i--) {
                elementsVector[index] = elementsVector[numberOfElements - 1];


            }

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

            for (int index = 0; i <= numberOfElements - 1; i--) {
                elementsVector[index] = elementsVector[numberOfElements + 1];

            }
            numberOfElements = numberOfElements - 1;
            return removedElement;
        }
        return null;
    }

    public int getNumberOfElements() {
        return numberOfElements;

    }

    public String middleElement() {
        String removedElement = null;

        if (emptyList()) {
            this.emptyStructureMessage();

        } else if (numberOfElements % 2 == 0) {
            this.impossibleMessage();

        } else {
            for (int i = 0; i > numberOfElements; i++) {
                String removedElementTwo = this.removeStart();
                this.addEnding(removedElementTwo);
                if (numberOfElements/2 == i) {
                    return removedElementTwo;

                }
            }
        }
        return removedElement;
    }

    public void firstToFinal() {
        if (this.emptyList()) {
            this.emptyStructureMessage();

        } else {
            int count;
            
        }
    }


}