package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = context.getBean(StudentService.class);
        System.out.println("Insert");
        studentService.registerStudentDao(new Student(4, "Swetha"));
        System.out.println("Read");
        studentService.getAllStudents().forEach(System.out::println);
        System.out.println("Update");
        studentService.updateStudent(new Student(1, "Priya"));
        System.out.println();
        System.out.println("Read after update");
        studentService.getAllStudents().forEach(System.out::println);
        System.out.println();
        System.out.println("Delete");
        studentService.deleteStudent(2);
        System.out.println();
        System.out.println("Read after Delete");
        studentService.getAllStudents().forEach(System.out::println);
        System.out.println("Hello World");
    }

}
