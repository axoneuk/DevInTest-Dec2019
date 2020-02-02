package uk.axone.devintest.encap.pack1;

public class EmployeeTest {

    public static void main(String[] args) {

        //Data submitted from from the form
        // Scenario 1 - Create new employee

        Employee emp = new Employee();
        //info from the form submitted
       /* emp.empName = "93487f930&$£)jdj";
        emp.age = -34657;
        emp.salary = -290374047;*/
       emp.setEmpName("Ram");
       emp.setAge(48);
       emp.setSalary(39703);
       emp.save();

        //scenario 2 - load details for an existing employee
        Employee emp1 = new Employee("123");
        emp1.getEmpName();
        emp1.getAge();
        //emp1.name

    }

}
