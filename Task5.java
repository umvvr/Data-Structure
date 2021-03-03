package H.W;

import SingluryLinkedList.SLL;

import java.util.Arrays;

public class Task5<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int getSize()
    {
        return size;
    }

    public E getFirst()
    {
        return head.element;
    }

    public E getLast()
    {
        return tail.element;
    }

    public void addFirst(E element)
    {
        head= new Task5.Node<>(element , head);
        if (isEmpty()) tail = head;
        size++;
    }

    public void addLast(E element)
    {
        Task5.Node<E> newest = new Task5.Node<>(element , null);

        if (isEmpty())
        {
            head = newest;
            size++;
        }
        else
            tail.next = newest;
        tail = newest;
        size++;
    }



    public Object[] getElement() {

        Object[] a = new Object[size - 1];
        Node<E> p = head.next;
        int i = 0;

        while (p.next != null) {
            a[i] = p.element;
            p = p.next;
            i++;
        }
        return a;
    }

    public int findSize() {
        int s = 0;
        Node<E> p = head;

        while (p.next != null) {
            s++;
            p = p.next;
        }

        s++;
        return s;
    }

    public void rotate() {

        tail.setNext(head);
        setTail(head);
        setHead(head.next);
    }
//not complete
    public void reverse() {

        Task5.Node<E> prev = null;
        Task5.Node<E> p = head;

        while (p.next != null)
        {
            if (p == head)
            {
                setHead(tail);
                p.next.setNext(tail);
                p = p.next;
            }

            prev = p;
            p = p.next;
            p.next = prev;
        }

    }

    //not complete?
    public Task5<E> merge(Task5<E> L, Task5<E> M) {
        Task5<E> N = L;
        N.setHead(L.getHead());
        N.getTail().setNext(M.getHead());
        N.setTail(M.getTail());

        return N;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node() {
        }

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }

    public static void main(String[] args) {


        Task5<Integer> Task5 = new Task5<>();

        Task5.addFirst(13);
        Task5.addFirst(57);
        Task5.addFirst(36);
        Task5.addLast(99);
        System.out.println(Task5.getFirst());
        System.out.println(Task5.getLast());
        System.out.println(Task5.findSize());

        System.out.println(Arrays.toString(Task5.getElement()));

//        System.out.println(Task5.getFirst());
//        Task5.reverse();
//        System.out.println(Task5.getFirst());


        int s = Task5.findSize();
        for (int i = 0; i < s; i++) {
            System.out.println(Task5.getFirst());
            Task5.rotate();
        }


    }
}
