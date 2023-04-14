package DataStructures;

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> a = new HashSet<Character>();
        char []arr = str.toCharArray();
        for(char c:arr){
            a.add(c);
        }
        System.out.println(a);
        for(char c:arr){
            System.out.println(c);
            if(a.contains(c))
                continue;
            else {
                System.out.println(c);
                break;
            }
        }
    }

}