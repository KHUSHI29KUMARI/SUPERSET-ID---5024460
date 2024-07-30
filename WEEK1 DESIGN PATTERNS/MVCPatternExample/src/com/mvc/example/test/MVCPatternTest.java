package com.mvc.example.test;

import com.mvc.example.model.Student;
import com.mvc.example.view.StudentView;
import com.mvc.example.controller.StudentController;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a Student
        Student model = new Student("John Doe", "12345", "A");

        // Create a View
        StudentView view = new StudentView();

        // Create a Controller
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated details
        controller.updateView();
    }
}
