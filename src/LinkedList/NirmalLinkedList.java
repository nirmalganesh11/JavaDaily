package LinkedList;

public class NirmalLinkedList {
    public node head = null;
    public class node{
        int val;
        node next;
        public node(int val){
            this.val = val;
        }
    }
    public node push(int val){
        node ob = new node(val);
        ob.next = head;
        head = ob;
        return head;
    }
    public node find(int val){
        node temp = head;
        while(temp!=null){
            if(temp.val ==val)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public void printList(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }
    public int size(node head){
        node temp = head;
        if(head == null)
            return 0;
        int count =0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public node getMiddle(node head){
        //node temp = head;
        //node middle = null;
        if(head ==null)
            return null;
        node slow =head, fast = head;
        while(fast.next !=null && fast.next.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public node sortedMerge(node a,node b){
        node result =null;
        if(a == null)
            return b;
        if(b == null)
            return a;
        if(a.val <=b.val){
            result =a;
            result.next =sortedMerge(a.next,b);
        }else{
            result =b;
            result.next = sortedMerge(a,b.next);
        }
        return result;
    }
    public node mergeSort(node head)
    {
        if(head == null || head.next == null)
            return null;
        //node sizeoflist = size(head);
        node middle = getMiddle(head);
        node nextOfMiddle = middle.next;
        middle.next =null;
        node left = mergeSort(head);
        node right = mergeSort(nextOfMiddle);
        node result = sortedMerge(left,right);
        return result;
    }

}
