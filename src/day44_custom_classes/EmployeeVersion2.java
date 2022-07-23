package day44_custom_classes;

public class EmployeeVersion2 {
        String name;
        int id;
        String jobTitle;
        double salary;

        public EmployeeVersion2(String name, String jobTitle) {
            this.name = name;
            this.jobTitle = jobTitle;
        }

        public EmployeeVersion2(String name, String jobTitle, int id, double salary) {
            this(name,jobTitle);
            this.id = id;
            this.salary = salary;
        }

        public void goToMeeting() {
            System.out.println(name + " is going to a meeting");
        }

        public String toString() {
            String employee = "Name: " + name +
                    "\nJob Title: " + jobTitle;
            if (id != 0) {
                employee += "\nID: " + id;

            }
            if (salary != 0.0) {
                employee += "\nSalary: " + salary;
            }
            return employee;
        }


    }

