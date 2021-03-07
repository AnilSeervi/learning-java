public class Sort {
    public static void main(String[] args) {
        int a[] = new int[10];
        if(args.length<2){
            System.out.println("Insufficient Arguments");
            return;
        }
        try{
            for(int i=0;i<args.length;i++)
            a[i] = Integer.parseInt(args[i]);
            System.out.println("Before Sorting");
            for(int i=0;i<args.length;i++)
            System.out.println(a[i]);
            bubbleSort(a,args.length);
            System.out.println("After Sorting");
            System.out.println("Ascending Order");
            for(int i=0;i<args.length;i++)
            System.out.println(a[i]);
            System.out.println("Descending Order");
            for(int i=args.length-1;i>=0;i--)
            System.out.println(a[i]);
        }catch(NumberFormatException e){
            System.out.println("Enter Only Integers");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter within a range of 10 numbers");
        }
    }
    private static void bubbleSort(int[] arr, int len){
        int temp,i,j;
        for(i=0;i<len-1;i++)
        for(j=0;j<len-1-i;j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
            }
        }
    }
}
