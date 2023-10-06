class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        System.out.println(ineq.equals(">"));
        if(ineq.equals(">")){
             
            if(eq.equals("=")){
                if(n>=m){
                    System.out.println("실행1");
                    answer=1;
                }
                
            }else{
                if(n>m){
                    System.out.println("실행2");
                    answer=1;
                }
            }
        }else {
            if(eq.equals("=")){
                if(n<=m){
                    System.out.println("실행3");
                    answer=1;
                }
            }else{
                
                if(n<m){
                    System.out.println("실행4");
                    answer=1;
                }
            }
        }
            
        return answer;
    }
}