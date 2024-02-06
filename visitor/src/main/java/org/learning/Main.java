package org.learning;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Alice", 85),
                new Student("Bob", 78),
                new Student("Charlie", 90),
                new Student("Dave", 88)
        };

        SchoolVisitor visitor = new SchoolVisitor();

        for (Student student : students) {
            student.accept(visitor);
        }

        System.out.printf("Total Marks: %d%n", visitor.getTotalMarks());
        System.out.printf("Average Marks: %.2f%n", visitor.getAverageMarks());
    }
}