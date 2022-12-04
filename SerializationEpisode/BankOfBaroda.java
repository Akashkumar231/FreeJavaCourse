import java.io.*;
public class BankOfBaroda implements Serializable{
    String AccountHolderName ;
    String Password;

    BankOfBaroda(String Name , String password){
        this.AccountHolderName = Name;
        this.Password = password;
    }
    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String e_pwd =  "7970"+ Password;
        os.writeObject(e_pwd);
    }
     private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String e_pwd = (String)is.readObject();
        Password = e_pwd.substring(4);
     }
}
