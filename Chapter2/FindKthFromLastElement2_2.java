package Chapter2;

/**
 * Solution of Question number 2.2
 *
     The Linked list representation::: 5 -> 4 -> 1 -> 6 -> 8 ->
     The element at the 2 index from last is 6
     The element at the 3 index from last is 1
     The element at the 4 index from last is 4
 */
public class FindKthFromLastElement2_2 {
    public static void main(String[] args) {
        LinkedList<Integer> llInteger = new LinkedList<>();
        llInteger.addNode(8);
        llInteger.addNode(6);
        llInteger.addNode(1);
        llInteger.addNode(4);
        llInteger.addNode(5);
        llInteger.traverse();
        llInteger.findKthFromLast(2);
        llInteger.findKthFromLast( 3);
        llInteger.findKthFromLast(4);

    }

}
