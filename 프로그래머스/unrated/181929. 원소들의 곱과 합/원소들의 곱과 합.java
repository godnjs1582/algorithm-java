class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int multiples =1;
        int sum=0;
        for(int i=0;i<num_list.length;i++){
            multiples=multiples*num_list[i];
            sum=sum+num_list[i];
        }
        if(multiples>=Math.pow(sum,2)){
            answer=0;
        }
        return answer;
    }
}