package chess;
import chess.*;

public class Rook extends Piece {
	
	public Rook(String type, String color, boolean p_taken) {
		super(type, color, p_taken);
	}
	
	public String getType() {
		return "Rook";
	}
}