class First{
    First(){
        System.out.println("Default constructor of First Class");
    }
    First(int a){
        System.out.println("Parameterized constructor of First Class");
    }
}
class Second extends First{
    Second(){
        System.out.println("Default constructor of Second Class");
    }
    Second(int a){
        super(a);
        System.out.println("Parameterized constructor of Second Class");
    }
}
class Third extends Second{
    Third(){
        System.out.println("Default constructor of Third Class");
    }
    Third(int a){
        super(a);
        System.out.println("Parameterized constructor of Third Class");
    }
    public static void main(String[] args) {
        Third t1 = new Third();
        t1 = new Third(100);
    }
}
