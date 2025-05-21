package Assignments;

interface Employee {
    void displayRole();
}

interface Department extends Employee {
    void showDepartment();
}

class Manager implements Department {
    public void showProjects() {
        System.out.println("Managing Projects: 3 ongoing");
    }

    public void displayRole() {
        System.out.println("Role: Manager");
    }

    public void showDepartment() {
        System.out.println("Department: Operations");
    }
}

class Developer implements Department {
    public void writeCode() {
        System.out.println("Writing Code in Java");
    }

    public void displayRole() {
        System.out.println("Role: Developer");
    }

    public void showDepartment() {
        System.out.println("Department: IT");
    }
}

public class test2 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Developer d1 = new Developer();

        m1.showProjects();
        m1.displayRole();
        m1.showDepartment();

        d1.writeCode();
        d1.displayRole();
        d1.showDepartment();
    }
}
