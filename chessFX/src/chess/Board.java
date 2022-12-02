package chess;
import chess.*;

public class Board {
	Space[][] board = new Space[8][8];
	
	public Board() {
		
		this.startBoard();
	}
	
	public void startBoard() {
		int i,j;
		Player p_white = new Player("White");
		Player p_black = new Player("Black");
		
		for(i = 0; i < 8; i++) {
			board[0][i] = new Space(0, i, p_white.pieces[i+8]);
		}
		
		for(i = 0; i < 8; i++) {
			board[1][i] = new Space(1, i, p_white.pieces[i]);
		}
		
		for(i = 2; i < 6; i++) {
			for(j = 0; j < 8; j++) {
				board[i][j] = new Space(i, j, new Piece("Blank", "Blank", false));
			}
		}
		for(i = 0; i < 8; i++) {
			board[7][i] = new Space(0, i, p_black.pieces[i+8]);
		}
		
		for(i = 0; i < 8; i++) {
			board[6][i] = new Space(1, i, p_black.pieces[i]);
		}
		
		for(i = 0; i < 8; i++) {
			for(j = 0; j < 8; j++) {
				System.out.print(board[i][j].piece.type + " ");
			}
			System.out.println("");
		}
		/*board[0][0] = new Space(0, 0, new Rook("Rook", p_white, false));
		board[0][1] = new Space(0, 1, new Knight("Knight", p_white, false));
		board[0][2] = new Space(0, 2, new Bishop("Bishop", p_white, false));
		board[0][3] = new Space(0, 3, new Queen("Queen", p_white, false));
		board[0][4] = new Space(0, 4, new King("King", p_white, false));
		board[0][5] = new Space(0, 5, new Bishop("Bishop", p_white, false));
		board[0][6] = new Space(0, 5, new Knight("Knight", p_white, false));
		board[0][7] = new Space(0, 5, new Rook("Rook", p_white, false));
		
		board[7][0] = new Space(0, 0, new Rook("Rook", p_black, false));
		board[7][1] = new Space(0, 1, new Knight("Knight", p_black, false));
		board[7][2] = new Space(0, 2, new Bishop("Bishop", p_black, false));
		board[7][3] = new Space(0, 3, new Queen("Queen", p_black, false));
		board[7][4] = new Space(0, 4, new King("King", p_black, false));
		board[7][5] = new Space(0, 5, new Bishop("Bishop", p_black, false));
		board[7][6] = new Space(0, 5, new Knight("Knight", p_black, false));
		board[7][7] = new Space(0, 5, new Rook("Rook", p_black, false));
		*/
	}
}
