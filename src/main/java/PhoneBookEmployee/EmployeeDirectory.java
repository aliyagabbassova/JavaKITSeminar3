package PhoneBookEmployee;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int empId, String phoneNumber, String name, int experience) {
        Employee employee = new Employee(empId, phoneNumber, name, experience);
        employees.add(employee);
    }

    public List<Employee> findEmployeeByExperience(int targetExperience) {
        List<Employee> matchingEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getExperience() == targetExperience) {
                matchingEmployees.add(emp);
            }
        }
        return matchingEmployees;
    }

    public List<String> findPhoneNumberByName(String targetName) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().equals(targetName)) {
                phoneNumbers.add(emp.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    public List<Employee> findEmployeeByEmpId(int targetEmpId) {
        List<Employee> matchingEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getEmpId() == targetEmpId) {
                matchingEmployees.add(emp);
            }
        }
        return matchingEmployees;
    }
}
