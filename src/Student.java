import java.util.ArrayList;
import java.util.List;

public class Student implements Namable{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    protected List<Double> studentGrade = new ArrayList<>();

    public Student(List<Double> studentGrade) {
        this.studentGrade = studentGrade;
    }

    public double getAverageGrade() {
        double sum = 0;
        for(int i = 0; i < studentGrade.size(); i++) {
            sum += studentGrade.get(i);
        }
        return sum / studentGrade.size();
    }

    @Override
    public String getName() {
        return name;
    }
}

