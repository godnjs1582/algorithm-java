import java.util.regex.Pattern;
import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<Integer>();
        String pattern = "^[05]+$"; // 수정된 패턴
        
        for (int i = l; i <= r; i++) {
            String[] temp = Integer.toString(i).split("");
            boolean isValid = true;
            
            for (String digit : temp) {
                boolean result = Pattern.matches(pattern, digit);
                if (!result) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                answer.add(i);
            }
        }
        
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
}
