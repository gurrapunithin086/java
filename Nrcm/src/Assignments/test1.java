package Assignments;
interface studentName{
	void name();
}
interface studentId{
	void Id();
}
interface studentDetails extends studentName,studentId{
	void add();
}
public class test1 implements studentDetails {
	public void display() {
		System.out.println("Student Details:");
	}
	public void name() {
		System.out.println("Name: Nithin");
	}
	public void Id() {
		System.out.println("ID: 22X01A0578");
	}
	public void add() {
		System.out.println("Branch : CSE");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 d1=new test1();
		d1.display();
		d1.name();
		d1.Id();
		d1.add();
	}
}

