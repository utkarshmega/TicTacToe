package ticTacToe;

import java.util.*;

public class TicTacToeGame {

	private char board[];
	private char player1;
	private char computer;
	private final Scanner sc = new Scanner(System.in);

	/**
	 * Function to create board
	 * 
	 */
	private char[] createBoard() {
		board = new char[10];
		Arrays.fill(board, ' ');
		return board;
	}

	/**
	 * Assigning letter to the player as per their choice
	 */
	private void playerLetter() {
		
		System.out.println("Enter X or O as per your choice");
		player1 = sc.next().charAt(0);
		if (player1 == 'x')
			computer = 'o';
		else
			computer = 'x';
	}

	/**
	 * Showing the board for users to choose their position
	 */
	private void showBoard() {
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				++temp;
				System.out.print("_" +board[temp]+"_ | ");
			}
			System.out.println();
		}

	}

	/**
	 * To take input of player's move
	 */
	private void userInputPosition() {

		System.out.println("Enter the position number where you want to play the move");
		int user_pos = sc.nextInt();
		if (board[user_pos] == ' ') {
			board[user_pos] = player1;
		} else {
			System.out.println("The positon is already occupied!! Please try again");
			userInputPosition();
		}
	}

	public static void main(String[] args) {

		TicTacToeGame tic_tac_toe = new TicTacToeGame();
		char board[] = tic_tac_toe.createBoard();
		tic_tac_toe.playerLetter();
		tic_tac_toe.showBoard();
		tic_tac_toe.userInputPosition();
	}
}
