interface abc{
    public void functionx();
}
interface def{
    public void functiony();
}
interface pqr extends abc, def{
    public void functionz();
}
class tuv implements pqr{
   public void functionx(){
        System.out.println("FunctionX");
    }
   public void functiony(){
        System.out.println("FunctionY");
    }
   public void functionz(){
        System.out.println("FunctionZ");
    }
}
class MultipleDemo{
    public static void main(String[] args) {
        tuv t1 = new tuv();
        t1.functionx();
        t1.functiony();
        t1.functionz();
    }
}