package uk.axone.devintest.encap.pack1;

public class Employee {

    private String empID;
    private String empName;
    private int age;
    private int salary;

     String getEmpID() {
        return empID;
    }


    String getEmpName() {
        return empName;
    }

    void setEmpName(String empName) {
        //validations
        this.empName = empName;
    }

    int getAge() {
        return age;
    }

     void setAge(int age) {
        //validations
        this.age = age;
    }

     int getSalary() {
        return salary;
    }

     void setSalary(int salary) {
        this.salary = salary;
    }

     Employee(String empID){
        this.empID = empID;
        load();
    }

     Employee() {

    }

    void save(){
        //validations
        //insert a row into the employee table
    }

    private void load(){
        //retrive the information for empID from the table
        //select * from employee table where empID = <>
        /*empName = <value from DB>;
        age = <value from DB>;*/
    }

}
