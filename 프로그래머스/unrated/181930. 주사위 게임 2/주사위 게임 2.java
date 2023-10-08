class Solution {
    public double solution(double a, double b, double c) {
        double answer = 0;
        if(a!=b&&a!=c&&b!=c){
            //세 수가 모두 다름 
            answer=a+b+c;
        }else if(a==b&&a==c&&b==c){
            answer=(a+b+c)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
          
        }else{
             answer=(a+b+c)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        }
  
        return answer;
    }
}