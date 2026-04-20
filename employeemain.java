import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empid;
    String ename;
    String deptid;
    String deptname;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id - ");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name - ");
        ename = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id - ");
        deptid = sc.nextLine();
        System.out.print("Enter department name - ");
        deptname = sc.nextLine();
    }

    void display() {
        System.out.println("\nEmployee id - " + empid);
        System.out.println("Employee name - " + ename);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class employeemain {
    public static void main(String[] args) {
        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
