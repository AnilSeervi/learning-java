import java.io.*;
public class Palindrome {
    public static void main(String[] args) throws IOException {
        int d=0,rev=0,num,original;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number to Reverse and check for Palindrome:");
        num=Integer.parseInt(br.readLine());
        original=num;
        while (num>0) {
            d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        System.out.println("Reversed Number is:"+rev);
        if(rev==original){
            System.out.println("Entered Number is Palindrome.");
        }else{
            System.out.println("Entered Number is not a Palindrome.");
        }
    }
}
