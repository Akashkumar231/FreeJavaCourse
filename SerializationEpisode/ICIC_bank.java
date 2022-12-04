import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ICIC_bank implements Serializable {
    String Account_HolderName ;
   transient String Password;
    transient int pin;

    ICIC_bank(String name , String pwd , int Pin){
        this.Account_HolderName=name;
        this.Password = pwd;
        this.pin=Pin;
    }
    private void writeObject(ObjectOutputStream os) throws Exception
    {
        os.defaultWriteObject();
        String e_pwd = "7970949652"+Password;
        int e_pin = 1234 + pin;
        os.writeObject(e_pwd);
        os.writeInt(e_pin);
    }

    private void readObject(ObjectInputStream is) throws  Exception{

        is.defaultReadObject();
        String e_pwd = (String) is.readObject();
        Password = e_pwd.substring(10);
        int e_pin=is.readInt();
        pin=e_pin-1234;
    }

}
