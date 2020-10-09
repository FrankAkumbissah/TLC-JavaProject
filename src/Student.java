import java.util.ArrayList;
import java.util.List;

public class Student {
    protected List<Double> studentgrade = new ArrayList<>();

    public Student(List<Double> studentgrade) {
        this.studentgrade = studentgrade;
    }

    public double getAverageGrade() {
        double sum = 0;
        for(int i = 0; i < studentgrade.size(); i++) {
            sum += studentgrade.get(i);
        }
        return sum / studentgrade.size();
    }
}

