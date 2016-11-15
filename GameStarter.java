
public class GameStarter {

	public GameStarter(){
		
		//FIXME does the view need model and controller?
		Model model = new Model();
		Controller controller = new Controller(model);
		View view = new View(model, controller);
	}
}
