package chess;
import chess.*;
public class Space {
	public Piece piece;
	public int x;
	public int y;
	
	public Space(int x, int y, Piece piece) {
		this.setPiece(piece);
		this.setX(x);
		this.setY(y);
	}
	
	public void setPiece(Piece p) {
		this.piece = p;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Piece getPiece() {
		return this.piece;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
