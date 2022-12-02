package chess;
import chess.*;

public class Bishop extends Piece {
	String type;
	
	public Bishop(String type, String color, boolean p_taken) {
		super(type, color, p_taken);
	}
	
	public String getType() {
		return "Bishop";
	}
}
