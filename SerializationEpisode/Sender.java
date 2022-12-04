import java.io.*;

public class Sender{
public static void main(String [] args) throws Exception{
Student Akash = new Student();
FileOutputStream fos =new  FileOutputStream("SerailVersion_UID");
ObjectOutputStream  oos = new ObjectOutputStream(fos);
oos.writeObject(Akash);
}
}
