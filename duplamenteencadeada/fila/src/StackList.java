public class StackList {
    private Object element;
    private StackList next;
    private StackList prev;

    public StackList(Object element, StackList prev, StackList next) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    public Object getElement() {
        return element;
    }
    public void setElement(Object element) {
        this.element = element;
    }
    public StackList getNext() {
        return next;
    }
    public void setNext(StackList next) {
        this.next = next;
    }
    public StackList getPrev() {
        return prev;
    }
    public void setPrev(StackList prev) {
        this.prev = prev;
    }
}
