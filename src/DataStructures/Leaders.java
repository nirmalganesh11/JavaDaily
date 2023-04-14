package DataStructures;

public class Leaders {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        for(int i=0;i<arr.length;i++){
            int num  = arr[i];
            int flag =0;
            for(int j=i;j<arr.length;j++){
                if(num <arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag ==0)
                System.out.println(num+" ");
        }
    }
}
