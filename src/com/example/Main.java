package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> firstGradeStudents = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Student newStudent = new Student("fN" + i, "lN" +i, "sId" + i, 1);
        }

        ArrayList<String> Teacher = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Teacher newTeacher = new Teacher("fN" + 1, "lN" +1, "tId"+1, 1);
        }

        Map<String, String> TeacherStudent = new HashMap<>();

        






    }

}
