package DataStructures;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int length = arr.length;
        for(int i=0;i<length-1;i++){
            int minIndex =i;
            for(int j=i+1;j<length;j++){
                if(arr[j]<arr[minIndex])
                    minIndex=j;
            }
            int temp  = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i] =temp;
        }
        for(int I:arr){
            System.out.print(I+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5,1,3,2,6};
        selectionSort(arr);
    }
}
