/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

public class Employee {
    
    //fields
    String name;
    int idNumber;
    String department;
    String position;
    
    //Constructors
    public Employee(String empName,int id,String dep,String position)
    {
        this.name=empName;
        this.idNumber=id;
        this.department=dep;
        this.position=position;
    }
    //methods
    public Employee(String empName,int id)
    {
        this.name=empName;
        this.idNumber=id;
        this.department=" ";
        this.position=" ";
    }
    public Employee()
    {
        this.name=" ";
        this.idNumber=0;
        this.department=" ";
        this.position=" ";
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        this.idNumber=id;
    }
    public void setDepartment(String dep)
    {
        this.department=dep;
    }
    public void setPosition(String pos)
    {
        this.position=pos;
    }
    public String getName()
    {
        return name;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getPosition()
    {
        return position;
    }
    public int getId()
    {
        return idNumber;
    }
}