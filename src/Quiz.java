public class Quiz extends Question {

    //create a private field to store the correct answer
    private String answer;

    public Quiz(String diagram, String label, String answer) {
        //call the superclass to initialise diagram and label
        super(diagram, label);
        //set answer field to provide answer
        this.answer = answer;

    }
    //method to check if the given response is the correct answer
    public boolean checkAnswer(String response){
        //compare response to answer
        return response.equalsIgnoreCase(answer);
    }


}
