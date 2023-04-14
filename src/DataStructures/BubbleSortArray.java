package DataStructures;

public class BubbleSortArray {
    public static void bubbleSort(int arr[]){
        int length = arr.length;
        for(int i=0;i<length -1;i++){
            for(int j =0;j<length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,4,2,6,3,5};
        bubbleSort(arr);
    }

}
