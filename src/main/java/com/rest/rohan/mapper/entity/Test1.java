package com.rest.rohan.mapper.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

public class Test1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John"));
        studentList.add(new Student("Joanna"));
        studentList.add(new Student("Alice"));
        studentList.add(new Student("Bob"));

        Optional<Student> student = studentList.stream()
                .filter(stu -> stu.getName().startsWith("Jo"))
                .findAny();

        if (student.isPresent()) {
            System.out.println("Student whose name starts with 'Jo': " + student.get());
        } else {
            System.out.println("No students found with a name starting with 'Jo'");
        }
    }
}
