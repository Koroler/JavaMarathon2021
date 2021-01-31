package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Epictetus", "Stoics");
        Teacher teacher = new Teacher("Marcus Aurelius", "Philosophy");

        System.out.println(student.groupName);
        System.out.println(teacher.subjectName);
        student.printInfo();
        teacher.printInfo();

    }
}
