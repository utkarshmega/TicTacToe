package com.capgemini.tictactoe;

import java.util.*;

public class TicTacToeGame {

	private char board[];

	/**
	 * Function to create board
	 * 
	 */
	private void createBoard() {
		board = new char[10];
		Arrays.fill(board, ' ');
	}

	public static void main(String[] args) {

		TicTacToeGame tic_tac_toe = new TicTacToeGame();
		tic_tac_toe.createBoard();
	}
}
