package ru.mirea.lab15_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController();
        controller.setModel(model); // Установка модели
        controller.setView(view); // Установка контроллера
        controller.updateView(); // Вызов метода у контроллера
        controller.getModel().setName("Charlie");
        controller.getModel().setRollNo("Designer"); // Изменение данных модели с помощью контроллера
        System.out.println("\nРезультат после обновления:\n");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() { // Метода, который создает и возвращает объект Student
        Student student = new Student();
        student.setName("Elli");
        student.setRollNo("Developer");
        return student;
    }
}
