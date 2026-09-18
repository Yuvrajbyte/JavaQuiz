import java.util.ArrayList;

public class QuizManager {

    static Quiz createQuiz() {
        ArrayList<Question> questions = QuestionBank.getQuestions();
        return new Quiz(questions);
    }
}