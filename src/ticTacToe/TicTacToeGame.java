package ticTacToe;

import java.util.*;

public class TicTacToeGame {

	private char board[];
	private char player1;
	private char computer;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X or O as per your choice");
		player1 = sc.next().charAt(0);
		if (player1 == 'x')
			computer = 'o';
		else
			computer = 'x';
		sc.close();
	}

	/**
	 * Showing the board for users to choose their position
	 */
	private void showBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("_ | ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		TicTacToeGame tic_tac_toe = new TicTacToeGame();
		char board[] = tic_tac_toe.createBoard();
		tic_tac_toe.playerLetter();
		tic_tac_toe.showBoard();
	}
}
