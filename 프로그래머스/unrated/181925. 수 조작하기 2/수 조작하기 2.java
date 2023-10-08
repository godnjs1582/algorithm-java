class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=0;i<numLog.length-1;i++){
            int curr=numLog[i];
            int next=numLog[i+1];
            int res=next-curr;
            if(res==1){
                answer=answer+"w";
            }else if(res==-1){
                answer=answer+"s";
            }else if(res==10){
                answer=answer+"d";
            }else{
                answer=answer+"a";
            }
        }
        return answer;
    }
}