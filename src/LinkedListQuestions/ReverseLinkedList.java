package LinkedListQuestions;


import util.Node;

public class ReverseLinkedList {


    /**
     * Q: Reverse a Linked list given a Node
     * See Nodeclass
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("moo World!");

        Node<String> head = Node.newLinkedList();
        System.out.println("Original list");
        System.out.println("\t" + head);


        Node<String> newHead = answer(head);
        System.out.println("Reverse list");
        System.out.println("\t" + newHead);


    }

    private static Node answer(Node head) {

        return null;
    }


}




