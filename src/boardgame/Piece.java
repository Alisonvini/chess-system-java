package boardgame;

public class Piece {
	
	//# -> protected
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//somente classes dentro do mesmo pacote e subclasses vão poder acessar o tabuleiro de uma peça
	protected Board getBoard() {
		return board;
	}
	
	
	
}
