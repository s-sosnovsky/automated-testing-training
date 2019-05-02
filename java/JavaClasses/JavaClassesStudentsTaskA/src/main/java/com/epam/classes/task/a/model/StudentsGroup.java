package com.epam.classes.task.a.model;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sery on 23.03.2019.
 */
public class StudentsGroup {
    public void setStudentsGroup(List<Student> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public List<Student> getStudentsGroup() {
        return studentsGroup;
    }

    private List<Student> studentsGroup = new ArrayList();


    public void addStudent(Student student){
        this.studentsGroup.add(student);
    }

    @Override
    public String toString() {
        StringBuilder studentGroupBuilder = new StringBuilder();
        for (Student p : studentsGroup) {
            studentGroupBuilder.append(p.toString() + "\n");
        }
        return studentGroupBuilder.toString();
    }


}
