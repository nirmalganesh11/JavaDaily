package wtn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class newarray {
    public static void main(String[] args) {
        int a= 3251;
        int b = 2452;
        int c = 1352;
        //int sum =0;
//        sum =findsum(a)+findsum(b)+findsum(c);
//        //sum = sum+findsum(b);
//        //sum = sum +findsum(c);
//        System.out.println(sum);
        System.out.println(findnum( a, b, c));
    }
    public static int findnum(int a,int b,int c){
            ArrayList<Integer> ob =new ArrayList<Integer>();
            while(a>0){
                int rem  = a%10;
                int rem2 = b%10;
                int rem3 = c%10;
                ob.add(rem);
                ob.add(rem2);
                ob.add(rem3);
                break;
            }
            Collections.sort(ob);
        System.out.println(ob);
            int len =ob.size();
           int tempa =a;
           int tempb =b;
           int tempc =c;
            ArrayList<Integer> ob2 = new ArrayList<Integer>();
            for(int i=0;i<2;i++){
                int rem= tempa%10;
                tempa=tempa/10;
                int rem2 = b%10;
                tempb=tempb/10;
                int rem3 = c%10;
                tempc=tempc/10;
                if(i==1){
                    ob2.add(rem);
                    ob2.add(rem2);
                    ob2.add(rem3);
                }
            }
            Collections.sort(ob2);
        System.out.println(ob2);
            int len2 = ob2.size();
        tempa =a;
         tempb =b;
         tempc =c;
        //System.out.println(a);
        ArrayList<Integer> ob3 = new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            int rem=tempa%10;
            tempa=tempa/10;
            int rem2 = b%10;
            tempb=tempb/10;
            int rem3 = c%10;
            tempc=tempc/10;
            if(i==2){
                ob3.add(rem);
                ob3.add(rem2);
                ob3.add(rem3);
            }
        }

        Collections.sort(ob3);
        System.out.println(ob3);
        int len3 = ob2.size();


        tempa =a;
         tempb =b;
        tempc =c;
        ArrayList<Integer> ob4 = new ArrayList<Integer>();
        for(int i=0;i<4;i++){
            int rem=tempa%10;
            tempa=tempa/10;
            int rem2 = tempb%10;
            tempb=tempb/10;
            int rem3 = c%10;
            tempc=tempc/10;
            if(i==3){
                ob4.add(rem);
                ob4.add(rem2);
                ob4.add(rem3);
            }
        }
        Collections.sort(ob4);
        System.out.println(ob4);
        int len4 = ob4.size();


            String str = "";
            str = str+ob.get(0)+ob2.get(len2-1)+ob.get(0)+ob2.get(len4-1);
            int num =Integer.parseInt(str);
            return num;

    }
//    public static int findsum(int a){
//        ArrayList<Integer> ob = new ArrayList<>();
//        while(a>0){
//            int rem = a%10;
//            ob.add(rem);
//            a=a/10;
//        }
//        Collections.sort(ob);
//        int len= ob.size();
//        return ob.get(len-1)+ob.get(len-2);
//    }

}
