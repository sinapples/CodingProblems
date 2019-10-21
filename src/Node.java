package util;

public class Node<T> {

   public T data;
   public Node<T> next;


   public Node (){

   }
   public Node (T data){
       this.data = data;
   }
   public Node (T data, Node<T> node){
       this.data = data;
       this.next = node;
   }


   public static Node newLinkedList (){


       String[] data ={"zero", "one", "two", "three" , "four", "five"};

       Node<String> head = new Node<>(data[0]);
       Node<String> node = head;

       for (int i = 1; i < data.length; i++){
            node.next =  new Node<>(data[i]);
            node = node.next;

       }

       return head;

   }




   public String print(){

       Node<T> node = this;
String ret = "";
       while(node !=null){
         ret = ret+ "["+node.data +"] -> ";
       node = node.next;
       }

       return ret;




   }

    @Override
    public String toString() {
        return print();
    }
}




