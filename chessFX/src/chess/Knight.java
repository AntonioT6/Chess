package chess;
import chess.*;

public class Knight extends Piece {
	String type;
	
	public Knight(String type, String color, boolean p_taken) {
		super(type, color, p_taken);
	}
	
	public String getType() {
		return "Knight";
	}
}