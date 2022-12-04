import java.io.*;

public class Receiver{
public static void main(String [] args) throws Exception{
FileInputStream fis =new  FileInputStream("SerailVersion_UID");
ObjectInputStream  ois = new ObjectInputStream(fis);
Student Akki = (Student)ois.readObject();
System.out.println(Akki.name + " " + Akki.rollNo );
}
}
