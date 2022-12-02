[===
UKL<>package application;
L.


import chess.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	public static Stage stage; 
	private Parent root;
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		try {
			Game newGame = new Game();
			newGame.Game();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/Board/Board.fxml"));
			root = (Parent) loader.load();	
			Scene scene = new Scene(root);

			primaryStage.setTitle("Chess");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
