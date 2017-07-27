package com.example;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> firstGradeStudents = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Student newStudent = new Student("fN" + i, "lN" +i, "sId" + i, 1);
            firstGradeStudents.add(newStudent);
        }

        ArrayList<Teacher> teacher = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Teacher newTeacher = new Teacher("fN" + 1, "lN" +1, "tId"+1, 1);
            teacher.add(newTeacher);

        }

        Map<Teacher, Set<Student>> TeacherStudent = new HashMap<>();
        for (int i = 0; i < 3; i++){
            Set<Student> firstGrade = new HashSet<>();
            for (int j = 0; j < 5; j++){
                firstGrade.add(firstGradeStudents.get((i*5)+j));
            }
            TeacherStudent.put(teacher.get(i), firstGrade);
        }

        System.out.println("key set");
        for (Teacher teachers : TeacherStudent.keySet()){
            System.out.println(teacher);
        }


        System.out.println("values");

        for (Set setOfStudents : TeacherStudent.values()){
            System.out.println(setOfStudents);
        }














    }

}
