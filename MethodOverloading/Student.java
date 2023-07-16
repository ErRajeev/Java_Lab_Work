import java.util.Scanner;

class Student {

    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.name = name;
        this.rollno = rollno;
    }

    static void display(Student s) {
        System.out.println("Name : " + s.name + "\nRollno : " + s.rollno);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Student");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        // get input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name : ");
            String name = sc.next();
            System.out.print("Enter Rollno : ");
            int roll = sc.nextInt();
            students[i] = new Student(roll, name);
        }

        for (Student student : students)
            display(student);
        sc.close();
    }
}
