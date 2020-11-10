public class Stack<T> {
    private final LinkedList<T> linkedlist;

    public Stack() {
        linkedlist = new LinkedList<>();
    }

    public void push(Node<T> value) {
        linkedlist.add(value);
    }

    public void printStack() {
        linkedlist.printNodes();
    }
}
