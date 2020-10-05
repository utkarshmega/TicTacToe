package com.capgemini.tictactoe;

import java.util.*;

public class TicTacToeGame {

	private char board[];
	private char player;
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
		player = sc.next().charAt(0);
		if (player == 'x')
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
				System.out.print("_" + board[temp] + "_ | ");
			}
			System.out.println();
		}

	}

	/**
	 * To validate input of player's move
	 */
	private boolean userInputMoveValidate(int inpMove) {

		if (inpMove > 0 && inpMove < 10 && board[inpMove] == ' ') {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * To make the move after the validaton is done
	 */
	private void makeMove() {
		System.out.println("Enter the position number where you want to play the move");
		int userMoveIndex = sc.nextInt();
		if (userInputMoveValidate(userMoveIndex)) {
			board[userMoveIndex] = player;
			showBoard();
		} else {
			System.out.println("Invalid move entered");
		}
	}

	/**
	 * To randomly decide who plays first
	 */
	private void whoseTurn() {
		int randomToss = (int) (Math.random() * 10 % 2);
		int heads = 0;
		int tails = 1;
		if (randomToss == heads)
			System.out.println("Player plays first");
		else
			System.out.println("Computer plays first");
	}

	/**
	 * Conditions to check the winnings cases
	 */
	private boolean winningConditions() {
		/* Horizontal line validation */
		if ((board[1] == 'x' && board[2] == 'x' && board[3] == 'x')
				|| (board[1] == 'o' && board[2] == 'o' && board[3] == 'o'))
			return true;
		else if ((board[4] == 'x' && board[5] == 'x' && board[6] == 'x')
				|| (board[4] == 'o' && board[5] == 'o' && board[6] == 'o'))
			return true;
		else if ((board[7] == 'x' && board[8] == 'x' && board[9] == 'x')
				|| (board[7] == 'o' && board[8] == 'o' && board[9] == 'o'))
			return true;
		/* Vertical line validation */
		else if ((board[1] == 'x' && board[4] == 'x' && board[7] == 'x')
				|| (board[1] == 'o' && board[4] == 'o' && board[7] == 'o'))
			return true;
		else if ((board[2] == 'x' && board[5] == 'x' && board[8] == 'x')
				|| (board[2] == 'o' && board[5] == 'o' && board[8] == 'o'))
			return true;
		else if ((board[3] == 'x' && board[6] == 'x' && board[9] == 'x')
				|| (board[3] == 'o' && board[6] == 'o' && board[9] == 'o'))
			return true;
		/* diagonal validation */
		else if ((board[1] == 'x' && board[5] == 'x' && board[9] == 'x')
				|| (board[1] == 'o' && board[5] == 'o' && board[9] == 'o'))
			return true;
		else if ((board[7] == 'x' && board[5] == 'x' && board[3] == 'x')
				|| (board[7] == 'o' && board[5] == 'o' && board[3] == 'o'))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		TicTacToeGame tic_tac_toe = new TicTacToeGame();
		char board[] = tic_tac_toe.createBoard();
		tic_tac_toe.playerLetter();
		tic_tac_toe.showBoard();
		tic_tac_toe.makeMove();
		tic_tac_toe.whoseTurn();

	}
}
