package chess;

public class Player {
	public String color;
	Piece[] pieces = new Piece[16];
	
	
	public Player(String color) {
		this.color = color; 
		// initialize array

		makePieces(pieces);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void makePieces(Piece[] pieces) {
		int i;
			for(i = 0; i < 8; i++) {
				pieces[i] = new pawn("Pawn", this.color, false);
			}
			
			pieces[8] = new Rook("Rook", this.color, false);
			pieces[9] = new Knight("Knight", this.color, false);
			pieces[10] = new Bishop("Bishop", this.color, false);
			pieces[11] = new Queen("Queen", this.color, false);
			pieces[12] = new King("King", this.color, false);
			pieces[13] = new Bishop("Bishop", this.color, false);
			pieces[14] =  new Knight("Knight", this.color, false);
			pieces[15] = new Rook("Rook", this.color, false);
		
	}
}