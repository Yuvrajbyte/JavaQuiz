import java.util.ArrayList;

public class QuestionBank {

    static ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "Which language is platform independent?",
            new String[]{"A. C", "B. Java", "C. C++", "D. Assembly"},
            'B'));

        questions.add(new Question(
            "Which keyword is used to create a class in Java?",
            new String[]{"A. class", "B. define", "C. create", "D. object"},
            'A'));

        questions.add(new Question(
            "Which method is the entry point of a Java program?",
            new String[]{"A. start()", "B. run()", "C. main()", "D. execute()"},
            'C'));

        questions.add(new Question(
            "Which collection stores elements in a dynamic array?",
            new String[]{"A. ArrayList", "B. Stack", "C. Queue", "D. HashMap"},
            'A'));

        questions.add(new Question(
            "Which keyword is used for inheritance?",
            new String[]{"A. implements", "B. extends", "C. inherits", "D. super"},
            'B'));

        return questions;
    }
}