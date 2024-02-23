public class GradeofStudents {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        int totalGradeA = totalStudents/2;

        int boysGrade = 20;
        int girlsGrade = totalGradeA - boysGrade;

        System.out.println("total number of girl occupied grade A : " + girlsGrade);
    }
}
