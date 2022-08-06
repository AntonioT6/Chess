package chess;

public class Player {
	public String color;
	Piece[] pieces = new Piece[16];
	
	
	public Player(String color) {
		this.color = color; 
		// initialize array
		//pieces = (Piece) malloc(sizeof(Piece) * 16);
		for(int i = 0; i < 16; i++) {
			pieces[i] = new Piece();
		}
		makePieces(pieces);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void makePieces(Piece[] pieces) {
		int i;

		for(i = 0; i < 8; i++) {
			pieces[i].type = "Pawn";
		}
		
		pieces[8].type = "Rook";
		pieces[9].type = "Knight";
		pieces[10].type = "Bishop";
		pieces[11].type = "Queen";
		pieces[12].type = "King";
		pieces[13].type = "Bishop";
		pieces[14].type = "Knight";
		pieces[15].type = "Rook";
		
		return;
	}
}