import java.io.*;
import java.lang.ClassNotFoundException;

public class Main {
    public static void main(String [] args) throws IOException , ClassNotFoundException{
        Externalization_Demo E = new Externalization_Demo("Akash", 20 , 9);


        FileOutputStream fos= new FileOutputStream("Hello.txt");
        ObjectOutputStream Oos = new ObjectOutputStream(fos);
        Oos.writeObject(E);


        FileInputStream fis = new FileInputStream("Hello.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Externalization_Demo E1 = (Externalization_Demo) ois.readObject();

        System.out.println(E1.name + " " + E1.roll_no + " " + E1.age);

    }
}
