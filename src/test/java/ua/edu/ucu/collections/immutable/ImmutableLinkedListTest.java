package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testToArray() {
        Object[] array = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array);
        Object[] expResult = {1, 2, 3, 4, 5};

        Object[] actualResult = arrayList.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testToString() {
        Object[] array = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array);
        String expResult = "1,2,3,4,5";

        String actualResult = arrayList.toString();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testEmptyToString() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();
        String expResult = "";

        String actualResult = arrayList.toString();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testAddAll() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array2 = {7, 8, 9};
        Object[] array3 = {1, 2, 7, 8, 9, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.addAll(2, array2);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAllToTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array2 = {7, 8, 9};
        Object[] array3 = {1, 2, 3, 4, 5, 7, 8, 9};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.addAll(5, array2);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAllWithoutIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array2 = {7, 8, 9};
        Object[] array3 = {1, 2, 3, 4, 5, 7, 8, 9};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.addAll(array2);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array2 = {7, 8, 9};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);

        arrayList.addAll(10, array2);

    }

    @Test
    public void testAdd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 7, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.add(2, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddToTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 3, 4, 5, 7};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.add(5, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);

        arrayList.add(10, element);

    }

    @Test
    public void testAddWithoutIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 3, 4, 5, 7};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.add(element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGet() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        Object expResult = 4;

        Object actualResult = arrayList.get(3);

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);

        arrayList.get(10);

    }

    @Test
    public void testRemove() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array3 = {1, 2, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.remove(2);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testRemoveInTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array3 = {1, 2, 3, 4};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.remove(4);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);

        arrayList.remove(10);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveInEmptySequence() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();

        arrayList.remove(0);

    }

    @Test
    public void testSet() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 7, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.set(2, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testSetToTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 3, 4, 7};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.set(4, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);

        arrayList.set(10, element);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetInEmptySequence() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();
        Object element = 7;

        arrayList.set(0, element);

    }

    @Test
    public void testIndexOfFound() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 3;
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        int expResult = 2;

        int actualResult = arrayList.indexOf(element);

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testIndexOfNotFound() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 12;
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        int expResult = -1;

        int actualResult = arrayList.indexOf(element);

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSize() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        int expResult = 5;

        int actualResult = arrayList.size();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSizeEmpty() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();
        int expResult = 0;

        int actualResult = arrayList.size();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        Object[] expResult = new Object[0];

        ImmutableLinkedList actual = arrayList.clear();
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmpty() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        boolean expResult = false;

        boolean actualResult = arrayList.isEmpty();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmptyForEmpty() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();
        boolean expResult = true;

        boolean actualResult = arrayList.isEmpty();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testAddFirst() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {7, 1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.addFirst(element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddFirstToEmpty() {
        Object element = 7;
        Object[] array3 = {7};
        ImmutableLinkedList arrayList = new ImmutableLinkedList();
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.addFirst(element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddLast() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 3, 4, 5, 7};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.addLast(element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddLastToEmpty() {
        Object element = 7;
        Object[] array3 = {7};
        ImmutableLinkedList arrayList = new ImmutableLinkedList();
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.addLast(element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testGetFirst() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        Object expResult = 1;

        Object actualResult = arrayList.getFirst();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFirstInEmpty() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();

        arrayList.getFirst();
    }

    @Test
    public void testGetLast() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        Object expResult = 5;

        Object actualResult = arrayList.getLast();

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetLastInEmpty() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();

        arrayList.getLast();
    }

    @Test
    public void testRemoveLast() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array3 = {1, 2, 3, 4};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.removeLast();
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveLastInEmpty() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();

        arrayList.removeLast();
    }

    @Test
    public void testRemoveFirst() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array3 = {2, 3, 4, 5};
        ImmutableLinkedList arrayList = new ImmutableLinkedList(array1);
        ImmutableLinkedList result = new ImmutableLinkedList(array3);
        Object[] expResult = result.toArray();

        ImmutableLinkedList actual = arrayList.removeFirst();
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFirstInEmpty() {
        ImmutableLinkedList arrayList = new ImmutableLinkedList();

        arrayList.removeFirst();
    }
}
