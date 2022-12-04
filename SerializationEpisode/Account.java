import java.io.Serializable;

public class Account implements Serializable {
    String user_Name;
    transient String password ;

    Account(String username , String password){
        this.user_Name=username;
        this.password = password;
    }
}
