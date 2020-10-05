package ticTacToe;
import java.util.*;

public class TicTacToeGame {
	
	private char board[];
	private char player1;
	private char computer;
	/** Function to create board
	 * 
	 */
	private char[] createBoard()
	{
		board = new char[10];
		Arrays.fill(board, ' ');
		return board;
	}
	/**
	 * Assigning letter to the player
	 * as per their choice
	 */
	private void playerLetter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X or O as per your choice");
		player1 = sc.next().charAt(0);
		if(player1=='x')
			computer = 'o';
		else
			computer = 'x';
		sc.close();
	}

	public static void main(String[] args) {
		
		TicTacToeGame tic_tac_toe = new TicTacToeGame();
		char board[] = tic_tac_toe.createBoard();
		tic_tac_toe.playerLetter();
	}
}
