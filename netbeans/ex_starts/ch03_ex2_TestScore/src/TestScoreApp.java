import java.util.Scanner;

public class TestScoreApp
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        double scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);
        
        int minScore = 100;
        int maxScore = 0;
        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            
            // accumulate score count and score total
            if (testScore <= 100)
            {
                if (minScore > Math.min(minScore, testScore)){
                    minScore = testScore;
                }
                if (maxScore < Math.max(maxScore, testScore)){
                    maxScore = testScore;
                }
                scoreCount += 1;
                scoreTotal += testScore;
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        // display the score count, score total, and average score
        double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + averageScore + "\n"
                        + "Min Score: " + minScore + "\n"
                        +"Max Score: " + maxScore + "\n";
        System.out.println(message);
    }
}