package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    
    @Test
    public void testToArray() {
        Object[] array = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array);
        Object[] expResult = {1, 2, 3, 4, 5};

        Object[] actualResult = arrayList.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testToString() {
        Object[] array = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array);
        String expResult = "1,2,3,4,5";

        String actualResult = arrayList.toString();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testEmptyToString() {
        ImmutableArrayList arrayList = new ImmutableArrayList();
        String expResult = "";

        String actualResult = arrayList.toString();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testAddAll() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array2 = {7, 8, 9};
        Object[] array3 = {1, 2, 7, 8, 9, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.addAll(2, array2);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAllToTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array2 = {7, 8, 9};
        Object[] array3 = {1, 2, 3, 4, 5, 7, 8, 9};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.addAll(5, array2);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array2 = {7, 8, 9};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);

        arrayList.addAll(10, array2);

    }

    @Test
    public void testAdd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 7, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.add(2, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddToTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 3, 4, 5, 7};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.add(5, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);

        arrayList.add(10, element);

    }

    @Test
    public void testGet() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        Object expResult = 4;

        Object actualResult = arrayList.get(3);

        assertEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);

        arrayList.get(10);

    }

    @Test
    public void testRemove() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array3 = {1, 2, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.remove(2);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testRemoveInTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object[] array3 = {1, 2, 3, 4};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.remove(4);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);

        arrayList.remove(10);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveInEmptySequence() {
        ImmutableArrayList arrayList = new ImmutableArrayList();

        arrayList.remove(0);

    }

    @Test
    public void testSet() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 7, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.set(2, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testSetToTheEnd() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        Object[] array3 = {1, 2, 3, 4, 7};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        ImmutableArrayList result = new ImmutableArrayList(array3);
        Object[] expResult = result.toArray();

        ImmutableArrayList actual = arrayList.set(4, element);
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetWrongIndex() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 7;
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);

        arrayList.set(10, element);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetInEmptySequence() {
        ImmutableArrayList arrayList = new ImmutableArrayList();
        Object element = 7;

        arrayList.set(0, element);

    }

    @Test
    public void testIndexOfFound() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 3;
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        int expResult = 2;

        int actualResult = arrayList.indexOf(element);

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testIndexOfNotFound() {
        Object[] array1 = {1, 2, 3, 4, 5};
        Object element = 12;
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        int expResult = -1;

        int actualResult = arrayList.indexOf(element);

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSize() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        int expResult = 5;

        int actualResult = arrayList.size();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSizeEmpty() {
        ImmutableArrayList arrayList = new ImmutableArrayList();
        int expResult = 0;

        int actualResult = arrayList.size();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        Object[] expResult = new Object[16];

        ImmutableArrayList actual = arrayList.clear();
        Object[] actualResult = actual.toArray();

        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmpty() {
        Object[] array1 = {1, 2, 3, 4, 5};
        ImmutableArrayList arrayList = new ImmutableArrayList(array1);
        boolean expResult = false;

        boolean actualResult = arrayList.isEmpty();

        assertEquals(expResult, actualResult);
    }

    @Test
    public void testIsEmptyForEmpty() {
        ImmutableArrayList arrayList = new ImmutableArrayList();
        boolean expResult = true;

        boolean actualResult = arrayList.isEmpty();

        assertEquals(expResult, actualResult);
    }

}
