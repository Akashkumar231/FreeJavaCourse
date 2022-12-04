import java.io.*;
import java.lang.ClassNotFoundException;

public class Externalization_Demo implements Externalizable {
    String name;
    int age;
     int roll_no;
    public Externalization_Demo(){

         System.out.println("Public No-argument Constructor got Executed");

     }
      Externalization_Demo(String n , int a, int r){
          this.name = n;
          this.age=a;
          this.roll_no=r;
      }

      public void writeExternal(ObjectOutput oo) throws IOException{
          oo.writeObject(this.name);
          oo.writeInt(age);
      }

      public void readExternal(ObjectInput oi) throws IOException,ClassNotFoundException{
          this.name = (String) oi.readObject();
          this.age=oi.readInt();
      }
}
