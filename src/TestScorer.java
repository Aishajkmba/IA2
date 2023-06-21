import java.util.ArrayList;

public class TestScorer {
    public static void passOrFail(int score) {
        // If the score is greater than or equal to 7, print "you pass!"
        if (score >= 7) {
            System.out.println("you pass!, well done");
            // Otherwise, print "you fail, try again!"
        } else {
            System.out.println("you fail, try again!");
        }
    }

    public double calculateScore(ArrayList<String> userAnswers) {
        // Define the correct answers
        String[] correctAnswers = {"Bottom", "Y-axis", "Between Y1 and YFE", "Between YFE and Y1", "Top", "Left", "Right", "Under recovery", "y-axis"};

        // Check how many user answers match the correct answers
        int numCorrect = 0;
        for (int i = 0; i < userAnswers.size(); i++) {
            if (userAnswers.get(i).equalsIgnoreCase((correctAnswers[i]))) {
                numCorrect++;
            }
        }

        // Calculate and return the score out of 9
        double score = (double) numCorrect * 9 / correctAnswers.length;
        return score;
    }

}