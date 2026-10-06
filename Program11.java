public class Program11 {

    static class Person {
        void showPerson() {
            System.out.println("Person details available.");
        }
    }

    static class Employee extends Person {
        void work() {
            System.out.println("Employee is working.");
        }
    }

    static class Manager extends Employee {
        void manage() {
            System.out.println("Manager is managing the hospital.");
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager();

        m.showPerson();
        m.work();
        m.manage();
    }
}