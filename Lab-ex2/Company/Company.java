import java.util.*;

public class Company {
    public ArrayList<Employee> employees;

    public Company(){
        this.employees = new ArrayList<Employee>(0);
    }

    public void addAnEmployee(){
        char choice; 
        String name;
        Scanner cin = new Scanner(System.in);
        double salary;
        do {
            System.out.print("Enter employee name: ");
            name = cin.nextLine();
            System.out.print("Enter an employee salary: ");
            salary = cin.nextDouble();
            Employee new_emp = new Employee(name, salary);
            this.employees.add(new_emp);
            cin.nextLine();
            System.out.printf("Employee %s added.\n", new_emp.toString());

            System.out.print("Do you want to add more, Enter y for yes: ");
            choice = cin.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    public void deleteEmp() {
        Scanner cin = new Scanner(System.in);
        int choice;
        int id;
        do {
            System.out.print("Enter the id of employee to delte: ");
            id = cin.nextInt();
            cin.nextLine();
            this.removeEmployee(id);
            System.out.print("Enter y to delte other employee: ");
            choice = cin.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    public void removeEmployee(int id_no) {    
        for (Employee e: employees) {
            if (e.getId() == id_no) {
                System.out.printf("Employee: %s is removed\n", e.toString());
                employees.remove(e);
            }
        }
        System.out.printf("Employee with id no : %d don't found.\n", id_no);
    }
    
    public void getAllEmployees() {
        for (Employee e : employees) {
            System.out.printf("Employee: %s\n", e.toString());
        }
    }

    public double calculateSalary() {
        double salary = 0;

        for (Employee e: employees) {
            salary += e.getSalary();
        }

        System.out.printf("Total salary of employees is %.2f.\n", salary);
        return salary;
    }

    public static void main(String []args) {
        int choice;
        Scanner cin = new Scanner(System.in);

        Company myCompany = new Company();
    
        System.out.println("**************Company and Employees **************");

        do {
            System.out.print("Main Menu\n1. Add Employees\n2. Delete Employee by id" +
                            "\n3. Get all employees Salary \n4. Display all employees."+
                            "\n5. Exit \nEnter your choice: ");
            choice = cin.nextInt();
            cin.nextLine();

            switch (choice) {
                case 1:
                    myCompany.addAnEmployee();
                    break;
                case 2:
                    myCompany.deleteEmp();
                    break;
                case 3:
                    myCompany.calculateSalary();
                    break;
                case 4:
                    myCompany.getAllEmployees();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.printf("You have entered an invalid choice\n");
                    break;
            }
        } while (choice != 5);
    }
}
