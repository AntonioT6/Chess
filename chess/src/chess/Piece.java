package chess;
import chess.*;

public class Piece {
	public String type;
	private Player player;
	
	public void setValue(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
