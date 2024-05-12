package biyDaalt3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String id;
    private int age;
    private int workingYears;

    public Employee(String name, String id, int age, int workingYears) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.workingYears = workingYears;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingYears() {
        return workingYears;
    }
}

public class Version1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Батаа", "B101", 30, 5));
        employees.add(new Employee("Aлимаа", "B102", 25, 2));
        employees.add(new Employee("Өсөхөө", "B103", 35, 1));
        employees.add(new Employee("Өнөө", "B104", 28, 4));
        employees.add(new Employee("Nyo", "B105", 40, 6));
        employees.add(new Employee("VERSION 1","0",0,0));

        writeEmployeesToFile("/Users/macbookpro15/git/repository5/Buteelt/src/biyDaalt3/Ulaanbaatar.txt", employees);
        List<Employee> ulnEmployees = readEmployeesFromFile("/Users/macbookpro15/git/repository5/Buteelt/src/biyDaalt3/Ulaanbaatar.txt");
        
        
        List<Employee> transferredEmployees = transferEmployees(ulnEmployees, 5);
        writeEmployeesToFile("/Users/macbookpro15/git/repository5/Buteelt/src/biyDaalt3/Darkhan.txt", transferredEmployees);
        writeEmployeesToFile("/Users/macbookpro15/git/repository5/Buteelt/src/biyDaalt3/Ulaanbaatar.txt", ulnEmployees);

    }



    public static List<Employee> transferEmployees(List<Employee> employees, int yearsThreshold) {
        List<Employee> transferredEmployees = new ArrayList<>();
        List<Employee> remainingEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getWorkingYears() < yearsThreshold) {
                transferredEmployees.add(emp);
            } else {
                remainingEmployees.add(emp);
            }
        }
       employees.clear();
        employees.addAll(remainingEmployees);
        return transferredEmployees;
    }
    public static List<Employee> remainedEmployees(List<Employee> employees, int yearsThreshold) {
     
        List<Employee> remainingEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getWorkingYears() >= yearsThreshold) {
            
                remainingEmployees.add(emp);
            }
        }
        employees.clear();
        employees.addAll(remainingEmployees);
        return remainingEmployees;
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
    
    public static List<Employee> readEmployeesFromFile(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0];
                    String id = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    int workingYears = Integer.parseInt(parts[3]);
                    employees.add(new Employee(name, id, age, workingYears));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

}
