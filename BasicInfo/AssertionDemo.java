import java.util.Scanner;
public class AssertionDemo{
public static void main(String [] args){

int x =Integer.parseInt(args[0]);
assert(x==10) : "The x value should be 10 at this point";
System.out.println(x);
}
}
