public class Employee {
    public static int totalEmp = 0;
    private String name;
    private int id;
    private double salary;

    public Employee(String name, double salary){
        Employee.totalEmp += 1;
        this.id = totalEmp;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public void setId(int id){
        if (id < Employee.totalEmp) {
            System.out.print("This is an invalid id\n");
        } else {
            this.id = id;
        }
    }

    public String toString(){
        return "Name: " + name + " Id: " + id + " Salary: " + salary;
    }
}
