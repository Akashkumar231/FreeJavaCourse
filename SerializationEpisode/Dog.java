import java.io.Serializable;

public class Dog implements Serializable {
    int i ;
    int j ;
    Dog(int i , int j){
        this.i=i;
        this.j=j;
    }
    public void method1(){
        System.out.print(this.i +" " + this.j);
    }
}
