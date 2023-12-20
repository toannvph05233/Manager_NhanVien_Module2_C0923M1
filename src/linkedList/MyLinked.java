package linkedList;

public class MyLinked<E> {
    Node<E> root;
    int size;


    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void delete(int index) {

        if (index == 0){
            root = root.next;
        }
        Node temp = root;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }


}

class Node<E> {
    E e;
    Node<E> next;

    public Node(E e) {
        this.e = e;
    }
}

class Main2 {

    public static void main(String[] args) {

    }
}
