import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getAverageGrade() {
        List<Double> studentgrade = new ArrayList<>();
        studentgrade.add(20.0);
        studentgrade.add(50.0);

        Student student1 = new Student(studentgrade);

        assertEquals("Failed", 35.0, student1.getAverageGrade(), 0.0);
    }
}