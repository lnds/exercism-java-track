class Node<T> {

    private T value;
    private Node prev;
    private Node next;

    Node(T value) {
        this.value = value;
        prev = null;
        next = null;
    }

    Node(T value, Node prev, Node next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}