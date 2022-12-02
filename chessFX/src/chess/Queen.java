package chess;
import chess.*;

public class Queen extends Piece {
	String type;
	
	public Queen(String type, String color, boolean p_taken) {
		super(type, color, p_taken);
	}
	
	public String getType() {
		return "Queen";
	}
}