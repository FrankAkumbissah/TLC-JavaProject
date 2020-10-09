import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getAverageGrade() {
        List<Double> studentGrade = new ArrayList<>();
        studentGrade.add(20.0);
        studentGrade.add(50.0);

        Student student1 = new Student(studentGrade);
        student1.setName("OhenebaAduhene");

        assertEquals("Failed", 35.0, student1.getAverageGrade(), 0.0);
        assertEquals("OhenebaAduhene", student1.getName());
    }
}