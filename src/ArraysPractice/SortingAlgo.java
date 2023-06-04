package ArraysPractice;

public class SortingAlgo {
    public static void main(String[] args) {
        int arr[] = {38,29,56,10,15};
        sort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");

    }
    public static void sort(int arr[],int l,int r){
        if(l<r){
            int middle = l+ (r-l)/2;
            sort(arr,l,middle);
            sort(arr,middle+1,r);
            merge(arr,l,middle,r);
        }
    }
    public static void merge(int arr[],int left,int middle, int right){
        int leftsize = middle-left+1;
        int rightsize= right -middle;
        int leftArray[] = new int[leftsize];
        int rightArray[] = new int [rightsize];

        for(int i=0;i<leftsize;i++){
            leftArray[i] = arr[i];
        }
        for(int j=0;j<rightsize;++j){
            rightArray[j] = arr[j+middle+1];
        }
        int k =left;
        int i=0,j=0;
        while(i<leftsize && j<rightsize){
            if(leftArray[i]<= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftsize){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<rightsize){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
