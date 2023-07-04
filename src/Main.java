import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public void addNode(int data){

    }
    public static Scanner sc = new Scanner(System.in);
    public static List<Integer> ob =new LinkedList<Integer>();
    public static void main(String[] args) {
        while(true){
            System.out.println("1. add a number to linkedlist ");
            System.out.println("2.Display LinkedList");
            int t = sc.nextInt();
            if(t==1) {
                System.out.println("add a number");
                int a = sc.nextInt();
                ob.add(a);

            }
            if(t==2)
                    System.out.println(ob.toString());
        }
    }
}