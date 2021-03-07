public class Cube {
    int length, breadth, height;
    public int volume(){
        return length*breadth*height;
    }
    Cube(){
        length=breadth=height =2;
        System.out.println("Intialized in zero arguments constructor");
    }
    Cube(int a, int b){
        length=a;breadth=b;height=2;
        System.out.println("Intialized in 2 arguments constructor");

    }
    Cube(int a, int b, int c){
        length = a; breadth = b; height = c;
        System.out.println("Intialized in 3 arguments constructor");

    }
    public static void main(String[] args) {
        Cube cube1 = new Cube();
        System.out.println("Volume of cube1: "+cube1.volume());
        cube1 = new Cube(4,3);
        System.out.println("Volume of cube2: "+cube1.volume());
        cube1 = new Cube(3,6,7);
        System.out.println("Volume of cube3: "+cube1.volume());
    }
}
