enum month{
    Jan , Feb ,Mar,Apr , May , Jun , July ,August,Sept ,Oct ,Nov,December;
}
//                                      VALUES AND ORDINAL METHODS
public class EnumClassDemo3 {
    public static void main(String[] args) {
        month [] array = month.values(); // values() method is not present in the java.lang.Enum class it is provided by the enum keyword only.
        for (month m : array){
            System.out.println(m);
        }
        for (month m : array){ // ordinal() methods.
            System.out.println(m.ordinal() + "............" + m );
        }

    }
}
