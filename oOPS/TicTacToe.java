package oOPS;
import java.util.*;

public class TicTacToe {

	private  player player1;
	private  player player2;

	private board Board;

	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		t.startGame();
	}

	public void startGame() {

		Scanner s = new Scanner(System.in);
		player1 = takeplayerinput(1);
		player2 = takeplayerinput(2);

		while (player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Player 1 and 2 symbol must be different please Enter any other symbol");

			char symbol = s.next().charAt(0);
			player2.setSymbol(symbol);
		}
		Board = new board(player1.getSymbol(), player2.getSymbol());
		boolean player1turn = true;

		int status = Board.incomplete;
		while (status == Board.incomplete || status == board.invalid_move) {

			if (player1turn) {
				System.out.println("Player 1 " + player1.getName() + "'s turn");
				System.out.println("Enter x co-ordinate");
				int x = s.nextInt();

				System.out.println("Enter y coordinate");
				int y = s.nextInt();

				status = Board.move(player1.getSymbol(), x, y);
				if (status != board.invalid_move) {
					player1turn = false;
					Board.print();
				} else {
					System.out.println("Invalid move Try again");
				}
			} else {
				System.out.println("Player 2 " + player2.getName() + "'s turn");
				System.out.println("Enter x coordinate");
				int x = s.nextInt();

				System.out.println("Enter y coordinate");
				int y = s.nextInt();

				status = Board.move(player2.getSymbol(), x, y);
				if (status != board.invalid_move) {
					player1turn = true;
					Board.print();
				} else {
					System.out.println("Invalid move try again");
				}
			}
		}
		if (status == board.player1Wins) {
			System.out.println("Player 1 " + player1.getName() + " wins");
		}
		else  if (status == board.player2Wins) {
			System.out.println("Player 2 " + player2.getName()+ " wins");
		} else {
			System.out.println("DRAW");
		}
	}

	private player takeplayerinput(int num) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter player " + num + " name");
		String name = sc.nextLine();

		System.out.println("Enter player " + num + " symbol");
		char symbol = sc.next().charAt(0);

		player p = new player(name, symbol);
		return p;

	}
}
