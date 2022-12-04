import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
/*
       Pattern p = Pattern.compile("[^0-9a-zA-Z]"); this will search for all Except alphanumeric
       Matcher m = p.matcher("a3b#k@9z");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." + m.group());
       }
       System.out.println("The total number of Occurrence :" +count);
*/

      /*
       Pattern p = Pattern.compile("[0-9a-zA-Z]"); this will search for all a to z  and A to  Z and  0 to 9
       Matcher m = p.matcher("a3b#k@9z");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." + m.group());
       }
       System.out.println("The total number of Occurrence :" +count);

       */
      /*
       Pattern p = Pattern.compile("[0-9]"); this will search for 0 to 9
       Matcher m = p.matcher("a3b#k@9z");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." + m.group());
       }
 System.out.println("The total number of Occurrence :" +count);
       */

       /*

       Pattern p = Pattern.compile("[A-Z]"); This will search for A to Z
       Matcher m = p.matcher("a3b#k@9z");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." + m.group());
       }
       System.out.println("The total number of Occurrence :" +count);

        */
      /*
       Pattern p = Pattern.compile("[a-z]"); search for the a to z
       Matcher m = p.matcher("a3b#k@9z");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." + m.group());
       }
       System.out.println("The total number of Occurrence :" +count);

       */

       /* Pattern p = Pattern.compile("[^abc]");  Search for everything except a and b and c
       Matcher m = p.matcher("a3b#k@9z");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." + m.group());
       }
       System.out.println("The total number of Occurrence :" +count);

        */

       /*
       Pattern p = Pattern.compile("[abc]"); Search for a or b or c

       Matcher m = p.matcher("a3b#k@9z");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." + m.group());
       }
       System.out.println("The total number of Occurrence :" +count);

        */

/*
       Pattern p = Pattern.compile("ab");
       Matcher m = p.matcher("abbabbba");
       int count=0;
       while(m.find()){
          ++count;
          System.out.println(m.start() + "..." +m.end() + "..." + m.group());
       }
       System.out.println("The total number of Occurrence :" +count);
*/
    }
}