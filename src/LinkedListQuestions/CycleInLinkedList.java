package LinkedListQuestions;


import util.Node;

import java.util.HashMap;

public class CycleInLinkedList {


    /**
     * Given a linked list, determine if it has a cycle in it.
     * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
     *
     * @param args
     */
    public static void main(String[] args) {


    }


    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }

        ListNode slowRunner = head;
        ListNode fastRunner = head;

        while(fastRunner != null && fastRunner.next != null){

            fastRunner= fastRunner.next.next;
            if(slowRunner.equals(fastRunner)){
                return true;
            }

            slowRunner = slowRunner.next;


        }


        return false;



    }

    //O(n) space and time
    public boolean hasCycleOKay(ListNode head) {
        HashMap<ListNode, ListNode> map = new HashMap<>();
        ListNode currentNode = head;

        while (currentNode != null) {

            if (map.containsKey(currentNode)) {
                return true;
            } else {
                map.put(currentNode, currentNode);
            }


            currentNode = currentNode.next;


        }
        return false;


    }
}




