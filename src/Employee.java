import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Employee 
{
    String name;
    String design;
    int salary;
    static String company = "ExcelR";
    
    Employee(String emp_name,String desg,int sal){
        this.name= emp_name;
        this.design=desg;
        this.salary = sal;
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Employee name ");
        String emp_name = scn.next();

        System.out.println("Enter Employee Designation");
        String desg = scn.next();

        System.out.println("Enter Employee salary");
        int sal = scn.nextInt();
        
        Employee e =new Employee(emp_name,desg,sal);
        System.out.println(emp_name);
        System.out.println(desg);
        System.out.println(sal);
        System.out.println(company);


    }
}
