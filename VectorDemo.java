import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("JAVA");v.add("C++");v.add("C");v.add("DBMS");v.add("VB");
        System.out.println("Vector Elements after adding: "+v.toString());
        System.out.println("The last Element of the Vector is: "+v.lastElement());
        System.out.println("Element at 3 in Vectoris : "+v.elementAt(3));
        v.setElementAt("HTML",2);
        v.setElementAt("CSS",1);
        System.out.println("Vector elements after setting: "+v.toString());
        v.removeElementAt(4);
        System.out.println("Vector Elements after removing element at 4: "+v.toString());
        v.insertElementAt("C++",3);
        System.out.println("Vector Elements after inserting C++: "+v.toString());
        v.remove("DBMS");
        System.out.println("Vector Elements after removing DBMS: "+v.toString());
    }
}
