package com.tictactoe;
import java.util.Scanner;
public class TicTacToeGame {
	static  char[] board = new char[10];
	private static char cross ='X';
	private static char zero ='O';
	private static char playerSymbol;
	private static char computerSymbol;
// created character array
	 public static char[]  creatingBoard() {


		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;

	} 
	 private static void Choosesymbol()
	 {
		 int symbol = (int) Math.floor(Math.random() * 10) % 2;
		 if(symbol == 0 ) {
		 System.out.println("player can symbol X or O you want to choose");
		 Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		playerSymbol = input.charAt(0);
		
		if(playerSymbol == cross)
		{
			playerSymbol = cross;
			computerSymbol = zero;
			System.out.println("player symbol is : " + playerSymbol);
			System.out.println("computerSymbol is : " + computerSymbol);
		}
		else if(playerSymbol == zero)
		{
			playerSymbol = zero;
			computerSymbol = cross;
			System.out.println("player symbol is : " + playerSymbol);
			System.out.println("computerSymbol is : " + computerSymbol);
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		 }
		else {
			 System.out.println("computer can choose symbol X or O you want to choose");
			 Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			computerSymbol = input.charAt(0);
			
			if(computerSymbol == zero)
			{
				playerSymbol = cross;
				computerSymbol = zero;
				System.out.println("player symbol is : " + playerSymbol);
				System.out.println("computerSymbol is : " + computerSymbol);
			}
			else if(computerSymbol == cross)
			{
				playerSymbol = zero;
				computerSymbol = cross;
				System.out.println("player symbol is : " + playerSymbol);
				System.out.println("computerSymbol is : " +computerSymbol);
			}
			else
			{
				System.out.println("Invalid input");
			}
		 
		} 
	 }
	 
	// taking position from player where he wants to put his input
		public static void playerMove()
		{
			System.out.println("Enter the empty position(between 1-9) where you wants to make the move ");
			Scanner sc = new Scanner(System.in);
			int position = sc.nextInt();
			if(position>=1 && position <=9)
			{
			if(board[position]==' ')
			{
				board[position] = playerSymbol;
				showBoard();
			}
			else
			{
				System.out.println("Invalid move, position is not empty");
			}
			}
			else
			{
				System.out.println("You entered a invalid position");

			}
		

		}


 
// main class
	public static void main(String args[]) {

		System.out.println("Welcome to tic tac board");
		board=creatingBoard();
		Choosesymbol();
		playerMove();

	}
}
