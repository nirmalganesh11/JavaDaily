package DataStructures;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        int countDigits=0;
        int numb =a;
        while(numb>0){
            countDigits++;
            numb= numb/10;
        }
        while(a>0){
            int n = a%10;
            sum = sum+(int) Math.pow(n,countDigits);
            a=a/10;
        }
        System.out.println(sum);
    }
}
