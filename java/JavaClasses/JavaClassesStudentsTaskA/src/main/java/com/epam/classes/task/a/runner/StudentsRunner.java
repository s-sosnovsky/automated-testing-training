package com.epam.classes.task.a.runner;
import com.epam.classes.task.a.util.StudentsGroupCreator;
import com.epam.classes.task.a.model.StudentsGroup;
import com.epam.classes.task.a.util.StudentsSorter;
import java.util.GregorianCalendar;

/**
 * Created by Sery on 12.03.2019.
 */
public class StudentsRunner {
    public static void main(String[] args) {

        StudentsGroup studentsGroup = StudentsGroupCreator.getStudentGroup();

        System.out.println("Students group:\n" + studentsGroup.toString());
        System.out.println("Students sorted by a faculty:" );
        StudentsSorter.printStudentsGroupFilteredByFaculty(studentsGroup, "CCC");
        System.out.println("Students sorted by a faculty and a course:");
        StudentsSorter.printStudentsGroupFilteredByFacultyAndCourse(studentsGroup, "AAA", 5);
        System.out.println("\nStudents born after the year selected:");
        StudentsSorter.printStudentsGroupBornAfterYearSelected(studentsGroup, new GregorianCalendar(1990, 9, 9));
        System.out.println("\nStudents sorted by a group:");
        StudentsSorter.printStudentsGroupFilteredByGroup(studentsGroup,555);

    }
}
