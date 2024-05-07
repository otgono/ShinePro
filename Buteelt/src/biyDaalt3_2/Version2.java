package biyDaalt3_2;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int id;
    private int age;
    private int workingYears;

    public Employee(String name, int id, int age, int workingYears) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.workingYears = workingYears;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingYears() {
        return workingYears;
    }
}

public class Version2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 101, 30, 5));
        employees.add(new Employee("Alice", 102, 25, 2));
        employees.add(new Employee("Bob", 103, 35, 1));
        employees.add(new Employee("Emma", 104, 28, 4));
        employees.add(new Employee("Ball", 105, 40, 6));


        List<Employee> transferredEmployees = transferEmployees(employees, 5);

        writeEmployeesToFile("/Users/macbookpro15/git/repository5/Buteelt/src/biyDaalt3/Darkhan.txt", employees);
        writeEmployeesToFile("/Users/macbookpro15/git/repository5/Buteelt/src/biyDaalt3/Ulaanbaatar.txt", transferredEmployees);
    }



    public static List<Employee> transferEmployees(List<Employee> employees, int yearsThreshold) {
        List<Employee> transferredEmployees = new ArrayList<>();
        List<Employee> remainingEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getWorkingYears() >= yearsThreshold) {
                transferredEmployees.add(emp);
            } else {
                remainingEmployees.add(emp);
            }
        }
        employees.clear();
        employees.addAll(remainingEmployees);
        return transferredEmployees;
    }

    public static void writeEmployeesToFile(String filePath, List<Employee> employees) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Employee emp : employees) {
                bw.write(emp.getName() + "," + emp.getId() + "," + emp.getAge() + "," + emp.getWorkingYears());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
