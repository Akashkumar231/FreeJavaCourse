import java.util.Date;
public class Main {


    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());

        System.out.println(r.freeMemory());
        for (int i =0;i<1000000;i++){
           Date d = new Date();
           d=null;
        }
        System.out.println(r.freeMemory());
        r.gc();
        System. out.println(r.freeMemory());
/*
     Main m1 = new Main();
     Main m2 = new Main();

     m2=null;
     m1=null;
*/
    }
}