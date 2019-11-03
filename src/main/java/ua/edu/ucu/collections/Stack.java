package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList queue;

    public Stack() {
        queue = new ImmutableLinkedList();
    }

    public Stack(Object[] arraySeries) {
        queue = new ImmutableLinkedList(arraySeries);
    }

    public Object peek() {
        return queue.getLast();
    }

    public Object pop() {
        Object element = this.peek();

        queue = queue.removeLast();

        return element;
    }

    public void push(Object e) {
        queue = queue.addLast(e);
    }
}
