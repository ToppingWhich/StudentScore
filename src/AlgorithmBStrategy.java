public class AlgorithmBStrategy implements ScoringAlgorithmStrategy {
    @Override
    public Double calculateFinalScore(Double assignmentScore, Double examScore) {
        // Algorithm B: If Assignment or Exam equals 0, final score is 0.
        // Otherwise, Assignment contributes 50%, Exam contributes 50%
        if (assignmentScore == 0 || examScore == 0) {
            return 0.0;
        }
        return 0.5 * assignmentScore + 0.5 * examScore;
    }
}