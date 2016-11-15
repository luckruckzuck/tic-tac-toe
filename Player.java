
public class Player {
	
	private static int number = 1;
	private int id;
	
	public Player(){
		id = ++number;
	}
	
	public int getId(){
		return id;
	}

}
