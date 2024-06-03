public class Employee {
    private static int generateId = 1;

    private final int id;
    private final String firstName;
    private final String lastName;
    private int department;
    private double salary;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getId() + "." + getFirstName() + " " + getLastName() + " " + getDepartment() + " : " + Math.round(getSalary()) + ".";
    }

    public Employee(String firstName, String lastName, int department, double salary) {
        this.id = generateId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;


    }
}
