import java.io.*;
public class Area {
    public static double circleArea(double r){
        return Math.PI*r*r;
    }
    public static double rectArea(double length, double breadth) {
        return length*breadth;
    }
    public static double triArea(double base, double height){
        return 0.5*base*height;
    }
    public static String readLine(){
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            input = br.readLine();
        }catch(Exception e){
            System.out.println("Error"+e);
        }
        return input;
    }
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle:");
        double radius = Double.parseDouble(readLine());
        System.out.println("The Area of Circle is: "+circleArea(radius));
        System.out.println("Enter the side of the Square:");
        double side = Double.parseDouble(readLine());
        System.out.println("Area of the Square is: "+rectArea(side,side));
        System.out.println("Enter the length and breadth of Rectangle:");
        double length = Double.parseDouble(readLine());
        double breadth = Double.parseDouble(readLine());
        System.out.println("Area of Rectangle is: "+rectArea(length,breadth));
        System.out.println("Enter the Base and height of the Triangle:");
        double base = Double.parseDouble(readLine());
        double height = Double.parseDouble(readLine());
        System.out.println("Area of Triangle is: "+triArea(base, height));
    }
}
