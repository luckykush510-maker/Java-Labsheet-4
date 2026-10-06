public class Program13 {

    static class Person {
        void showPerson() {
            System.out.println("Person class");
        }
    }

    static class Employee extends Person {
        void showEmployee() {
            System.out.println("Employee class");
        }
    }

    static class Doctor extends Employee {
        void showDoctor() {
            System.out.println("Doctor class");
        }
    }

    static class Pharmacist extends Employee {
        void showPharmacist() {
            System.out.println("Pharmacist class");
        }
    }

    public static void main(String[] args) {
        Doctor d = new Doctor();
        Pharmacist p = new Pharmacist();

        d.showPerson();
        d.showEmployee();
        d.showDoctor();

        p.showPerson();
        p.showEmployee();
        p.showPharmacist();

        System.out.println("This demonstrates a hybrid inheritance concept.");
    }
}