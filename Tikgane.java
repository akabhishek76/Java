import java.util.ArrayList;

public class TicTacToe {

  /** The game board, a 2D array of boolean values representing the game state.
  private boolean[][] board = new boolean[2][2];

  /** The player who is currently making moves.
  private Player player;

  /** The last move made by the player.
  private int lastMove;

  /** An AI that can make moves based on the current game state.
  private AI ai;

  /** Initializes the game board and sets the player to be 'X'.
  public void initialize(boolean[][] board, Player player) {
    board = new boolean[][]{
      {0, 0},
      {1, 0},
      {0, 1},
  };
    player = player.Player.X;
    lastMove = 0;
  }

  /** Makes a move by a player.
  public void makeMove(int row, int column) {
    board[row][column] = player.getPieces();
    lastMove = row;
  }

  /** Checks if the game is over.
  public boolean isGameOver() {
    return board[0][0] == board[1][0] && board[1][0] == board[2][0]
            || board[0][1] == board[1][1] && board[2][1] == board[0][1]
            || board[0][2] == board[1][2] && board[2][2] == board[0][0];
  }

  /** Provides a move for the AI, based on the current game state.
  public Move AIMove() {
    return ai.makeMove(board);
  }

  /** To get the next move from the AI, I'll repeatedly call this function until I get a valid move.
  while (AIMove() != null) {
    move = AIMove();
  }
  return move;
}

/**
 * This is the main method, where the game logic is executed.
 */
public static void main(String[] args) {
  Player player1 = new Player(player.Player.X);
  Player player2 = new Player(player.Player.O);

  // Initialize the game board and set the player to 'X'.
  initialize(board, player1);

  // While the game is still ongoing, I will loop through the user's moves and AI moves until a win is declared.
  while (game_over != true) {
    player1.makeMove();
    player2.makeMove();

    // Check if the game is over.
    if (isGameOver()) {
      System.out.println("The game is over. X player won!");
      return;
    }

    // Get the next move from the AI.
    move = AIMove();
    // If the AI makes a valid move, then I will execute the AIMove() function,
    // otherwise I will skip it and let the AI make the next move.
    if (move != null) {
      System.out.println("AI move: ");
      print(AIMove());
    } else {
      // The AI has made a bad move. I will simply ignore it and let the AI
      // make the next move.
      continue;
    }
  }

  // The game is over, so I will print the winner.
  System.out.println("X player won!");
}
  
