enum Beer{
    KF(70),KO(80),RC(90),FO;
    int price;
    Beer(int price){
        this.price = price;
    }
    Beer(){
        this.price=65;
    }
    public  int getPrice(){
        return this.price;
    }
}
public class EnumClassDemo6 {
    public static void main(String [] args){
        Beer [] array = Beer.values();
        System.out.println("Beer No ................ Beer ................Price ");

        for (Beer beer : array){
            System.out.println(beer.ordinal() + "......" +beer + "........" + beer.getPrice());
        }
    }
}
