package ua.edu.ucu.collections.immutable;

public final class ImmutableArrayList implements ImmutableList {
    private Object[] arrayList;
    private int size;

    public ImmutableArrayList() {
        arrayList = new Object[0];
        size = 0;
    }

    public ImmutableArrayList(Object[] arraySeries) {
        int i = 0;
        arrayList = new Object[arraySeries.length];

        for (Object item : arraySeries) {
            arrayList[i] = item;
            i++;
        }

        size = i;
    }

    @Override
    public ImmutableArrayList addAll(int index, Object[] c) {
        this.checkIndexStrict(index);

        if (size == 0) {
            return new ImmutableArrayList(c);
        } else {
            Object[] newArrayList = new Object[c.length + size];

            System.arraycopy(arrayList, 0, newArrayList, 0, index);
            System.arraycopy(c, 0, newArrayList, index, c.length);
            System.arraycopy(arrayList, index, newArrayList,
                    index + c.length, size - index);
            return new ImmutableArrayList(newArrayList);
        }
    }

    @Override
    public ImmutableArrayList addAll(Object[] c) {
        return this.addAll(size, c);
    }

    @Override
    public ImmutableArrayList add(int index, Object e) {
        this.checkIndexStrict(index);

        Object[] newArrayList = new Object[size + 1];
        System.arraycopy(arrayList, 0, newArrayList, 0, index);
        newArrayList[index] = e;
        System.arraycopy(arrayList, index, newArrayList, index + 1,
                size - index);

        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public ImmutableArrayList add(Object e) {
        return this.add(size, e);
    }

    @Override
    public Object get(int index) {
        this.checkIndexStrict(index);

        return arrayList[index];
    }

    @Override
    public ImmutableArrayList remove(int index) {
        this.checkIndexUnStrict(index);

        Object[] newArrayList = new Object[size - 1];
        System.arraycopy(arrayList, 0, newArrayList, 0, index);
        System.arraycopy(arrayList, index + 1, newArrayList, index,
                size - index - 1);
        for (Object item : newArrayList) {
            System.out.println(item);
        }

        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public ImmutableArrayList set(int index, Object e) {
        this.checkIndexUnStrict(index);

        Object[] newArrayList = new Object[size];
        System.arraycopy(arrayList, 0, newArrayList, 0, size);
        newArrayList[index] = e;

        return new ImmutableArrayList(newArrayList);
    }

    @Override
    public int indexOf(Object e) {
        int i = 0;

        for (Object item : arrayList) {
            if (item.equals(e)) {
                return i;
            }
            i++;
        }

        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];

        System.arraycopy(arrayList, 0, array, 0, size);

        return array;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        int i = 0;

        if (size == 0) {
            return "";
        }

        for (Object item : arrayList) {
            str.append(item);
            if (i < size - 1) {
                str.append(",");
            }
            i++;
        }

        return new String(str);
    }

    private void checkIndexUnStrict(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
    }

    private void checkIndexStrict(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
    }
}
