package LessonOne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Алексей", "A1", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Мария", "B1", 2, Arrays.asList(2, 2, 3)));
        students.add(new Student("Ирина", "A1", 1, Arrays.asList(5, 5, 5)));
        students.add(new Student("Дмитрий", "C2", 3, Arrays.asList(3, 3, 3)));
        students.add(new Student("Ольга", "B1", 2, Arrays.asList(1, 2, 2)));

        System.out.println("Изначальный список:");
        for (Student student : students) {
            System.out.println(student);
        }

        StudentManager.removeLowPerformers(students);

        StudentManager.promoteStudents(students);

        System.out.println("После удаления и перевода:");
        for (Student student : students) {
            System.out.println(student);
        }

        StudentManager.printStudents(students, 2);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "111-11-11");
        phoneBook.add("Петров", "222-22-22");
        phoneBook.add("Иванов", "333-33-33");
        phoneBook.add("Сидоров", "444-44-44");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
    }
}