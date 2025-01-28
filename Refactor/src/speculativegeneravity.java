// Abstract class without any immediate need
abstract class Employee {
    public abstract double calculateBonus();

    // Speculative method
    public void logWorkingHours() {
        System.out.println("Logging working hours...");
    }
}

// Single subclass with speculative future expansion
class FullTimeEmployee extends Employee {
    @Override
    public double calculateBonus() {
        return 5000.0; // Fixed bonus for full-time employees
    }
}

class PayrollSystem {
    private Employee employee;

    public PayrollSystem(Employee employee) {
        this.employee = employee;
    }

    public void processPayroll() {
        System.out.println("Processing payroll. Bonus: " + employee.calculateBonus());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee();
        PayrollSystem payroll = new PayrollSystem(fullTimeEmployee);
        payroll.processPayroll();
    }
}


class Employee {
    public double calculateBonus() {
        return 5000.0; // Fixed bonus for full-time employees
    }
}

class PayrollSystem {
    private Employee employee;

    public PayrollSystem(Employee employee) {
        this.employee = employee;
    }

    public void processPayroll() {
        System.out.println("Processing payroll. Bonus: " + employee.calculateBonus());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        PayrollSystem payroll = new PayrollSystem(employee);
        payroll.processPayroll();
    }
}

