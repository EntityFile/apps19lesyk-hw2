package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList queue;

    public Queue() {
        queue = new ImmutableLinkedList();
    }

    public Queue(Object[] arraySeries) {
        queue = new ImmutableLinkedList(arraySeries);
    }

    public Object peek() {
        return queue.getFirst();
    }

    public Object dequeue() {
        Object element = this.peek();

        queue = queue.removeFirst();

        return element;
    }

    public void enqueue(Object e) {
        queue = queue.addLast(e);
    }
}
