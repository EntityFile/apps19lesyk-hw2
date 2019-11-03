package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    
    @Test
    public void testPeek() {
        Object[] s = {1, 2, 3, 4, 5};
        Queue q = new Queue(s);
        Object expResult = 1;

        Object actualResult = q.peek();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPeekInEmpty() {
        Queue q = new Queue();

        q.peek();
    }

    @Test
    public void testDequeue() {
        Object[] s = {1, 2, 3, 4, 5};
        Queue q = new Queue(s);
        Object expResult = 2;

        q.dequeue();
        Object actualResult = q.peek();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDequeueInEmpty() {
        Queue q = new Queue();

        q.dequeue();
    }

    @Test
    public void testEnqueue() {
        Object[] s = {1, 2, 3, 4, 5};
        Queue q = new Queue(s);
        Object element = 7;
        Object expResult = 1;

        q.enqueue(element);
        Object actualResult = q.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testEnqueueToEmpty() {
        Queue q = new Queue();
        Object element = 7;
        Object expResult = 7;

        q.enqueue(element);
        Object actualResult = q.peek();

        assertEquals(expResult, actualResult);
    }
}
