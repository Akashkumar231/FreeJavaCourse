import java.io.Serializable;
import java.sql.SQLOutput;

public class Son extends Father implements Serializable {
    int age =10_0000;
    Son(){
        System.out.println("Son class Constructor");
    }

}
