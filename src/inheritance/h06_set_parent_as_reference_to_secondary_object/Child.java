package inheritance.h06_set_parent_as_reference_to_secondary_object;

public class Child extends Parent {
    public double salary;
    @Override
    public String getEmployeeDetails() {
        return "Name: " + name + " Salary: " + salary;
    }
}
