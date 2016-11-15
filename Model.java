import java.util.Observable;


/*
 * Abwechselnd X und O auf 3x3 Feld. 
 * Win: 3 horizontal, vertikal oder diagonal
 * 
 * Nach jedem Zug soll geprüft werden, ob Spieler gewonnen hat
 */

public class Model extends Observable{
	
	// Gamefield represented by 0 for unused, 1 for player one and 2 for player two
	private int[][] gameField;
	
	/*
	 * 0 -> first player; length -> last player. NOw only has length 2
	 */
	private int[] playerrotation;
	

	public Model(){
		this.gameField = new int[3][3];
		this.playerrotation = new int[2];
	}
	
	// Set mark at certain position x,y (y saves the ones)
	public void setAtPosition(int x, int y){
		this.gameField[x][y] = 1;
	}
	
	// FIXME return player-id?
	// Returns -1 if no winner was detected
	public int checkWinner(){
		
		// Check horizontally
		for(int i = 0; i < 3; i++){
			if(this.gameField[i][0] == 1 && this.gameField[i][1] == 1 && this.gameField[i][2] == 1){
				return 1;
			}else if(this.gameField[i][0] == 2 && this.gameField[i][2] == 2 && this.gameField[i][1] == 2){
				return 2;
			}			
		}
		
		// Check vertically
		for(int j = 0; j < 3; j++){
			if(this.gameField[0][j] == 1 && this.gameField[1][j] == 1 && this.gameField[2][j] == 1){
				return 1;
			}else if(this.gameField[0][j] == 2 && this.gameField[1][j] == 2 && this.gameField[2][j] == 2){
				return 2;
			}
			
		}
		
		// Check diagonally 
		// FIXME this could go wrong
		for(int p = 1; p <= 2; p++){
			if(this.gameField[0][0] == p && this.gameField[1][1] == p && this.gameField[2][2] == p){
				return p;
			}
			
		}
		
		// No winner detected
		return -1;
	
	}
	
	public int[][] getGameField() {
		return gameField;
	}
	
	public void setGameField(int[][] gameField) {
		this.gameField = gameField;
	}
}
