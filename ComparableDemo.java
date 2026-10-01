import java.util.ArrayList;
import java.util.Comparator;
import java.lang.Math;

class CustomComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if(s1.marks!=s2.marks)return s1.marks-s2.marks;
        else return s1.rollno - s2.rollno;
    }
}

class NameComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        for(int i=0;i<Math.min(s1.name.length(), s2.name.length());i++){
            char a = s1.name.charAt(i), b = s2.name.charAt(i);
            int d = a-b;
            if(d!=0) return d;
        }
        return -1;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        ArrayList<Student> s = new ArrayList<>();
        i.add(13);
        i.add(15);
        i.add(20);
        i.add(10);
        i.add(6);
        i.sort(null);
        System.out.println(i);
        s.add(new Student("Rahul", 1, 30));
        s.add(new Student("Kanika", 78, 17));
        s.add(new Student("Nimit", 4, 14));
        s.add(new Student("Preetam", 127, 7));
        s.sort(new NameComparator());
        System.out.println(s);
    }
}
class Student implements Comparable<Student>{
    String name;
    int rollno, marks;
    Student(String n, int r, int m){
        name = n;
        rollno = r;
        marks = m;
    }
    public int compareTo(Student o){
        return this.rollno - o.rollno;
    } 
    public String toString() {
        return "Student{name='" + name + "', roll=" + rollno + ", marks = "+ marks+"}";
    }
}
