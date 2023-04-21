public class MyLinkedList<E> implements MyList<E> {
    private class Node {
        private E element;
        private Node next;
        private Node prev;
        public Node(E element){
           this.element = element;
           this.next = null;
           this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    MyLinkedList(){
      head = null;
      tail = null;
      size = 0;
    }
    public void add(E element) {
        Node newNode = new Node(element);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode;
        if (index < size/2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size-1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }

        return currentNode.element;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode;
        if (index == 0) {
            currentNode = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (index == size-1) {
            currentNode = tail;
            tail = tail.prev;
            tail.next = null;
        } else {
            if (index < size/2) {
                currentNode = head;
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.next;
                }
            } else {
                currentNode = tail;
                for (int i = size-1; i > index; i--) {
                    currentNode = currentNode.prev;
                }
            }

            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
        }

        size--;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }

    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    public int lastIndexOf(Object o) {
        Node current = head;
        int index = -1;
        int i = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                index = i;
            }
            current = current.next;
            i++;
        }
        return index;
    }

    @Override
    public void sort() {

    }

}
