class Emp {
    float salary = 40000;

    void dispSalary() {
        System.out.println("The Employee salary is :" + salary);
    }
}

class PermanentEmp extends Emp {
    double hike = 0.5;

    void incrementSalary() {
        super.dispSalary();
        System.out.println("The Permanent Employee incremented salary is :" + (salary + (salary * hike)));
    }
}

class TemporaryEmp extends Emp {
    double hike = 0.35;

    void incrementSalary() {
        super.dispSalary();
        System.out.println("The Temporary Employee incremented salary is :" + (salary + (salary * hike)));
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        PermanentEmp p = new PermanentEmp();
        TemporaryEmp t = new TemporaryEmp();
        p.incrementSalary();
        t.incrementSalary();
    }
}