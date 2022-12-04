class ThreadDemo extends Thread{
public void run(){
for(int i =0 ;i<10 ;i++){
System.out.println("Child Thread");
}
}
}

public class MyThreadDemo {
public static void main(String [] arrays){

ThreadDemo t1= new ThreadDemo();
ThreadDemo t2= new ThreadDemo(){
public void run(){
for(int i =0 ;i<10 ;i++){
System.out.println(" Annonymous1 Child Thread");
}
}
};
ThreadDemo t3= new ThreadDemo(){
public void run(){
for(int i =0 ;i<10 ;i++){
System.out.println(" Annonymous2 Child Thread");
}
}
};
System.out.println(t1.getClass().getName());
System.out.println(t2.getClass().getName());
System.out.println(t3.getClass().getName());
}
}
