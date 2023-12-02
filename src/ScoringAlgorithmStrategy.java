public interface ScoringAlgorithmStrategy {
    Double calculateFinalScore(Double assignmentScore, Double examScore);
}