class Solution {
    public int solution(int a, int b) {
        String sum=String.valueOf(a)+String.valueOf(b);
        int multiple=a*b*2;
        int answer = Math.max(Integer.parseInt(sum),multiple);
        return answer;
    }
}