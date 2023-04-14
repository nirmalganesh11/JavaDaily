package DataStructures;
//move all zeroes to end of array
public class ArrayProblem2 {
    public static void problem2(int arr[]){
        int length  = arr.length;
        int i=0,j=length-1;
        while(i<j)
        {
            if(arr[i] ==0){
                if(arr[j]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                }else{
                    j--;
                }
            }else i++;
        }
        for(int I:arr){
            System.out.print(I+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 0, 4, 6, 0, 9, 0, 8};
        problem2(arr);
    }
}
