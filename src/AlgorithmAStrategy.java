public class AlgorithmAStrategy implements ScoringAlgorithmStrategy {
    @Override
    public Double calculateFinalScore(Double assignmentScore, Double examScore) {
        // Algorithm A: Assignment contributes 40%, Exam contributes 60%
        return 0.4 * assignmentScore + 0.6 * examScore;
    }
}