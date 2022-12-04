import java.util.*;
import java.io.*;

class Demo{
    int i;
    Demo(int i){
        this.i=i;
    }
    public int hashCode(){
        return i;
    }
    public String toString(){
        return i+"";
    }
}

public class Main {

   public static void main(String [] args)throws InterruptedException,IOException
   {
       ArrayList al =new ArrayList();
       al.add(5);
       al.add(8);
       al.add(6);
       al.add(2);
       al.add(10);
       System.out.println(al);
       Collections.reverse(al);
       System.out.println(al);
       Comparator c = Collections.reverseOrder(new MyComparator());
       Collections.sort(al , c);
       System.out.println(al);
       /*
       ArrayList al =new ArrayList();
       al.add(5);
       al.add(8);
       al.add(6);
       al.add(2);
       al.add(10);
       System.out.println(al);
       Collections.sort(al,new MyComparator());
       System.out.println(al);
       System.out.println(Collections.binarySearch(al,10,new MyComparator()));

        */
/*
       PriorityQueue priorityQueue = new PriorityQueue();
       System.out.println(priorityQueue.peek()); // null
       System.out.println(priorityQueue.element()); // java.util.NoSuchElementException
 for (int i =0;i<10;i++){
     priorityQueue.add(i);
 }
       System.out.println(priorityQueue);
       System.out.println(priorityQueue.poll());
       System.out.println(priorityQueue);
*/
/*
       Properties p = new Properties(); //This line will create a java file object.
       FileInputStream fis = new FileInputStream("PropertiesDemo.properties"); // To read from the file name PropertiesDemo.properties
       p.load(fis); //This will load all the Properties from the file to the java Program
       System.out.println(p);
       String s= p.getProperty("password"); // By using this method we will get the password.
       System.out.println(s);
       p.setProperty("Name","AkashKumar"); // This will set the properties and the value to the file name PropertiesDemo.properties
       FileOutputStream fos = new FileOutputStream("PropertiesDemo.properties"); // FileOutputStream file to write the data from the java program to the PropertiesDemo.properties
       p.store(fos,"These changes are made by AkashKumar Yadav");
       */

/*
       Hashtable hash = new Hashtable(25);

      hash.put(new Demo(5),"Loca");
      hash.put(new Demo(3),"HoneySingh");
      hash.put(new Demo(6),"Badshah");
      hash.put(new Demo(15),"King");
      hash.put(new Demo(23),"akash");
      hash.put(new Demo(16),"Hey");
       System.out.println(hash);


 */

/*
       TreeMap tree =new TreeMap(new MyComparator());
       tree.put(101,"Akash");
       tree.put(102,"Akash1");
       tree.put(103,"Akash2");
       tree.put(104,"Akash3");
       tree.put(105,"Akash4");

 */

//       tree.put(null,"Helo");
//       System.out.println(tree);

/*
      Temprory temp = new Temprory();

      WeakHashMap whas = new WeakHashMap<>();
      whas.put(temp,"Akash");
      System.out.println(whas);
      temp =null;
      System.gc();
      Thread.sleep(5000);
      System.out.println(whas);


 */

      /*
      In this the "=="  operator is used for the comparison of the keys in the hashMap
      IdentityHashMap Ihm = new IdentityHashMap();
      Integer I1 =new Integer(10);
      Integer I2 = new Integer(10);
      Ihm.put(I1,"Akash");
      Ihm.put(I2,"Yadav");
      System.out.println(Ihm);

       */
/*
      This uses the .equals() method for comparison of the key value.so the value same in this case therefore there will  be only one
      value of having duplicate key.

      HashMap has = new HashMap();

      Integer I1 = Integer.valueOf(10);
      Integer I2 = Integer.valueOf(10);
      has.put(I1,"Akash");
      has.put(I2,"Yadav");
      System.out.println(has);

 */


/*
      HashMap hsm = new HashMap();

      System.out.println(hsm.put(1,"Akash")+""+
      hsm.put(4,"Yadav")+""+
      hsm.put(3,"Kumar"));

      System.out.println(hsm.);
      System.out.println("It returns the set of the keys of the key value pair "+hsm.keySet());
      System.out.println("It returns the values in the map table "+hsm.values());
      System.out.println("It returns the entrySet of the hashmap table"+hsm.entrySet());
*/
/*
      System.out.println(hsm);
      System.out.println(hsm.remove(3));

      System.out.println("One value is removed from the hashtable");
      System.out.println(hsm);

      System.out.println(hsm.containsKey(4));
      System.out.println("It checks whether it contain the key or not ");

      System.out.println(hsm.containsValue("Akash"));
      System.out.println("Is the entered value is present or not");

      System.out.println(hsm.isEmpty());
      System.out.println("It checks whether the hashmap is empty or not");

      System.out.println(hsm.size());
      System.out.println("It gives the size of the hashmap");

      hsm.clear();
      System.out.println("It clears the whole hashmap");
      System.out.println(hsm);
*/
/*
      TreeSet<EmployeeDemo> treeSet = new TreeSet<EmployeeDemo>();

      EmployeeDemo emp1 = new EmployeeDemo("Akash",5,5_00_000);
      EmployeeDemo emp2 = new EmployeeDemo("Piyush",2,5_00_000);
      EmployeeDemo emp3 = new EmployeeDemo("Prajyot",1,5_00_000);
      EmployeeDemo emp4 = new EmployeeDemo("Omi",3,5_00_000);
      EmployeeDemo emp5 = new EmployeeDemo("Kumar",4,5_00_000);

      treeSet.add(emp1);
      treeSet.add(emp5);
      treeSet.add(emp2);
      treeSet.add(emp3);
      treeSet.add(emp4);
    Iterator itr =treeSet.iterator();
    while (itr.hasNext()){
       System.out.println(itr.next());
    }
*/

/*
      HashSet h =new HashSet();
      h.add("Akash");
      h.add("Kumar");
      h.add("Yadav");
      h.add(45);                      In hashSet duplicates are not allowed and the Insertion order must be preserved
      h.add(45.56f);
      h.add(true);
      System.out.println(h.add("Kumar"));
      System.out.println(h);
*/

/*
      LinkedList Ll = new LinkedList();
      Ll.add("Akashkumar");
      Ll.add("Yadav");
      Ll.add("Kumar");
      Ll.add("Laptop");
      Ll.add("Television");

      System.out.println(Ll);
      ListIterator ltr = Ll.listIterator();
      while (ltr.hasNext()){
         String obj =(String) ltr.next();
         System.out.println(obj);
      }
      System.out.println(ltr.getClass().getName());
*/

/*
      ArrayList al = new ArrayList();
      for (int i =0;i<=10;i++){
         al.add(i);
      }
      System.out.println(al);
      ListIterator li = al.listIterator();
      while(li.hasNext()){
         Integer i = (Integer) li.next();
         if (i%2!=0){
            System.out.println(i);
         }
      }
      System.out.println(al);
*/
/*
      ArrayList arrayLIst= new ArrayList();
      for (int i =0;i<=10;i++){
         arrayLIst.add(i);
      }

      Iterator ITR = arrayLIst.iterator();
      while (ITR.hasNext()){
         int i = (Integer)ITR.next();
         if (i%2!=0){
            ITR.remove();
         }
      }
      System.out.println(arrayLIst);
*/
/*
      Vector v = new Vector(10,4);
      for (int i =0;i<10;i++){
         v.addElement((i+1)*2);
      }
      Enumeration e = v.elements();
      while (e.hasMoreElements()){
         Integer i = (Integer) e.nextElement();
        if (i%3==0){
           System.out.print(i + " ");
        }
      }
      System.out.println(v);
*/
/*
       Stack st =new Stack();
       st.add("AkashKumar");
       st.add("Prajyot");
       st.add("Om");
       st.add("Piyush");
       System.out.println(st);
       System.out.println(st.search("Yadav"));
       System.out.println(st.search("Piyush"));
*/

/*
     Vector v = new Vector(10,4);
    for (int i =0;i<10;i++){
        v.addElement((i+1)*2);
    }
    v.add("Akash");
       System.out.println(v.capacity());

       System.out.println(v);
       System.out.println(v.capacity());
System.out.println(v.size());
*/

/*

       ArrayList al = new ArrayList();
       al.add(45);
       al.add("Akash");
       al.add(45.65);
       al.add('k');
       System.out.println(al); // [45, Akash, 45.65, k]
       System.out.println(al.isEmpty());// False
       al.remove(2);
       System.out.println(al); // [45, Akash, k]
       al.removeAll(al);
       System.out.println(al.isEmpty() + " " + al.size()); // true 0
*/
   }
}