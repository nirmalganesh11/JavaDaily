package ArraysPractice;

import java.util.LinkedList;
import java.util.*;
import java.math.*;
import java.lang.*;
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
        //node head = constructList(arr);
        //node reversehead = reverseList(head);
        //printlist(reversehead);
        ArrayList<Long> ob  = new ArrayList<Long>();
        while(true){
           ob.add(2343423452545L);
            System.out.println("asdfasdfa");
        }
    }
    public static node removeFirst(node head){
        node temp = head;
        temp = temp.next;
        head = temp;
        return head;
    }
    public static void printlist(node head){
        if(head == null) return;
        node traverse= head;
        while(traverse.next!=null){
            System.out.print(traverse.data+"->");
            traverse = traverse.next;
        }
    }
    public static node removelastelement(node head){
        node temphead = head;
        if(temphead == null) return null;
        if(temphead.next == null) return null;
        while(temphead.next.next!= null){
            temphead = temphead.next;
        }
        temphead.next = null;
        return head;
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
    public static node reverseList(node head){
//        node temp = head;
//        node secondListHead = null;
//        while(temp.next != null){
//            int data = temp.data;
//            if(secondListHead == null){
//                node new_node = new node(data);
//                secondListHead = new_node;
//                continue;
//            }
//            node new_node = new node(data);
//            new_node.next = secondListHead;
//            secondListHead = new_node;
//            temp = temp.next;
//        }
//        return secondListHead;
        if(head == null) return null;
       // node headptr = head;
        node prev = null;
        node curr = head;
        node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        head = prev;
        return head;
    }
}
