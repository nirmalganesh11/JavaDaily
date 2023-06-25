package LinkedList;
import LinkedList.NirmalLinkedList;

public class mergesortlinkedlist {
    public static void main(String[] args) {
        NirmalLinkedList ob = new NirmalLinkedList();
        ob.push(15);
        ob.push(10);
        ob.push(11);
        //ob.printList();
        ob.mergeSort(ob.head);
        ob.printList();
    }
}
