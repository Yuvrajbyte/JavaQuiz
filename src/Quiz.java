import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions;
    int score = 0;

    Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }

    void start() {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            q.display();
            System.out.print("Enter answer: ");
            char ans = Character.toUpperCase(sc.next().charAt(0));

            if (ans == q.answer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Score: " + score + "/" + questions.size());
        sc.close();
    }
}