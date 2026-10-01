import java.util.ArrayList;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int roll;
    ArrayList<Integer> marks;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.marks = new ArrayList<>();
    }

    public void addMarks(int mark) throws NegativeMarksException {
        if (mark < 0) {
            throw new NegativeMarksException("Marks cannot be negative: " + mark);
        }

        marks.add(mark);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class Stu{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Rahul", 101);

        try {
            s1.addMarks(85);
            s1.addMarks(90);
            s1.addMarks(-10);
            s1.addMarks(78);
        } catch (NegativeMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        students.add(s1);

        for (Student s : students) {
            s.display();
        }
    }
}