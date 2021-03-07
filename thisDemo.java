public class thisDemo{
    int i,j;
    thisDemo(){
        this(100);
    }
    thisDemo(int a){
        this(a,20);
    }
    thisDemo(int i, int j){
        this.i=i;
        this.j=j;
    }
    public void display(){
        System.out.println("i= "+i);
        System.out.println("j= "+j);
    }
    public static void main(String[] args) {
        thisDemo t1 = new thisDemo();
        t1.display();
    }
}
