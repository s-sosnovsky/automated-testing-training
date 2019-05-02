package com.epam.classes.task.a.util;
import com.epam.classes.task.a.model.Student;
import com.epam.classes.task.a.model.StudentsGroup;
import java.util.GregorianCalendar;

/**
 * Created by Sery on 23.03.2019.
 */
public class StudentsGroupCreator {
    public static StudentsGroup getStudentGroup() {

        StudentsGroup studentsGroup = new StudentsGroup();

        studentsGroup.addStudent(new Student(1, "John", "Jr.", "Malkovich", new GregorianCalendar(1989, 9, 9),
                "Miami", "+37529-555-55-55", "AAA", 5, 555));
        studentsGroup.addStudent(new Student(2, "Stuart", "Maria", "Ivanovich", new GregorianCalendar(1992, 5, 6),
                "LA", "+37529-444-44-44", "AAA", 4, 444));
        studentsGroup.addStudent(new Student(3, "Bella", "Marta", "Davis", new GregorianCalendar(1993, 9, 1),
                "NY", "+37529-111-11-11", "BBB", 1, 111));
        studentsGroup.addStudent(new Student(4, "Antony", "Solgado", "Pedro", new GregorianCalendar(1994, 9, 1),
                "NY", "+37529-112-12-12", "CCC", 4, 444));
        studentsGroup.addStudent(new Student(5, "Gregory", "Lucas", "Martines", new GregorianCalendar(1990, 9, 1),
                "NY", "+37529-332-77-88", "CCC", 4, 444));

        return studentsGroup;
    }

}
