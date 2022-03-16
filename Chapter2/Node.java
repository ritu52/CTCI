package Chapter2;

public class Node<T extends Comparable<T>> {

    private final T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
