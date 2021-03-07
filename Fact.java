public class Fact {
    public static void main(String[] args) {
        int arr[] = new int[10];
        if(args.length==0){
            System.out.println("No Arguments Entered");
            return;
        }
        for(int i=0;i<args.length;i++)
        arr[i] = Integer.parseInt(args[i]);
        for(int i=0;i<args.length;i++){
            int fact =1;
            while(arr[i]>0){
                fact*=arr[i];
                arr[i]--;
            }
            System.out.println("Factorial of "+args[i]+" is "+fact);
        }
    }
}