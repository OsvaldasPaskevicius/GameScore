import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);

            System.out.println("Your final score: " + finalScore);
        }
    }
}