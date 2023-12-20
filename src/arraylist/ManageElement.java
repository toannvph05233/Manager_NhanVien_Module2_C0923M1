package arraylist;

// đại diện cho 1 KDL: e extends Object - tức phải truyền class
public class ManageElement<E> {
    private Object[] element = new Object[5];
    private int size;

    public void add(E num) {
        if (size == element.length) {
            newArrayAdd();
        }
        element[size] = num;
        size++;
    }

    public E get(int index) {
        return (E) element[index];
    }

    public int size() {
        return size;
    }

    public void delete(int index) {
        for (int i = index; i < size ; i++) {
            element[i] = element[i+1];
        }
        size--;
    }

    public void newArrayAdd() {
        Object[] newArray = new Object[element.length * 2];
        for (int i = 0; i < element.length; i++) {
            newArray[i] = element[i];
        }
        element = newArray;
    }

    public void edit(int index, E numNew) {
        element[index] = numNew;
    }


}
