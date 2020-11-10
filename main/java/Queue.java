public class Queue<T> {
        private final LinkedList<T> linkedlist;

        public Queue() {
            linkedlist = new LinkedList<>();
        }

        public void enQueue(Node<T> value) {
            linkedlist.append(value);
        }

        public void printStack() {
            linkedlist.printNodes();
        }
    }
