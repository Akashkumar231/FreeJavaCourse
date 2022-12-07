enum Colors{
    Blue{
        public void info(){
            System.out.println("This color is of sky");
        }
    },Red,Green{public void info(){
        System.out.println("Safe Colour");
    }};
    public void info(){
        System.out.println("Dangerous Color");
    }
}
public class EnumClassDemo7 {
    public static void main(String[] args){
        Colors [] colorArray= Colors.values();
        for(Colors c1 : colorArray){
            c1.info();
        }
    }

}
