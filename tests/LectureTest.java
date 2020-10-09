import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LectureTest {

    @Test
    public void getHighestAverageGrade() {
        Lecture lecture1 = new Lecture();

        List<Double> student1Grades = new ArrayList<>();
        student1Grades.add(30.0);
        student1Grades.add(90.0);

        Student student1 = new Student(student1Grades);

        List<Double> student2Grades = new ArrayList<>();
        student1Grades.add(80.0);
        student1Grades.add(70.0);

        Student student2 = new Student(student2Grades);

        lecture1.Enter(student1);
        lecture1.Enter(student2);

        assertEquals("Failed", 75.0, lecture1.getHighestAverageGrade(),0.0);
    }
}