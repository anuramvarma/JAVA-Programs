import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            String str=sc.next();

            if(isPanagram(str.toLowerCase())){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    private static boolean isPanagram(String str){
        for(char ch='a';ch<='z';ch++){
            if(str.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}
