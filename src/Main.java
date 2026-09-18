import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== JAVA QUIZ APPLICATION =====");
            System.out.println("1. Start Quiz");
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                Quiz quiz = QuizManager.createQuiz();
                quiz.start();
                Result.show(quiz.score, quiz.questions.size());

            } else if (choice == 2) {
                System.out.println("\nAnswer each question using A, B, C or D.");
                System.out.println("Your score will be displayed at the end.");

            } else if (choice == 3) {
                System.out.println("Thank you for using the Quiz Application!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}