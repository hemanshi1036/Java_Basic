class Student {
    String name;
    int age;
    static int count = 0; // Static variable to keep track of the number of students

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++; // Increment count each time a new student is created
    }

    static int getCount() {
        return count; // Static method to get the count of students
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // Array of Student objects

        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);

        System.out.println("Total number of students: " + Student.getCount());
        System.out.println("Details of Students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": Name - " + students[i].name + ", Age - " + students[i].age);
        }
    }
}
