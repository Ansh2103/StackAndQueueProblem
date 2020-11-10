import org.junit.Assert;
import org.junit.Test;

public class QueueWithTDD {
    @Test
    public void givenNumbersWhenAppendToQueued_FirstNodeMustOnTop() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(firstNode);
        queue.enQueue(secondNode);
        queue.enQueue(thirdNode);
        queue.printStack();
        boolean result = firstNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(thirdNode);
        Assert.assertTrue(result);
    }
}
