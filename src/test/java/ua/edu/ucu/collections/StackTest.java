package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPeek() {
        Object[] s = {1, 2, 3, 4, 5};
        Stack st = new Stack(s);
        Object expResult = 5;

        Object actualResult = st.peek();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPeekInEmpty() {
        Stack st = new Stack();

        st.peek();
    }

    @Test
    public void testPop() {
        Object[] s = {1, 2, 3, 4, 5};
        Stack st = new Stack(s);
        Object expResult = 4;

        st.pop();
        Object actualResult = st.peek();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopInEmpty() {
        Stack st = new Stack();

        st.pop();
    }

    @Test
    public void testPush() {
        Object[] s = {1, 2, 3, 4, 5};
        Stack st = new Stack(s);
        Object element = 7;
        Object expResult = 7;

        st.push(element);
        Object actualResult = st.peek();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testEnqueueToEmpty() {
        Stack st = new Stack();
        Object element = 7;
        Object expResult = 7;

        st.push(element);
        Object actualResult = st.peek();

        assertEquals(expResult, actualResult);
    }
}
