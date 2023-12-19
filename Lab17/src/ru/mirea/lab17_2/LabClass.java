package ru.mirea.lab17_2;

import java.util.ArrayList;
import java.util.List;

public class LabClass {
    private List<Student> students = new ArrayList<>(); // Список студентов

    public void addStudent(Student student) { // Метод, который добавляет переданного студента в список students
        students.add(student);
    }

    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : students) { // Итерация по списку студентов
            if (student.getName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем " + fullName + " не найден"); // Выбрасывается исключение, если студент не найден
    }

    public List<Student> getStudents() {
        return students;
    }
}
