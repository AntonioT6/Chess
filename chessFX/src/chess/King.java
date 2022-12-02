package chess;
import chess.*;

public class King extends Piece {
	String type;
	
	public King(String type, String color, boolean p_taken) {
		super(type, color, p_taken);
	}
	
	public String getType() {
		return "King";
	}
}
