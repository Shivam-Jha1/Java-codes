package oOPS;
public class board {

	public char Board[][];
	public int boardSize = 3;
	public char player1symbol, player2symbol;
	public int count;

	public final static  int player1Wins = 1;
	public final static  int player2Wins = 2;
	public final static  int draw = 3;
	public final static  int invalid_move = 4;
	public final static  int incomplete = 5;

	public board(char player1symbol, char player2symbol) {

		Board = new char[boardSize][boardSize];
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				Board[i][j] = ' ';
			}
		}
		this.player1symbol = player1symbol;
		this.player2symbol = player2symbol;
	}

	public int move(char symbol, int x, int y) {

		if (x < 0 || x >= boardSize || y < 0 || y > boardSize || Board[x][y] != ' ') {
			return invalid_move;
		}
		Board[x][y] = symbol;
		count++;
		if (Board[x][0] == Board[x][1] && Board[x][1] == Board[x][2]) {
			return symbol == player1symbol ? player1Wins : player2Wins;
		}
		if (Board[0][y] == Board[1][y] && Board[1][y] == Board[2][y]) {
			return symbol == player1symbol ? player1Wins : player2Wins;
		}
		if (Board[0][0] != ' ' && Board[0][0] == Board[1][1] && Board[1][1] == Board[2][2]) {
			return symbol == player1symbol ? player1Wins : player2Wins;
		}
		if (Board[0][2] != ' ' && Board[0][2] == Board[1][1] && Board[1][1]==Board[2][0]) {
			return symbol == player1symbol ? player1Wins : player2Wins;
		}
		if (count == boardSize * boardSize) {
			return draw;
		}
		return incomplete;
	}

	public void print() {
		System.out.println("----------------");
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				System.out.print("| " + Board[i][j] + " |");
			}
			System.out.println();
		}
		// System.out.println(" ");
		System.out.println("---------------");
	}

}
