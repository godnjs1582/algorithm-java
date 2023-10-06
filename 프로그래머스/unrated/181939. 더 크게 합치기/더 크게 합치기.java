class Solution {
    public int solution(int a, int b) {
        String temp1 = String.valueOf(a)+String.valueOf(b);
        String temp2=String.valueOf(b)+String.valueOf(a);
        int answer = Math.max(Integer.parseInt(temp1),Integer.parseInt(temp2));
        return answer;
    }
}