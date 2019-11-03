package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList {
    private Node arrayList;
    private int size;

    public ImmutableLinkedList() {
        arrayList = new Node();
        size = 0;
    }

    public ImmutableLinkedList(Object[] arraySeries) {
        int i = 0;
        int ind2 = arraySeries.length - 1;
        arrayList = new Node();
        Object[] lst = new Object[arraySeries.length];

        for (int k = 0; k < arraySeries.length; k++) {
            lst[k] = arraySeries[ind2];
            ind2--;
        }

        for (Object item : lst) {
            arrayList.setData(item);
            if (i < lst.length - 1) {
                arrayList = new Node(null, arrayList);
            }
            i++;
        }

        size = i;
    }

    public ImmutableLinkedList addAll(int index, Object[] c) {
        this.checkIndex2(index);

        if (size == 0) {
            return new ImmutableLinkedList(c);
        } else {
            Object[] newArrayList = new Object[c.length + size];
            Object[] arr = this.toArray();

            System.arraycopy(arr, 0, newArrayList, 0, index);
            System.arraycopy(c, 0, newArrayList, index, c.length);
            System.arraycopy(arr, index, newArrayList, index + c.length,
                    size - index);
            return new ImmutableLinkedList(newArrayList);
        }
    }

    public ImmutableLinkedList addAll(Object[] c) {
        return this.addAll(size, c);
    }

    public ImmutableLinkedList add(int index, Object e) {
        this.checkIndex2(index);

        Object[] newArrayList = new Object[size + 1];
        Object[] arr = this.toArray();

        System.arraycopy(arr, 0, newArrayList, 0, index);
        newArrayList[index] = e;
        System.arraycopy(arr, index, newArrayList, index + 1, size - index);

        return new ImmutableLinkedList(newArrayList);
    }

    public ImmutableLinkedList add(Object e) {
        return this.add(size, e);
    }

    public Object get(int index) {
        this.checkIndex1(index);

        Node nd = arrayList;
        Object element = nd.getData();
        for (int i = 0; i <= index; i++) {
            element = nd.getData();
            nd = nd.getNext();
        }
        return element;
    }

    public ImmutableLinkedList remove(int index) {
        this.checkIndex1(index);

        Object[] newArrayList = new Object[size - 1];
        Object[] arr = this.toArray();

        System.arraycopy(arr, 0, newArrayList, 0, index);
        System.arraycopy(arr, index + 1, newArrayList, index, size - index - 1);

        return new ImmutableLinkedList(newArrayList);
    }

    public ImmutableLinkedList set(int index, Object e) {
        this.checkIndex1(index);

        Object[] arr = this.toArray();
        arr[index] = e;

        return new ImmutableLinkedList(arr);
    }

    public int indexOf(Object e) {
        int i = 0;
        Node nd = arrayList;

        while (i < size) {
            if (nd.getData() == e) {
                return i;
            }
            nd = nd.getNext();
            i++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public ImmutableLinkedList clear() {
        return new ImmutableLinkedList();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        int i = 0;
        Node nd = arrayList;

        if (size == 0) {
            return "";
        }

        while (i < size) {
            str.append(nd.getData());
            if (i < size - 1) {
                str.append(",");
            }
            nd = nd.getNext();
            i++;
        }

        return new String(str);
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        Node nd = arrayList;

        for (int i = 0; i < size; i++) {
            array[i] = nd.getData();
            nd = nd.getNext();
        }

        return array;
    }

    public ImmutableLinkedList addFirst(Object e) {
        return this.add(0, e);
    }

    public ImmutableLinkedList addLast(Object e) {
        return this.add(size, e);
    }

    public Object getFirst() {
        return this.get(0);
    }

    public Object getLast() {
        return this.get(size - 1);
    }

    public ImmutableLinkedList removeFirst() {
        return this.remove(0);
    }

    public ImmutableLinkedList removeLast() {
        return this.remove(size - 1);
    }

    private void checkIndex1(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
    }

    private void checkIndex2(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
    }
}
