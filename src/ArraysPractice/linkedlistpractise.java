package ArraysPractice;

public class linkedlistpractise {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
        }
        public node(){};
    }
    public static void main(String[] args) {
        int arr[] ={2,6,8,1,3,2,5};
        node head = constructList(arr);
        printlist(head);
    }
    public static void printlist(node head){
        if(head == null) return;
        node traverse= head;
        while(traverse.next!=null){
            System.out.print(traverse.data+"->");
            traverse = traverse.next;
        }
    }
    public static node constructList(int arr[]){
        node head =null;
        node temppointercreate= null;
        node prevPointer =null;
        for(int i=0;i<arr.length;i++){
            temppointercreate= new node(arr[i]);
            if(head ==null) {
                head = temppointercreate;
                prevPointer = head;
            }
            else {
                prevPointer.next = temppointercreate;
                prevPointer = prevPointer.next;
            }
        }
        return head;
    }
}
