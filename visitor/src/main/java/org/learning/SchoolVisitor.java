package org.learning;

public class SchoolVisitor implements StudentVisitor {
    private int totalMarks = 0;
    private int studentCount = 0;

    @Override
    public void visit(Student student) {
        totalMarks += student.getMarks();
        studentCount++;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public float getAverageMarks() {
        return (studentCount > 0) ? ((float) totalMarks) / studentCount : 0;
    }
}