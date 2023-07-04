package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReverseListK {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int a = Integer.parseInt(ob.readLine().trim());
        String s[] = ob.readLine().trim().split(" ");
        Node first = new Node(Integer.parseInt(s[0]));
        head = first;
        Node tail = head;
        for(int i=1;i<a;i++){
            int b = Integer.parseInt(s[i]);
            tail.next = new Node(b);
            tail = tail.next;
        }
        int k =  Integer.parseInt(ob.readLine().trim());

        Node rev = reverse(head,k);
        printList(rev);
    }
    public static void printList(Node rev){
        Node temp = rev;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static Node reverse(Node node, int k)
    {
        Node prev = null,curr = node, next = null,temp = node,sechead = node;
        while(k!=0){
            next = curr.next;
            if(k ==1)
                sechead = next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        temp.next = sechead;
        return prev;
    }
}
