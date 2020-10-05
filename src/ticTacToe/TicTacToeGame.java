package ticTacToe;
import java.util.*;

public class TicTacToeGame {
	
	char board[];
	void board()
	{
		board = new char[10];
		Arrays.fill(board, ' ');
	}

	public static void main(String[] args) {
		
		TicTacToeGame obj = new TicTacToeGame();
		obj.board(); 

	}

}
