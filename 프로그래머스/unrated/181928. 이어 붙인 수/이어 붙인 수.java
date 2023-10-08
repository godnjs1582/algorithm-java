class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddSum="";
        String evenSum="";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                evenSum=evenSum+num_list[i];
            }else{
                oddSum=oddSum+num_list[i];
            }
        }
        answer = Integer.parseInt(evenSum)+Integer.parseInt(oddSum);
        return answer;
    }
}