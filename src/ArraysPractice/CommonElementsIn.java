package ArraysPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsIn  {
    public static void main(String[] args) {
            int  mat[][] = new int[][] {{1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9},
        };
        System.out.println(findCommonElementInAllRows(mat));

    }
    public static List<Integer> findCommonElementInAllRows(int mat[][]){
        List<Integer> ob= new ArrayList<Integer>();
        int rows = mat.length;
        int columns = mat[0].length;
        for(int i=0;i<columns;i++){
            int num = mat[0][i];
            boolean flag = true;
            for(int j=1;j<rows;j++){
                boolean rowFlag = false;
                for(int k=0;k<columns;k++){
                    if(mat[j][k]==num){
                        rowFlag = true;
                        break;
                    }
                }
                if(rowFlag == false){
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                ob.add(num);
        }
        ob = ob.stream().distinct().collect(Collectors.toList());
        return ob;
    }

}
