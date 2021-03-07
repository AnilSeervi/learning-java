public class StringOperations {
    public static void main(String[] args) {
        String s1 = "Skyword";
        String s2 = "Publishers";
        System.out.println("The length of string "+s1+" is "+s1.length());
        System.out.println("The length of string "+s2+" is "+s2.length());
        System.out.println("Concatenation of two strings: "+s1.concat(s2));
        System.out.println("Character at 2nd positon of "+s1+" is "+s1.charAt(2));
        System.out.println("UpperCase of String "+s1+" is "+s1.toUpperCase());
        System.out.println("LowerCase of String "+s2+" is "+s2.toLowerCase());
        System.out.println("Index of 'y' in String "+s1+" is: "+s1.indexOf('y'));
        System.out.println(s1.substring(3)+" is the substring of "+s1);
        System.out.println("Replacing 'o' with 'a' in String "+s1+" yields: "+s1.replace('o','a'));
        String check = s1.equals(s2)?"Strings are equal":"Strings are unequal";
        System.out.println(s1+" and "+s2+" "+check);
    }
}
