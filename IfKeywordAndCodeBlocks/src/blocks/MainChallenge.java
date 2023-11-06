package blocks;

public class MainChallenge {

    public static int calculateHighScorePosition(int score) {
        int result = 0;

        if (score >= 1000) {
            result = 1;

        } else if (score >= 500) {
            result = 2;
        }

        else if (score >= 100) {
            result = 3;
        }

        else {
            result = 4;
        }

        return result;
    }

    
    
    
    
    
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " manasged to get into position " + position + " on the high score list");
    }

    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Conall", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Fergal", highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Martin", highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Bert", highScore);

        highScore = calculateHighScorePosition(25);
        displayHighScorePosition("Bob", highScore);

        

        /*
         * //psvm - public static void main - shortcut boolean gameOver = true; int
         * score = 800; int levelCompleted = 5; int bonus = 100;
         * 
         * int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
         * System.out.println("The highScore is " + highScore);
         * 
         * score = 10000; levelCompleted = 8; bonus = 200;
         * 
         * System.out.println("The next highScore is " + calculateScore(gameOver, score,
         * levelCompleted, bonus));
         * 
         * }
         */

    }
}
