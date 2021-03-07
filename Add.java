public class Add {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("No arguments Entered");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Sum of "+num1+" and "+num2+" is: "+(num1+num2));
    }
}
