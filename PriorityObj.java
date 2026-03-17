import java.util.*;

class PriorityObj {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> a.age - b.age);
        Student s1 = new Student(20, "Tina");
        Student s2 = new Student(12, "Rina");
        Student s3 = new Student(11, "Mina");
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        Student temp = pq.poll();
        System.out.println(temp.age);

    }
}

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
