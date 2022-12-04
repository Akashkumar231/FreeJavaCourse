import java.io.*;
public class Inheritance_Serialization {
    public static void main(String [] args) throws Exception{
        /*
        Son Akash = new Son();

        FileOutputStream fos =new FileOutputStream("Serialization_Demo");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Akash);

        System.out.println("Deserialization Started");

        FileInputStream fis = new FileInputStream("Serialization_Demo");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Son Akki =(Son) ois.readObject();

        System.out.println(Akki.age + " " + Akki.salary );

         */

        /*
        Cat tom = new Cat();

        Cat timmy = new Cat();

        FileOutputStream fos =new FileOutputStream("Serialization_Demo");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tom);
        oos.writeObject(timmy);

        FileInputStream fis = new FileInputStream("Serialization_Demo");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat c1 =(Cat) ois.readObject();
        Cat c2 =(Cat) ois.readObject();

        System.out.println(c1.j + " " + c1.i);
        System.out.println(c2.j + " " + c2.i);

         */
    }
}
