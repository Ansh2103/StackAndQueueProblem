
    public class LinkedList<T> {
        public Node<T> head;
        public Node<T> tail;

        public LinkedList() {
            this.head = null;
            this.tail = null;
        }

        public boolean isEmpty() {
            if(this.tail == null && this.head == null) {
                return true;
            }
            return false;
        }

        public void add(Node<T> newNode) {
            if(isEmpty()) {
                this.tail = newNode;
                this.head = newNode;
            }
            else {
                Node<T> tempNode = this.head;
                this.head = newNode;
                this.head.setNext(tempNode);
            }
        }

        public void printNodes() {
            StringBuffer myNodes = new StringBuffer();
            if(isEmpty()) {
                return;
            }
            Node<T> tempNode = this.head;
            while(tempNode.getNext() != null) {
                myNodes.append(tempNode.getValue());
                if(!tempNode.equals(this.tail)) {
                    myNodes.append("->");
                }
                tempNode = tempNode.getNext();
            }
            myNodes.append(tempNode.getValue());
            System.out.println(myNodes);
        }
        public Node<T> pop() {
            Node<T> tempNode = this.head;
            if(head.equals(tail)) {
                this.tail = null;
                this.head = null;
                return tempNode;
            }
            this.head = head.getNext();
            return tempNode;
        }

        public void append(Node<T> newNode) {
            if(isEmpty()) {
                this.tail = newNode;
                this.head = newNode;
            }
            else {
                this.tail.setNext(newNode);
                this.tail = newNode;
            }
        }

    }