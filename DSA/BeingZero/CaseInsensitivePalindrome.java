import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t =sc.nextInt();
            //sc.nextLine();
            for(int k=0;k<t;k++){
                String str =sc.next().trim();
                String lower=str.toLowerCase();
                char stri[]=lower.toCharArray();
                int start =0;
                int end=stri.length-1;

                while(start<end){
                    char temp=stri[start];
                    stri[start]=stri[end];
                    stri[end]=temp;
                    start++;
                    end--;
                }
                String rev=new String(stri);
                if(lower.equals(rev)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
    }
}
