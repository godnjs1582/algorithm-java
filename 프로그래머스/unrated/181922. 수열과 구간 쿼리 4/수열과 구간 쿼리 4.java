import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
            for(int j=0;j<queries.length;j++){
            int s = queries[j][0];
            int e = queries[j][1];
            int k = queries[j][2];
               for(int t=s;t<=e;t++){
                   if(t%k==0){
                       answer[t]=answer[t]+1;
                   }
               }
            }
        return answer;
    }
}