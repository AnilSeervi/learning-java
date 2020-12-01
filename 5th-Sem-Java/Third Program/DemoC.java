class DemoA{
    static void methodA(){
        System.out.println("methodA in DemoA");
    }
}
class DemoB{
    static void methodB(){
        System.out.println("methodB in DemoB");
    }
}
class DemoC{
    static void methodC(){
        System.out.println("methodC in DemoC");
    }
    public static void main(String[] args) {
        DemoA.methodA();
        DemoB.methodB();
        DemoC.methodC();
    }
}