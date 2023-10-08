class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(int i=0;i<control.length();i++){
             char target=control.charAt(i);
            if(target=='w'){
                answer++;
            }else if(target=='s'){
                answer--;
            }else if(target=='d'){
                answer+=10;
            }else{
                answer-=10;
            }
        }
       
       
        return answer;
    }
}