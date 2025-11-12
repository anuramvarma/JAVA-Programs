import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        //sc.nextline();
        for(int k=0;k<t;k++){
            String str =sc.next();
            char arr[]=str.toCharArray();
            int n = str.length();
            int start=0;
            int end=n-1;
            while(start<end){
                char temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            System.out.println(new String(arr));
        }
    }
}
