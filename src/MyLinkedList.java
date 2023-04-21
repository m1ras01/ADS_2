public class MyLinkedList<E> {
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

}
