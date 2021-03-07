public class Prime {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No Arguments Entered");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int i,j;
        for(i=num1;i<=num2;i++){
            for(j=2;j<i;j++){
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.println(i);
        }
    }
}
