package DataStructures;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,4,20,3,10,5};
        int sum =33;
        for(int i=0;i<arr.length;i++){
            int initialSum=0;
            int finalIndexStart =i;
            int finalIndexEnd= 0;
            for(int j=i;j<arr.length;j++){
                initialSum = initialSum+arr[j];
                if(initialSum >sum){
                     break;
                }
                if(initialSum == sum){
                    finalIndexEnd =j;
                    break;
                }
            }
            if(finalIndexEnd !=0){
                System.out.println(finalIndexStart +" "+ finalIndexEnd);
                break;
            }
        }
    }
}
