import java.io.*;

public class Serialization_Demo  {
    public static void main(String [] args) throws IOException,ClassNotFoundException{
        Dog  d1 = new Dog(10,20);

        FileOutputStream f1 = new FileOutputStream("Serialization_Demo");
        ObjectOutputStream o = new ObjectOutputStream(f1);
        o.writeObject(d1);

        FileInputStream f2 = new FileInputStream("Serialization_Demo");
        ObjectInputStream i = new ObjectInputStream(f2);
        Dog d2= (Dog)i.readObject();

        System.out.println(d2.i + " " +d2.j);
    }
}
