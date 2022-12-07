//Enum Vs Switch
enum Month{
    Jan , Feb ,Mar,Apr , May , Jun , July ,August,Sept ,Oct ,Nov,December;
}

//After 1.5 version we can use the enum as the parameter in the switch statement.

public class EnumClassDemo1 {
    public static void main(String[] args) {
        Month m1  = Month.Jan;
        switch (m1){
            case Jan :
                System.out.println("The first month is January");
                break;
            case  Feb:
                System.out.println("The second month is February");
                break;
            default:
                System.out.println("This is not valid");
        }
    }
}
