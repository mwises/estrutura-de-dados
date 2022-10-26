public class Queue {
    private Object element;
    private Queue next;
    private Queue prev;

    public Queue(Object element, Queue prev, Queue next) {
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
    public Queue getNext() {
        return next;
    }
    public void setNext(Queue next) {
        this.next = next;
    }
    public Queue getPrev() {
        return prev;
    }
    public void setPrev(Queue prev) {
        this.prev = prev;
    }
}
