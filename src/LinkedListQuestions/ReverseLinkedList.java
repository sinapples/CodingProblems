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


        Node prevNode = null;
        Node nextNode = head.next;
        Node currentNode = head;
        while (nextNode != null) {

            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;

            if(nextNode.next == null){
                break;
            }
            currentNode = nextNode;

        }

        nextNode.next = prevNode;
        return nextNode;
    }


}




