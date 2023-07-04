package JavaMisc;

import java.util.PriorityQueue;
import java.util.Queue;

public class wordladder {
    public static void main(String[] args) {
        Queue<Integer> ob = new PriorityQueue<>();
        ob.add(1);
        ob.add(10);
        ob.add(2);
        ob.add(34);
        for(int a:ob){
            System.out.println(ob.poll());
        }

    }

}
