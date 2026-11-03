
public abstract class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;
    

    public static final String BANK_NAME = "VietTech Bank";
    
    
    private static int totalEmployees = 0;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        totalEmployees++; 
    }


    public abstract double calculateSalary();

    
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    
}


public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary + this.bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
}


public class Intern extends Employee {
    private double supportRate;

    public Intern(String id, String name, double baseSalary, double supportRate) {
        super(id, name, baseSalary);
        this.supportRate = supportRate;
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary * this.supportRate;
    }

    public double getSupportRate() { return supportRate; }
    public void setSupportRate(double supportRate) { this.supportRate = supportRate; }
}