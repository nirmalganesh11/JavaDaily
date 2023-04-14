package DataStructures;

import java.util.Arrays;
//rearrange array to have value that range over arr[i] = i;
public class ArrayProblem1 {
    public static void problem1(int arr[]){
        int length = arr.length;
        for(int i=0;i<length;i++){
            int index =i;
            boolean flag  =false;
            for(int j=0;j<length;j++){
                if(index ==arr[j]){
                    int temp = arr[index];
                    arr[index] =arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        for(int I:arr){
            System.out.print(I+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        problem1(arr);
    }
}
