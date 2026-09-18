public class Result {

    static void show(int score, int total) {
        double percentage = (score * 100.0) / total;

        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/" + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
}