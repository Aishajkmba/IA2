public class Question {
    private String diagram;
    private String label;

    public Question (String diagram, String label){
        this.diagram = diagram;
        this.label = label;
    }
    public void ask(String words ){
        System.out.println(diagram + " Place the label in the correct place: " + label);
    }
    public String getDiagram() {

        return diagram;
    }
    public String getLabel(){
        return label;
    }
}