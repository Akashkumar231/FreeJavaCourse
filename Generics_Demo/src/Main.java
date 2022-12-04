import java.util.*;

public class Main<TypeParameter extends Number> {
    public static void main(String [] args){
        ArrayList<Integer>  arrayList = new ArrayList<Integer>();
        arrayList.add(45);//    public void method1(){
//        System.out.println(obj.getClass().getName());
//    }
        arrayList.add(65);
        arrayList.add(65);
        arrayList.add(85);
        Test.wildCardsMethods(arrayList);
        ArrayList<String> arrayString  = new ArrayList<String>();
        arrayString.add("Akash");
        arrayString.add("Kumar");
        arrayString.add("Yadav");
        arrayString.add("Tuglaq");
        arrayString.add("Replace It");
        Test.wildCardsMethods(arrayString);
        /* ArrayList al = new ArrayList();
        al.add(0);
        al.add("Hello, Fella");
        String name = (Integer)al.get(0); //incompatible types: java.lang.Integer cannot be converted to java.lang.String

        */
      /*  ArrayList<String> StringArray = new ArrayList<>();
        StringArray.add("Akash");
        StringArray.add("Array");
//        StringArray.add(45);
         StringArray.add("LUV, KUSH");

       */
    /*  ArrayList<Integer>  al = new ArrayList<Integer>();
      al.add(45);
      al.add("String");


     */

//        Test<Thread>  test1 = new Test<Thread>();
//        Test<Runnable> test2 = new Test<Runnable>();
        /*

          Test<String> test3 = new Test<String>();java: type argument java.lang.String is not within bounds of type-variable T
          Main<Integer> m = new Main<Integer>();
          Main<String>  m1  = new Main<String>(); //This will give Runtime Error java: type argument java.lang.String is not within bounds of type-variable T
    */
    }
/*
    public static void main(String[] args)
    {
       ArrayList al = new ArrayList();
       al.add(45);
       al.add("Kumar");       // This program is not type safe and type casting is the biggest problem in this.
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
*/
}