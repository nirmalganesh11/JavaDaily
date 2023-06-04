package ArraysPractice;

public class thirdjune {
    public static void main(String[] args) {
        int arr[] = {45,67,23,89,1,3,2};
        findsort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    
    public static void findsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int indexfirst = arr[i];
                int indexsecond = arr[j];
                if(indexfirst >= indexsecond){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
