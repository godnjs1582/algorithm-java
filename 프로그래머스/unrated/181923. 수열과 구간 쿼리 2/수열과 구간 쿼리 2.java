import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int min = 217800000; // 각 쿼리마다 min 초기화
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < min) {
                    min = arr[j];
                }
            }
            if (min == 217800000) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }
        
        return answer;
    }
}
