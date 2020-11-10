import org.junit.Assert;
import org.junit.Test;


public class StackWithTDD {

    @Test
    public void givenThreeValuesWhenAddedToStackShouldReturnAsTopOfStack() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Stack<Integer> stack = new Stack<>();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();
        boolean result = thirdNode.getNext().equals(secondNode) &&
                secondNode.getNext().equals(firstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void whenPeekOperationExecutedItMustReturnTopValueOfStack() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Stack<Integer> stack = new Stack<>();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();
        Node<Integer> NodeAtTop = stack.peek();
        System.out.println("Top of the stack is : " + NodeAtTop.getValue());
        Assert.assertEquals(thirdNode, NodeAtTop);
    }

    @Test
    public void whenPopOperationExecutedItMustRemoveValueFromTopOfStack() {
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        Stack<Integer> stack = new Stack<>();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();
        Node<Integer> NodeAtTop = stack.pop();
        System.out.println("Top Value is removed: " + NodeAtTop.getValue());
        stack.printStack();
        Assert.assertEquals(thirdNode, NodeAtTop);
    }
}
