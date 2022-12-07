enum Friends{
    OM ,PIYUSH, PRAJYOT, MOTI;
    //Here all the Enum constants are public static final Every constants are the object of the enum Friends as the class loaded the all the objects are created,
    //and therefore the constructors get executed as many times the constants are there.
    Friends(){

        System.out.println("Friends Constructor");

    }

}
public class EnumClassDemo5 {
    public static void main(String [] args){
        Friends f = Friends.MOTI;
        System.out.println("Hello , world");
    }
}
