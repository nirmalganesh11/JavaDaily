package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastInput {
    static class FastInputShit{
        BufferedReader br;
        StringTokenizer st;
        public FastInputShit(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        String nextLine(){
            String s = "";
            try {
                s = new String(br.readLine());
            }catch (IOException e){
                e.printStackTrace();
            }
            return s;
        }
        int nextInt(){
            int s = Integer.parseInt(next());
            return s;
        }
        long nextLong(){
            long a = Long.parseLong(next());
            return a;
        }


    }
    public static void main(String[] args) {
            FastInputShit a = new FastInputShit();
            System.out.println(a.nextInt());
    }




}
