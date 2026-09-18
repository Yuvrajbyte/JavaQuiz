public class Question {
    String question;
    String[] options;
    char answer;

    Question(String question, String[] options, char answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    void display() {
        System.out.println("\n" + question);
        for (String option : options)
            System.out.println(option);
    }
}