package DataStructures;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int countDigits=0;
        int temp =a;
        while(temp>0){
            countDigits++;
            temp=temp/10;
        }
        int sum =0;
        while(a>0){
            int n= a%10;
            sum = sum+ (n*(int)Math.pow(10,countDigits-1));
            countDigits--;
            a=a/10;
        }
        System.out.println(sum);
    }
}
