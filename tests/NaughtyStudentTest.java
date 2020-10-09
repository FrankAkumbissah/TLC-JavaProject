import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NaughtyStudentTest {

    @Test
    public void testNaughtyStudentGrade(){
        List<Double> studentGrade = new ArrayList<>();
        studentGrade.add(50.0);
        studentGrade.add(50.0);

        NaughtyStudent naughtyStudent = new NaughtyStudent(studentGrade);

        assertEquals("Failed",55.0,naughtyStudent.alterGrade(),0.0);
    }



}
