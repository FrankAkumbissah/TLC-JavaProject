import java.util.ArrayList;
import java.util.List;

public class NaughtyStudent extends Student{


    public NaughtyStudent(List<Double> studentGrade) {
        super(studentGrade);
    }

    public double alterGrade(){
        double result = 0.0;
        for(int index=0; index<studentGrade.size(); index++){

            result += studentGrade.get(index) * 1.1;

        }
        double res =  result /  studentGrade.size();
        return Math.round(res);
    }

}
