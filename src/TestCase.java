

public class TestCase {

    public static void main(String[] args) {

        Student student = new Student("Harry Potter");
        student.setAssignmentScore(88);
        student.setExamScore(66);

        // Algorithm A
        student.setScoringAlgorithm(new AlgorithmAStrategy());
        System.out.println(student.getName() + "  " + student.getFinalScore().toString());

        // Algorithm B
        student.setScoringAlgorithm(new AlgorithmBStrategy());
        System.out.println(student.getName() + "  " + student.getFinalScore().toString());
    }
}
