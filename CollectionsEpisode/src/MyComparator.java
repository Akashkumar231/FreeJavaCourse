import java.util.Comparator;

public class MyComparator implements Comparator {
    public int compare(Object obj1 ,Object obj2 ){
       Integer I1 = (Integer) obj1;
       Integer I2 = (Integer) obj2;
       return -(I1.compareTo(I2));
 //        EmployeeDemo e1 = (EmployeeDemo)obj1;
//        EmployeeDemo e2 =(EmployeeDemo) obj2;
//        int number1 = e1.Id;
//        int number2=e2.Id;
//       return -((EmployeeDemo) obj1).compareTo(obj2);
    }
}
