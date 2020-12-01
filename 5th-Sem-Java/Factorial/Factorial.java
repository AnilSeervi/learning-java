class Factorial{
    public static void main(String[] args) {
        int fact=1;
        if(args.length==0){
            System.out.println("No Command Line Arguments!!");
            return;
        }
        int num=Integer.parseInt(args[0]);
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}