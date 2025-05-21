package Assignments;

interface Courses {
    void courseList();
}

interface Departments {
    void departmentList();
}

class University {
    void universityNames() {
        System.out.println("Top Universities: IIT Bombay, NIT Trichy, BITS Pilani");
    }
}

class College extends University implements Courses, Departments {
    public void specialPrograms() {
        System.out.println("Special Programs: AI Bootcamp, Data Science Certification, Robotics Workshop");
    }

    public void courseList() {
        System.out.println("Courses Offered: B.Tech, M.Tech, MBA, MCA");
    }

    public void departmentList() {
        System.out.println("Departments: CSE, ECE, Mechanical, Civil");
    }
}

class FeeStructure extends College {
    public void fees() {
        System.out.println("Average Annual Fee: ₹1,50,000");
    }
}

public class test5 {
    public static void main(String[] args) {
        University u1 = new University();
        College c1 = new College();
        FeeStructure f1 = new FeeStructure();

        c1.specialPrograms();
        c1.universityNames();
        c1.courseList();
        c1.departmentList();
        u1.universityNames();
        f1.fees();
        f1.specialPrograms();
    }
}

