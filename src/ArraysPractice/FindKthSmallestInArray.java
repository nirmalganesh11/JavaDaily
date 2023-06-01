////class FrequencyTracker {
////private Map<Integer, Integer> freqMap; // map of number to frequency
////private Map<Integer, Integer> countMap; // map of frequency to count
//
//public FrequencyTracker() {
//        freqMap = new HashMap<>();
//        countMap = new HashMap<>();
//        }
//
//public void add(int number) {
//        int freq = freqMap.getOrDefault(number, 0);
//        int newFreq = freq + 1;
//        freqMap.put(number, newFreq);
//        countMap.put(newFreq, countMap.getOrDefault(newFreq, 0) + 1);
//        if (freq > 0) {
//        countMap.put(freq, countMap.get(freq) - 1);
//        if (countMap.get(freq) == 0) {
//        countMap.remove(freq);
//        }
//        }
//        }
//
//public void deleteOne(int number) {
//        int freq = freqMap.getOrDefault(number, 0);
//        if (freq > 0) {
//        freqMap.put(number, freq - 1);
//        countMap.put(freq, countMap.get(freq) - 1);
//        if (countMap.get(freq) == 0) {
//        countMap.remove(freq);
//        }
//        if (freq > 1) {
//        countMap.put(freq - 1, countMap.getOrDefault(freq - 1, 0) + 1);
//        }
//        }
//        }
//
//public boolean hasFrequency(int frequency) {
//        return countMap.containsKey(frequency);
//        }
package ArraysPractice;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class FindKthSmallestInArray{
    public static void main(String[] args) {
        int arr [] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int k=9;
        int x;
        System.out.println(kthSmallest(arr,k));

        // 20 15 10 7 4

    }
    public static int kthSmallest(int arr[] ,int n){
//        PriorityQueue <Integer> ob = new PriorityQueue<Integer>();
//        for(int i: arr){
//            ob.add(i);
//        }
//        System.out.println(ob);
//        for(int i=0;i<ob.size()-n;i++)
//            ob.poll();
//        return ob.peek();
        Arrays.sort(arr);
        return arr[n-1];
    }
    //first and last occurences of x
    public static ArrayList<Long> find(long arr[], int n, int x)
    {
        long firstIndex =-1;
        long lastIndex =-1;
        int f = arr.length-1;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                firstIndex =i;
                break;
            }

        }
        for(int i=f;i>=0;i++){
            if(arr[i] == x){
                lastIndex =i;
                break;
            }
        }
        ArrayList<Long> ob = new ArrayList<Long>();
        ob.add(firstIndex);
        ob.add(lastIndex);
        return ob;
    }
    //value equal to index
    public static List<Integer> countValueIndex(int arr[]){
        int count =0;
        ArrayList<Integer> ob = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == i+1){
                ob.add(arr[i]);
            }

        }

        return ob;
    }
    //perfect square count in samplespace
    public static int countSquares(int N){
        int count =0;
        int j=1;
        for(int val=1;val<N;j++){
            val = j * j;

            if(val>=N)
                break;
            count++;
        }
        return count;

    }

}
