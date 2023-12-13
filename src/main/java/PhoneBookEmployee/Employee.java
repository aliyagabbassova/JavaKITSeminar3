package PhoneBookEmployee;

public class Employee {
        private int empId;
        private String phoneNumber;
        private String name;
        private int experience;

        public Employee(int empId, String phoneNumber, String name, int experience) {
            this.empId = empId;
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.experience = experience;
        }

        public int getEmpId() {
            return empId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getName() {
            return name;
        }

        public int getExperience() {
            return experience;
        }
    }


