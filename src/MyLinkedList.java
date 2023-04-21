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
}
