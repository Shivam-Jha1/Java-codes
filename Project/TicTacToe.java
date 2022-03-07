package Project;
import java.util.*;
public class TicTacToe {

	private Player player1,player2;
	private Board board;
	
	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();
		t.startGame();
	}

	public void startGame() {

		Scanner s = new Scanner(System.in);

		player1 = takeplayerinput(1);
		player2 = takeplayerinput(2);

		while(player1.getSymbol()==player2.getSymbol()) {
			System.out.println("Symbol already taken pick another one");
			char symbol = s.next().charAt(0);
			player2.setSymbol(symbol);
		}

		board = new Board(player1.getSymbol(),player2.getSymbol());
		boolean player1turn = true;

		int status = board.INCOMPLETE;
		while(status==board.INCOMPLETE || status == board.INVALID) {

			if(player1turn) {
				System.out.println("Player 1 "+player1.getName()+"'s turn");
				System.out.println("Enter X: ");
				int x = s.nextInt();

				System.out.println("Enter Y: ");
				int y = s.nextInt();

				status = board.move(player1.getSymbol(),x,y);

				if(status != board.INVALID) {

					player1turn = false;
					board.print();
				}
				else {
					System.out.println("Invalid Move , Try Again! ");
				}
			}
			else {

				System.out.println("Player 2 "+player2.getName()+"'s turn");
				System.out.println("Enter X: ");
				int x = s.nextInt();

				System.out.println("Enter Y: ");
				int y = s.nextInt();

				status = board.move(player2.getSymbol(),x,y);

				if(status != board.INVALID) {

					player1turn = true;
					board.print();
				}
				else {
					System.out.println("Invalid Move , Try Again! ");
				}
			}

		}
		
		
		if(status == board.PLAYER_1_WINS) {
			System.out.println("PLAYER 1 - "+player1.getName()+" WINS");
		}
		
		else if(status == board.PLAYER_2_WINS) {
			System.out.println("PLAYER 2 - "+player2.getName()+" WINS");
		}
		else {
			System.out.println("DRAW");
		}
	}

	private Player takeplayerinput(int num) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter player "+num+" name: ");
		String name = s.nextLine();

		System.out.println("Enter player "+num+" symbol: ");
		char symbol = s.next().charAt(0);

		Player p = new Player(name,symbol);
		return p;
	}
}
