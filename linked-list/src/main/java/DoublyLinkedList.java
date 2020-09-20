/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

class DoublyLinkedList<T> {

    Node<T> head = null;
    Node<T> tail = null;

    void push(T value) {
       Node newNode = new Node(value, this.tail, null);
       if (tail == null) {
           head = newNode;
       } 
       else {
           tail.setNext(newNode);
       }
       tail = newNode;
    }

    T pop() {
        if (tail == null) {
            throw new EmptyListException();
        }
        T value = tail.getValue();
        tail = tail.getPrev();
        return value;
    }

    void unshift(T value) {
        Node newNode = new Node(value, null, this.head);
        if (head == null) {
            tail = newNode;
        } 
        else {
            head.setPrev(newNode);
        }
        head = newNode;
    }

    T shift() {
        if (head == null) {
            throw new EmptyListException();
        }
        T value = head.getValue();
        head = head.getNext();
        return value;
    }

}