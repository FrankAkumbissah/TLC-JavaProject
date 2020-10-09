import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Student> allStudents = new ArrayList<>();

     public void Enter(Student student){
         this.allStudents.add(student);
     }

     public double getHighestAverageGrade(){
         double highestGrade = 0.0;
         for(Student std: allStudents){
             double currentGrade = std.getAverageGrade();
             if(currentGrade > highestGrade){
                 highestGrade = currentGrade;
             }
         }
         return highestGrade;
     }
}
