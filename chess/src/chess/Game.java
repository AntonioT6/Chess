package chess;
import chess.*;

public class Game {

	public static void main(String[] args) {
		Player p_white = new Player("White");
		Player p_black = new Player("Black");
		
		
		System.out.println("Player 1 is " + p_white.color + " and " + p_white.pieces[10].type);
		System.out.println("Player 2 is " + p_black.color + " and " + p_black.pieces[10].type);
	}
}
