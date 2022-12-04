class Popcorn{
public void taste(){
System.out.println("Salty in Taste");
}
public void quantity(){
System.out.println("Half Bucket ");
}
}
public class AnnonymousDemo extends Popcorn{
public static void main(String [] args){

Popcorn p = new Popcorn(){
public void taste(){
System.out.println("Sweet  in Taste");
}
};
Popcorn p1= new Popcorn();
Popcorn p2 = new Popcorn(){
public void taste(){
System.out.println("Namkeen in Taste");
}
};
p.taste();
p1.taste();
p2.taste();
System.out.println(p.getClass().getName());
System.out.println(p1.getClass().getName());
System.out.println(p2.getClass().getName());
}
}
