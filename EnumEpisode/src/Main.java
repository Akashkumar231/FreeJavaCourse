/*
In this section we have declare the enum outside the class Main.
enum month{
    Jan, Feb, Mar, April,May , June , July ,August, September, October ,November,December;
    //Here the semicolon is optional.
        }
public class Main {
    public static void main(String[] args) {
        month  m1 = month.Jan;
        month  m2 = month.Feb;
        month  m3 = month.Mar;
        month  m4 = month.April;
        month  m5 = month.May;
        month  m6 = month.June;
        month  m7 = month.July;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);

    }
}
 */

public class Main {
    enum month{
        Jan, Feb, Mar, April,May , June , July ,August, September, October ,November,December;
        //Here the semicolon is optional.
    }
    public static void main(String[] args) {
        month  m1 = month.Jan;
        month  m2 = month.Feb;
        month  m3 = month.Mar;
        month  m4 = month.April;
        month  m5 = month.May;
        month  m6 = month.June;
        month  m7 = month.July;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);

    }
}
