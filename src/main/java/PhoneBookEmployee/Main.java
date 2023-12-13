package PhoneBookEmployee;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(1, "123-456-7890", "Иванов", 5);
        directory.addEmployee(2, "987-654-3210", "Петров", 3);
        directory.addEmployee(3, "555-888-9999", "Сидоров", 7);

        System.out.println(directory.findEmployeeByExperience(5));
        System.out.println(directory.findPhoneNumberByName("Петров"));
        System.out.println(directory.findEmployeeByEmpId(3));
    }

}
