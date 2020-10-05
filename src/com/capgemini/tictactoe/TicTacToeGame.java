package com.capgemini.tictactoe;

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
			board[userMoveIndex] = player1;
			showBoard();
		} else {
			System.out.println("Invalid move entered");
		}
	}

	public static void main(String[] args) {

		TicTacToeGame tic_tac_toe = new TicTacToeGame();
		char board[] = tic_tac_toe.createBoard();
		tic_tac_toe.playerLetter();
		tic_tac_toe.showBoard();
		tic_tac_toe.makeMove();
	}
}
