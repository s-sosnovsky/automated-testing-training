package com.epam.classes.task.a.util;
import com.epam.classes.task.a.model.Student;
import com.epam.classes.task.a.model.StudentsGroup;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Sery on 12.03.2019.
 */

public class StudentsSorter {

    public static void printStudentsGroupFilteredByFaculty(StudentsGroup studentsGroup, String faculty) {

        for (Student student:studentsGroup.getStudentsGroup()) {
            if (student != null) {
                if (faculty.equalsIgnoreCase(student.getFaculty())) {
                    System.out.println(student.toString());
                }
            }
        }
    }

    public static void printStudentsGroupFilteredByFacultyAndCourse(StudentsGroup studentsGroup, String Faculty, int course) {
        for (Student m : studentsGroup.getStudentsGroup()) {
            if (m != null) {
                if (m.getFaculty().equalsIgnoreCase(Faculty) && m.getCourseNumber() == course) {
                    System.out.println(m.toString());
                }
            }
        }
    }

    public static void printStudentsGroupBornAfterYearSelected(StudentsGroup studentsGroup, GregorianCalendar year) {
        for (Student m : studentsGroup.getStudentsGroup()) {
            if(m != null) {
                if (m.getBirthdate().get(Calendar.YEAR)>year.get(Calendar.YEAR)) {
                    System.out.println(m.toString());
                }
            }
        }
    }

    public static void printStudentsGroupFilteredByGroup(StudentsGroup studentsGroup, int group) {
        for (Student m : studentsGroup.getStudentsGroup()) {
            if (m != null) {
                if (m.getGroupNumber() == group) {
                    System.out.println(m.toString());
                }
            }
        }
    }
}
