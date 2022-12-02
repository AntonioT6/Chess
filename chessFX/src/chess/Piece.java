package chess;
import chess.*;

public class Piece {
	public String type;
	private String color;
	boolean p_taken = false;
	
	public Piece(String type, String color, boolean p_taken) {
		this.setType(type);
		this.setColor(color);
		this.setTaken(p_taken);
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setTaken(boolean taken) {
		p_taken = taken;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public boolean getTaken() {
		return this.p_taken;
	}

}
