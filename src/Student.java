

public class Student {

    private String name;        // full name of the student
    private Double assignment;  // score for the assignment
    private Double exam;        // score for the exam

    /**
     * Construct the student from their name
     * @param name full name of the student
     */
    public Student(String name) {
        this.name = name;
        assignment = 0.0;
        exam = 0.0;
    }

    /**
     * @return the student's full name
     */
    public String getName() {
        return name;
    }

    /**
     * @param as the assignment score to set
     */
    public void setAssignmentScore(double as) {
        assignment = as;
    }
    /**
     * @param es the exam score to set
     */
    public void setExamScore(double es) {
        exam = es;
    }

    // TODO get the final score
    private ScoringAlgorithmStrategy scoringAlgorithmStrategy;

    public void setScoringAlgorithm(ScoringAlgorithmStrategy algorithm) {
        this.scoringAlgorithmStrategy = algorithm;
    }

    public Double getFinalScore() {
        if (scoringAlgorithmStrategy == null) {
            throw new IllegalStateException("Scoring algorithm not set");
        }
        return scoringAlgorithmStrategy.calculateFinalScore(assignment, exam);
    }

}
