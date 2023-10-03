import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String temp="";
        for(int i=0;i<a.length();i++){
            char text=a.charAt(i);
            if(Character.isLowerCase(text)){
                temp=temp+Character.toUpperCase(text);
            }else{
                 temp=temp+Character.toLowerCase(text);
            }
        }
        System.out.println(temp);
    }
}