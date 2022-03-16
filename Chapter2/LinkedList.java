package Chapter2;

import java.util.HashSet;

public class LinkedList<T extends Comparable<T>> {

    private Node<T> root;

    public void addNode(T data) {
        if(root==null) {
            root = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            newNode.setNextNode(root);
            root = newNode;
        }
    }

    public void traverse() {
        Node<T> node = root;
        while (node != null) {
            System.out.print(node.getData()+ " -> ");
            node = node.getNextNode();
        }
        System.out.println(" ");
    }

    public void removeDuplicates() {
        HashSet<T> duplicates = new HashSet<>();
        Node<T> node = root;
        while (node != null) {
            if(!duplicates.contains(node.getNextNode().getData())) {
                duplicates.add(node.getData());
            } else {
                System.out.printf("Duplicate node found %s, removing it %n", node.getNextNode().getData());
                Node<T> nextNode = node.getNextNode().getNextNode();
                node.setNextNode(nextNode);
            }
            node = node.getNextNode();
        }
    }

    public void removeDuplicatesWithoutBuffer() {
        Node<T> node = root;
        while (node != null) {
            Node<T> runner = node;
            while(runner.getNextNode() != null) {
                if(runner.getNextNode().getData() == node.getData()) {
                    runner = runner.getNextNode().getNextNode();
                } else {
                    runner = runner.getNextNode();
                }
            }
            node = node.getNextNode();
        }
    }
}
