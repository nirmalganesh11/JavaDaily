package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class Matrixspiral {
    public static void main(String[] args) {
        int arr [][] = {
                { 1,2,3,4,5,6}, {7,8,9,10,11,12},{13,14,15,16,17,18}, {19,20,21,22,23,24}
        };
        System.out.println(spiraltraversal(arr));
    }
    public static List<Integer> spiraltraversal (int arr[][]){
        List<Integer> ob = new ArrayList<>();
        int rowStart =0;
        int rowEnd = arr.length-1;
        int colStart =0;
        int colEnd = arr[0].length-1;
        while(rowStart<= rowEnd && colStart <= colEnd){
            for(int i=colStart;i<=colEnd;i++){
                System.out.print(arr[rowStart][i]+" ");
            }
            rowStart = rowStart+1;
            //System.out.println(arr[1][5]);
            for (int i =rowStart; i<=rowEnd; i++) {
                System.out.print(arr[i][colEnd]+" ");
            }
            colEnd = colEnd -1;
            //rowEnd = rowEnd -1;
            if(rowStart <= rowEnd){
                for(int i=colEnd;i>=colStart;i--){
                    System.out.print(arr[rowEnd][i]+" ");
                }
                rowEnd = rowEnd -1;
            }

            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    System.out.print(arr[i][colStart]+" ");
                }
                colStart =colStart+1;
            }
        }
        return ob;
    }
}
