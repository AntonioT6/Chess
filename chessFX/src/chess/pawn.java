package chess;
import chess.*;

public class pawn extends Piece {
	String type;
	
	public pawn(String type, String color, boolean p_taken) {
		super(type, color, p_taken);
	}
	
	public String type() {
		return "Pawn";
	}
	
	
}
