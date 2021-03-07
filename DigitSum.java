public class DigitSum {
    public static void main(String[] args) {
        int r, sum=0;
        if(args.length==0){
            System.out.println("No arguments Entered");
            return;
        }
        int num = Integer.parseInt(args[0]);
        while(num>0){
            r = num%10;
            sum+=r;
            num/=10;
        }
        System.out.println("Sum of Digits of "+args[0]+" is: "+sum);
    }
}
