class Solution {
    public String solution(String code) {
        String mode ="0";
        String answer = "";
        for(int i=0;i<code.length();i++){
             char target=code.charAt(i);
      
            if(mode=="0"){
                if(target=='1'){
                
                    mode="1";
                   
                }else{
                    if(i%2==0){
                       
                        answer=answer+target;
                     
                    }
                }
                
            }else{
                if(target=='1'){
          
                    mode="0";
                    
                }else{
                    if(i%2!=0){
                       
                        answer=answer+target;
                    }
                }
                
            }
        }
        if(answer=="") return "EMPTY";
        return answer;
    }
}