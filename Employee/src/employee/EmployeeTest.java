/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;
//Employee file
public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee obj1=new Employee("Susan Meyers",47899,"Accounting","Vice President");
        Employee obj2=new Employee("Mark Jones",39119);
        obj2.setDepartment("IT");
        obj2.setPosition("Programmer");
        Employee obj3=new Employee();
        obj3.setName("Joy Rogers");
        obj3.setId(81774);
        obj3.setDepartment("Manufacturing");
        obj3.setPosition("Engineer");
        System.out.println("Name \t\t ID Number \t\t Department \t\t Position");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(obj1.getName()+"\t\t"+obj1.getId()+"\t\t"+obj1.getDepartment()+"\t\t"+obj1.getPosition());
        System.out.println(obj2.getName()+"\t\t"+obj2.getId()+"\t\t"+obj2.getDepartment()+"\t\t\t"+obj2.getPosition());
        System.out.println(obj3.getName()+"\t\t"+obj3.getId()+"\t\t"+obj3.getDepartment()+"\t\t"+obj3.getPosition());


    }
}
