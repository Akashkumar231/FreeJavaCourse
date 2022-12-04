import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.CopyOnWriteArrayList;

/*
class myThread extends Thread{
    static ArrayList arrayList = new ArrayList();
    @Override
   public void run(){
       try {
           Thread.sleep(2000);
       }catch (InterruptedException e){
           System.out.println("OOPs , the thread got interrupted");
       }
       arrayList.add("D");
    }
}
*/

/*
class myThread extends Thread{
    static ConcurrentHashMap m = new ConcurrentHashMap();
    public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        System.out.println("The ConcurrentMap is updated successfully");
            m.put(103,"Come_To_Dubai");
    }
}
*/
public class CollectionConcurrentDemo {
    public static void main(String [] args){
        ArrayList l1 = new ArrayList();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("A");
        l1.add("B");
        l1.add("C");
        ArrayList l2 = new ArrayList();
        l2.add("A");
        l2.add("6");
        l2.add("7");
        l2.add("A");
        l2.add("B");
      CopyOnWriteArrayList al = new CopyOnWriteArrayList();
     al.addAllAbsent(l1);
        System.out.println(al);
        al.addAllAbsent(l2);
        System.out.println(al);
    }
/*
    public static void main(String[] args) throws InterruptedException {
        myThread.m.put(101,"Come to Rcert");
        myThread.m.put(102,"Come to Ballarshah");
        myThread thread =new myThread();
        Set s = myThread.m.keySet();
        Iterator itr = s.iterator();
        Thread.sleep(3000);
        thread.start();
        while (itr.hasNext()){
            Integer I1 = (Integer) itr .next();
            System.out.println("The  value are " + I1 + "kheloll"+myThread.m.get(101));
        }
        System.out.println(myThread.m);
    }
*/
/*
    public static void main(String[] args){
     ConcurrentHashMap chm = new ConcurrentHashMap();
     chm.put(100,"AkashKumar");
     chm.put(101,"PranavKumar");
     chm.put(102,"VinayKumar");
     chm.put(103,"RamKumar");
     chm.putIfAbsent(104,"TomKumar");
     System.out.println(chm);
     chm.putIfAbsent(103,"JerryKumar");
        System.out.println(chm);
        System.out.println(chm.remove(104,"JerryKumar"));
        System.out.println(chm);
        System.out.println(chm.remove(104,"TomKumar"));
        System.out.println(chm);


    }
*/
/*
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        System.out.println(    hashMap.put(101,"Akash")+""+
        hashMap.put(102,"Kumar")+""+
        hashMap.put(103,"Yadav"));
        System.out.println(hashMap);
        System.out.println(   hashMap.put(102,"Bihari"));
    }
    public static void main(String [] args) throws InterruptedException{
        myThread t =new myThread();
        myThread.arrayList.add("Akash");
        myThread.arrayList.add("Kumar");
        myThread.arrayList.add("Yadav");
        myThread.arrayList.add("Akkii");
        t.start();
        Iterator itr = myThread.arrayList.iterator();
        while (itr.hasNext()){
            String s = (String) itr.next();
            Thread.sleep(3000);
        }
    }
*/
}
