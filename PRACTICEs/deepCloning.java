class Address implements Cloneable{
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Employee implements Cloneable{
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Employee cEmployee = (Employee) super.clone();
        cEmployee.address = (Address) this.address.clone();

        return cEmployee;
    }
}

/**
 * deepCloning
 */
public class deepCloning {
    public static void main(String[] args) {
        try {
            Address address = new Address("New York");
            Employee employee1 = new Employee("John", address);

            Employee employee2 = (Employee) employee1.clone();

            System.out.println("Before changing address:");
            System.out.println("Employee 1: " + employee1.name + ", City: " + employee1.address.city);
            System.out.println("Employee 2: " + employee2.name + ", City: " + employee2.address.city);

            // Change the address of employee2
            employee2.address.city = "Los Angeles";

            System.out.println("\nAfter changing address of Employee 2:");
            System.out.println("Employee 1: " + employee1.name + ", City: " + employee1.address.city);
            System.out.println("Employee 2: " + employee2.name + ", City: " + employee2.address.city);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
