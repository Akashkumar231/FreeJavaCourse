import java.io.*;
public class CustomizedSerialization {
    public static void main(String [] args) throws Exception{
        ICIC_bank a1 = new ICIC_bank("Om Chaudhari      ", "Chaudhuri " , 9852);
        ICIC_bank a2 = new ICIC_bank("Piyush Khandalker" , "Khandalker",2112);

        FileOutputStream fos = new FileOutputStream("SerializationExmple.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);
        oos.writeObject(a2);

        FileInputStream fis = new FileInputStream("SerializationExmple.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ICIC_bank a3 =(ICIC_bank) ois.readObject();
        ICIC_bank a4 =(ICIC_bank) ois.readObject();

        System.out.println(a3.Account_HolderName+ " " + a3.Password + " " + a3.pin);
        System.out.println(a4.Account_HolderName+ " " + a4.Password + " " + a4.pin);

/*
        BankOfBaroda b1 = new BankOfBaroda("Akash_Kumar", "7970949652@gmail.com");
        BankOfBaroda b2 = new BankOfBaroda("Prajyot_Karaoke" , "H420" );

        FileOutputStream fos = new FileOutputStream("Abc.txt");
        ObjectOutputStream Oos = new ObjectOutputStream(fos);
        Oos.writeObject(b1);
        Oos.writeObject(b2);

        FileInputStream fis = new FileInputStream("Abc.txt");
        ObjectInputStream Ois = new ObjectInputStream(fis);
        BankOfBaroda b3 = (BankOfBaroda)Ois.readObject();
        BankOfBaroda b4 = (BankOfBaroda)Ois.readObject();

        System.out.println(b3.AccountHolderName + ".........." + b3.Password);
        System.out.println(b4.AccountHolderName + ".........." + b4.Password);

*/


/*

      Account a1 = new Account("Akash_Kumar","7970949652@gmail.com");
      Account a3 = new Account("Prajyot_Karaoke", "H420");

      FileOutputStream fos = new FileOutputStream("Hello.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);            //Serialization
      oos.writeObject(a1);
      oos.writeObject(a3);

      FileInputStream fis = new  FileInputStream("Hello.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);              //Deserialization
      Account a2 = (Account)ois.readObject();
      Account a4 = (Account)ois.readObject();

      System.out.println(a2.user_Name + " " + a2.password);
      System.out.println(a4.user_Name + " " +a4.password );
      System.out.println(a1.password);

 */

    }
}
