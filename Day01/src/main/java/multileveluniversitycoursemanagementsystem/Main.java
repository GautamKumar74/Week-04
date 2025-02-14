package multileveluniversitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Course<? extends CourseType>> courses= new ArrayList<>();
        Course<ExamCourse> ec= new Course<>(new ExamCourse(),"English");
        Course<AssignmentCourse> ac= new Course<>(new AssignmentCourse(),"Java");
        Course<ResearchCourse> rc= new Course<>(new ResearchCourse(),"SpringBoot");

        courses.add(ec);
        courses.add(ac);
        courses.add(rc);

        for(Course<? extends CourseType> c: courses){
            c.display();
            System.out.println();
        }
    }
}
