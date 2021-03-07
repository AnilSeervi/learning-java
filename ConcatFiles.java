import java.io.*;
public class ConcatFiles {
    public static void main(String[] args) throws Exception{
        FileInputStream ins1 = new FileInputStream("File1.txt");
        FileInputStream ins2 = new FileInputStream("File2.txt");
        SequenceInputStream s1 = new SequenceInputStream(ins1,ins2);
        int c;
        while((c=s1.read())!=-1){
            char ch = (char)c;
            System.out.print(ch);
        }
        s1.close();
        ins1.close();
        ins2.close();
    }
}
