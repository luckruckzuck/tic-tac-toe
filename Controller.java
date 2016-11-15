import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
	
	private Model model;
	private View view;
	private int[][] field;

	public Controller(Model model){
		this.model = model;
		// TODO wird die View im Controller erzeugt?!
		// this.view = new View(model, this);
	}
	
	// init gamefield
	public void init(){
		
		// init game field with 0
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				model.getGameField()[i][j] = 0;
			}
		}
		// tell model
		model.setGameField(field);
	}
	
	// FIXME WIth Player?
	public void doTurn(int[] playerrotation){
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
