package Chapter2;

/**
 * Solution for Question 2.1 for removing duplicates from single linked list.
     * The linked list having duplicates
     * The Linked list representation::: 13 -> 4 -> 1 -> 6 -> 7 -> 6 -> 12 -> 1 ->
     * ----Removing the duplicates using extra SET data structure-----
     * Duplicate node found 6, removing it
     * Duplicate node found 1, removing it
     * The linked list without duplicates
     * The Linked list representation::: 13 -> 4 -> 1 -> 6 -> 7 -> 12 ->
     * -----Removing the duplicates without extra buffer----
     * The linked list without duplicates
     * The Linked list representation::: 13 -> 4 -> 1 -> 6 -> 7 -> 12 ->
     * The linked list having duplicates
     * The Linked list representation::: deer -> pooh -> cat -> tiger -> bat -> mat -> cat ->
     * ----Removing the duplicates using extra SET data structure-----
     * Duplicate node found cat, removing it
     * The linked list without duplicates
     * The Linked list representation::: deer -> pooh -> cat -> tiger -> bat -> mat ->
     * -----Removing the duplicates without extra buffer----
     * The linked list without duplicates
     * The Linked list representation::: deer -> pooh -> cat -> tiger -> bat -> mat ->
 */
public class RemoveDuplicatesFromLinkedList2_1 {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addNode(1);
        ll.addNode(12);
        ll.addNode(6);
        ll.addNode(7);
        ll.addNode(6);
        ll.addNode(1);
        ll.addNode(4);
        ll.addNode(13);
        System.out.println("The linked list having duplicates");
        ll.traverse();
        System.out.println("----Removing the duplicates using extra SET data structure-----");
        ll.removeDuplicates();
        System.out.println("The linked list without duplicates");
        ll.traverse();
        System.out.println("-----Removing the duplicates without extra buffer----");
        ll.removeDuplicatesWithoutBuffer();
        System.out.println("The linked list without duplicates");
        ll.traverse();
        LinkedList<String> llString = new LinkedList<>();
        llString.addNode("cat");
        llString.addNode("mat");
        llString.addNode("bat");
        llString.addNode("tiger");
        llString.addNode("cat");
        llString.addNode("pooh");
        llString.addNode("deer");

        System.out.println("The linked list having duplicates");
        llString.traverse();
        System.out.println("----Removing the duplicates using extra SET data structure-----");
        llString.removeDuplicates();
        System.out.println("The linked list without duplicates");
        llString.traverse();
        System.out.println("-----Removing the duplicates without extra buffer----");
        llString.removeDuplicatesWithoutBuffer();
        System.out.println("The linked list without duplicates");
        llString.traverse();
    }
}
