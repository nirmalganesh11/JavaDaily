package ArraysPractice;

public class averageofnumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(findaverage(arr));
    }
    public static float findaverage(int arr[]){
        int sum =0;
        float avg =0;
        for(int a:arr){
            sum =sum+a;
        }
        int len = arr.length;
        avg =sum/len;
        return Math.round(avg);

    }
}

