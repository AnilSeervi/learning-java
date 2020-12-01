import java.io.*;
class SumDigit{
    public static void main(String[] args) throws IOException {
        int r, sum=0,num;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number:");
        num=Integer.parseInt(br.readLine());
        while(num>0){
            r=num%10;
            sum+=r;
            num/=10;
        }
        System.out.println("Sum of Digits is:"+sum);
    }
}