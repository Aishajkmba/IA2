import java.util.ArrayList;
import java.util.List;

public class UserAnswers {
    private List<String> answers;

    public UserAnswers() {
        answers = new ArrayList<>();
    }
    // add a new answer to answer list
    public void addAnswer(String answer) {
        answers.add(answer);
    }
    //retrieve all answers from answers list

    public List<String> getAnswers() {
        return answers;
    }
}