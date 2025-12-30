
import java.util.Random;

class StartGame {
    static Random r = new Random();

    // UC-2 Roll Dice
    public static int rollDice() {
        return r.nextInt(6) + 1; // 1 to 6
    }

    // UC-3 Check Case (No Play, Ladder, Snake)
    public static int checkCase(int position, int dice) {
        int option = r.nextInt(3) + 1; // 1-No Play, 2-Ladder, 3-Snake

        switch (option) {
            case 1: // No Play
                break;

            case 2: // Ladder
                if (position + dice <= 100) {
                    position += dice;
                }
                break;

            case 3: // Snake
                position -= dice;
                if (position < 0) {
                    position = 0;
                }
                break;
        }
        return position;
    }
}

public class SnakeAndLadder {
    public static void main(String[] args) {

        int player1Pos = 0;
        int player2Pos = 0;
        int diceCount1 = 0;
        int diceCount2 = 0;
        boolean playerOneTurn = true;

        System.out.println("🎲 Welcome to Snake and Ladder Game 🎲");

        while (player1Pos < 100 && player2Pos < 100) {

            int dice = StartGame.rollDice();

            if (playerOneTurn) {
                diceCount1++;
                player1Pos = StartGame.checkCase(player1Pos, dice);
                System.out.println("Player 1 rolled " + dice + " | Position: " + player1Pos);
            } else {
                diceCount2++;
                player2Pos = StartGame.checkCase(player2Pos, dice);
                System.out.println("Player 2 rolled " + dice + " | Position: " + player2Pos);
            }

            playerOneTurn = !playerOneTurn; // switch turn
        }

        // UC-6 Winner & Dice Count
        if (player1Pos == 100) {
            System.out.println("\nPlayer 1 Wins!");
            System.out.println("Dice rolls by Player 1: " + diceCount1);
        } else {
            System.out.println("\nPlayer 2 Wins!");
            System.out.println("Dice rolls by Player 2: " + diceCount2);
        }
    }
}