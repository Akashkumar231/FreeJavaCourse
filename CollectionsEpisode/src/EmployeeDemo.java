import java.util.*;
public class EmployeeDemo implements Comparable{
    String name;
    int Id;
    int salary;
     EmployeeDemo(String name , int Id, int salary){
        this.name=name;
        this.Id=Id;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return this.name;
    }
    public int compareTo(Object obj){
         int number1 = this.Id;
         int number2 =((EmployeeDemo)obj).Id;
        if (number1>number2){
            return 1;
        }else if(number1<number2)
        {
            return -1;
        }else {
            return 0;
        }
    }
}
